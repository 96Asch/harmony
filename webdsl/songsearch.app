module songsearch


template songSearchInput(editors : {User}, query : String, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool) {
  request var newQuery := query  
   
  action OnSearch() {
    replace(ph, songSearch(newQuery, ph, searchPublic, multipleAllowed));
  }
  
 form {
    label("Add a song:")[class="d-block text-start mr-2"] {
      input( newQuery )[class="form-control", oninput=OnSearch()]
    }
  }
}

template songButtonBar(editors : {User}, song : Song, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool) {
  
  action RemoveSong(e : {User}, s : Song) {
    tempFormData.songs.remove(s);
    replace(ph, songSearch("", ph, searchPublic, multipleAllowed)); 
  }
  
  div[class="w-100 d-flex justify-content-end"] {
    div[class="btn-group"] {
       submitlink RemoveSong(tempFormData.admins, song)[class="btn border btn-close"] { 
       }
    }
  }
}

function filterQuery(song : Song, searchPublic : Bool, multipleAllowed : Bool) : Bool {
  var ownerIsPrincipal := song.owner == principal;
  var publicCanBeSearched := searchPublic && song.public;
  var shouldBeUnique := multipleAllowed || !(song in tempFormData.songs);
  
  return  (ownerIsPrincipal || publicCanBeSearched) && shouldBeUnique;
}

ajax template songSearch(query : String, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool) {
  
  action AddSong(editors : {User}, song : Song) {
    tempFormData.songs.add(song);
    replace(ph, songSearch("", ph, searchPublic, multipleAllowed)); 
  }
  
 
  div[class="row"] {
    div[class="col-sm col-md-4"] {
     
      songSearchInput(tempFormData.admins, query, ph, searchPublic, multipleAllowed)
      
      if (query != "") {
        div[class="list-group carddims overflow-400"] {
          for( song in searchSong(query + "*", 5) where filterQuery(song, searchPublic, multipleAllowed)) {
            submitlink AddSong(tempFormData.admins, song) { 
              div[class="list-group-item"] {
                span { "~song.title - ~song.subtitle" }
                if (song in tempFormData.songs) {
                  span[class="badge rounded-pill bg-info"] { "Added" }
                }
              }
            }
          }
        }
      }
      
    }
    
    div[class="col-sm col-md"] {
      div[class="searchheader p-2 fw-bold"] {
        "Songs: "
      }
      div[class="list-group card card-body carddims overflow-400"] {
        for (song in tempFormData.songs) {
          div[class="list-group-item"] {
            SongCard(song)
            songButtonBar(tempFormData.admins, song, ph, searchPublic, multipleAllowed)
          }
        }  
      }
    }
    
  }
}

access control rules

rule template songButtonBar  (editors : {User}, song : Song, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool) { principal in editors } 
rule template songSearchInput (editors : {User}, query : String, ph : Placeholder, searchPublic : Bool, multipleAllowed : Bool) { principal in editors }

rule ajaxtemplate songSearch(*) { true }

rule action AddSong    (editors : {User}, user : User) { principal in editors }
rule action RemoveSong (editors : {User}, user : User) { principal in editors }
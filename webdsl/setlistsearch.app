module setlistsearch

template slSearchInput(editor : User, query : String, ph : Placeholder) {
  request var newQuery := query  
   
  action OnSearch() {
    replace(ph, slSearch(newQuery, ph));
  }
  
 form {
    label("Enter the setlist to remove:")[class="d-block text-start mr-2"] {
      input( newQuery )[class="form-control", oninput=OnSearch()]
    }
  }
}

template slButtonBar(editor: User, setlist : SetList, ph : Placeholder) {
  
  action RemoveSetList(e : {User}, s : SetList) {
    tempFormData.setlists.remove(s);
    replace(ph, slSearch("", ph)); 
  }
  
  div[class="w-100 d-flex justify-content-end"] {
    div[class="btn-group"] {
       submitlink RemoveSetList(tempFormData.admins, setlist)[class="btn border btn-close"] { 
       }
    }
  }
}

ajax template slSearch(query : String, ph : Placeholder) {
  
  action AddSetList(editors : User, setlist : SetList) {
    tempFormData.setlists.add(setlist);
    replace(ph, slSearch("", ph)); 
  }
  
 
  div[class="row"] {
    div[class="col-sm col-md-4"] {
     
      slSearchInput(principal, query, ph)
      
      if (query != "") {
        div[class="list-group carddims overflow-400"] {
          for( setlist in searchSetList(query + "*", 5) where setlist.owner == principal ) {
            submitlink AddSetList(setlist.owner, setlist) { 
              div[class="list-group-item"] {
                span { "~setlist.title" }
                if (setlist in tempFormData.setlists) {
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
        "Setlists to remove: "
      }
      div[class="list-group card card-body carddims overflow-400"] {
        for (setlist in tempFormData.setlists) {
          div[class="list-group-item"] {
            SetListCard(setlist)
            slButtonBar(setlist.owner, setlist, ph)
          }
        }  
      }
    }
    
  }
}

access control rules

rule template slButtonBar  (editor : User, setlist : SetList, ph : Placeholder) { principal == editor } 
rule template slSearchInput (editor : User, query : String, ph : Placeholder) { principal == editor }

rule ajaxtemplate slSearch(*) { true }

rule action AddSetList    (editor : User, user : User) { principal == editor }
rule action RemoveSetList (editor : User, user : User) { principal == editor }
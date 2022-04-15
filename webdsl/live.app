module live

service expire-cache getMP3( song: Song ){
  song.refTrack.download();
}

page Live(setlist : SetList, index : Int) {
  head {
    Bootstrap
    GlobalCSS
    includeCSS("dashboard.css")
  }
  
  var pageIndex : Int := index
  
  action OnNextSong() {
     pageIndex := pageIndex + 1;
     if (pageIndex >= setlist.songs.length) {
       pageIndex := 0;
     }
     
    return Live(setlist, pageIndex);
  }
  
  action OnPrevSong() {
     pageIndex := pageIndex - 1;
     if (pageIndex < 0) {
       pageIndex := setlist.songs.length-1;
     }
     
    return Live(setlist, pageIndex);
  }
  
  <div class="container">
    DashHeaderWaves
    Header(setlist.title)
	  <div class="row d-flex justify-content-center front">
	    SongViewer(setlist.songs[pageIndex] ) 
	  </div>
	  
	  <div class="row modal-footer d-flex justify-content-center front">
	     if (setlist.songs.length > 1) {
		     div[class="w-25 btn-group"] {
				   submitlink OnPrevSong() [class="btn btn-primary p-3"] {
		         "<"
		       } 
				   submitlink OnNextSong() [class="btn btn-primary p-3"] {
				     ">"
				   } 
			   }
		   }
	  </div>
	  DashFooterWaves
  </div>

   ChoInterpreterJS
   BootstrapJS
}

template SongOutputFields(song : Song) {
  div[class="card p-4"] {
    
    div[class="card-body"] {
      
      div[class="card-title row mb-1"] {
        h4[class="col"] {
           "~song.title"
        }
        h4[class="col d-flex justify-content-end"] {
          output(song.key)
        }
      }

      h5[class="card-subtitle text-muted mb-2"] {
        ~song.subtitle
      }
      
      div[class="row mb-1"] {
        div[class="col"] {
          "BPM:"
        }
        div[class="col d-flex justify-content-end"] {
          output(song.bpm)
        }
      }
      
      div[class="row mb-1"] {
        div[class="col"] {
          "Time Signature:"
        }
        div[class="col d-flex justify-content-end"] {
          "~song.timeSignature1 / ~song.timeSignature2"
        }
      }
      
      div[class="row mb-1"] {
        div[class="col"] {
          "Genre:"
        }
        div[class="col d-flex justify-content-end"] {
          "~song.genre"
        }
      }
      
    }
    
  }
}

template AudioPlayer(song : Song) {
  <audio class="w-100 p-2" controls="true" src=navigate(getMP3(song))>
    "Your browser does not support the"
    <code>"audio"</code> "element."
  </audio>
}

template SongViewer(song : Song) {  
  <div class="container h-100">
    <div class="row">
        <div class="col-12 col-md-3">
           SongOutputFields(song)
        </div>
        <div class="col-12 col-md-9">
          div[class="row"] {
            div[class="rendering-target w-100 h-100"] {}
          }
          div[class="row"] {
            AudioPlayer(song)
          }
        </div>
    </div>
  </div>
  
  <div class="d-none" id="choInput">
      input(song.chordRaw)
  </div>
}

template Header(title : String) {

     div[class="row pt-3 mb-2 front"] {
        div[class="col p-2 d-flex align-items-center"] {
          h3[class="ml-4 text-uppercase"] { ~title }
        }
        
        div[class="col p-2 d-flex justify-content-end align-items-center"] {
           submitlink action { return Dashboard(); }[class="btn btn-danger m-3"] { "Back" }
        }
     }
   
}


access  control rules
rule page Live(setlist : SetList, index : Int) { principal in setlist.members } 
rule ajaxtemplate SongViewer(song : Song) { true }
rule page getMP3(*) { true }
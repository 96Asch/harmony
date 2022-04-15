module remove

imports bootstrap
imports setlistsearch

page RemoveSetlists {
  
  head {
    Bootstrap
    GlobalCSS
    includeCSS("dashboard.css")
  }
  
  action OnCancel() {
    return Dashboard();
  }
  
  div[class="container"] {
   DashHeaderWaves
   Header
   
   div[class="row vh-50"] {
    placeholder ph { slSearch("", ph) }
   }
   
   ConfirmRemoveSLModal("deleteSL")
   
   div[class="btn-group"] {
     submitlink OnCancel()[class="btn btn-primary p-2"] { "Cancel" } 
      <button class="btn btn-danger ml-3 p-2" type="button" data-bs-toggle="modal" data-bs-target="#deleteSL">
        image("/images/trash.png")[class="button-icon"]
      </button>
   }
   
   DashFooterWaves
  }
  BootstrapJS
  
}

page RemoveSongs {
  
  head {
    Bootstrap
    GlobalCSS
    includeCSS("dashboard.css")
  }
  
  action OnCancel() {
    return Dashboard();
  }
  
  div[class="container"] {
   DashHeaderWaves
   Header
   
   div[class="row vh-50"] {
    placeholder ph { songSearch("", ph, false, false) }
   }
   
   ConfirmRemoveSongModal("deleteSong")
   
   div[class="btn-group"] {
     submitlink OnCancel()[class="btn btn-primary p-2"] { "Cancel" } 
      <button class="btn btn-danger ml-3 p-2" type="button" data-bs-toggle="modal" data-bs-target="#deleteSong">
        image("/images/trash.png")[class="button-icon"]
      </button>
   }
   DashFooterWaves
  }
  BootstrapJS
  
}

access control rules

rule page RemoveSetlists() { true }
rule page RemoveSongs() { true }
module confirmmodal
imports entities

template ConfirmRemoveModal(modalId : String) {
  action OnClear() {
    for (noti : Notification where noti.receiver == securityContext.principal)  {
      noti.delete();
    }
  }
 
  div[class="modal fade", id=modalId, tabindex="-1"] {
     div[class="modal-dialog modal-dialog-centered"] {
        div[class="modal-content w-100 "] {
          
          <div class="modal-header d-flex justify-content-center">
          <h5 class="modal-title">"Clear all notifications"</h5>
          </div>
  
          div[class="modal-body"] { 
            h5[class="fw-bold"] {
              "This will permanently remove all notifications"   
            }
            h6[class="text-muted"] {
              "You can be invited again"
            }
          }
          
          div[class="modal-footer"] {
            submitlink OnClear()
            [class="btn btn-danger"] { "Dismiss all" }
          }
        
        }
     }
  }
}

template ConfirmRemoveSongModal(modalId : String) {
  action OnDelete() {
    for (song in tempFormData.songs) {
      
      for (sl : SetList where song in sl.songs) {
        while (song in sl.songs) {
          sl.songs.remove(song);
        }
      }
      
      while (song in tempFormData.songs) {
        tempFormData.songs.remove(song);
      }
      song.delete();
    }
    
    return Dashboard();
  }
 
  div[class="modal fade", id=modalId, tabindex="-1"] {
     div[class="modal-dialog modal-dialog-centered"] {
        div[class="modal-content w-100"] {
          
          <div class="modal-header d-flex justify-content-center">
          <h5 class="modal-title">"Remove all selected songs"</h5>
          </div>
  
          div[class="modal-body"] { 
            h5[class="text-muted"] {
              "This will permanently delete all selected songs!"   
            }
            h6[class="fw-bold"] {
              "This is not reversible!"
            }
          }
          
          div[class="modal-footer"] {
            submitlink OnDelete()
            [class="btn btn-danger"] { "Delete" }
          }
        
        }
     }
  }
}


template ConfirmRemoveSLModal(modalId : String) {
  
  action OnDelete() {
    for (sl in tempFormData.setlists) {
	    for (n : Notification where n isa SetListInvitation && (n as SetListInvitation).toJoin == sl) {
	      n.delete();
	    }
	    tempFormData.setlists.remove(sl);
      sl.delete();
    }
    return Dashboard();
  }
  
  div[class="modal fade", id=modalId, tabindex="-1"] {
     div[class="modal-dialog modal-dialog-centered"] {
        div[class="modal-content w-100"] {
          
          <div class="modal-header d-flex justify-content-center">
          <h5 class="modal-title">"Remove selected setlists?"</h5>
          </div>
  
          div[class="modal-body"] { 
            h5[class="text-muted"] {
              "This will permanently delete them"   
            }
            h6[class="fw-bold"] {
              "This is not reversible!"
            }
          }
          
          div[class="modal-footer"] {
              <button class="btn btn-primary" data-bs-dismiss="modal">
                "Back"
              </button>
            submitlink OnDelete()
            [class="btn btn-danger"] { "Delete" }
          }
        
        }
     }
  }
}

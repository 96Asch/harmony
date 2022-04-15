module dashboard

principal is User with credentials username, password
imports entities
imports bootstrap
imports dashmodal
imports live
imports confirmmodal
imports remove
imports waves

page Dashboard() {
   
  head {
    Bootstrap
    GlobalCSS
    includeCSS("dashboard.css")
  }
  
  init {
    tempFormData.clear();
  }

   div[class="container"] {
      DashHeaderWaves
      Header
    
	     div[class="row front"] {
	        div[class="col-12 col-sm-12 col-md-4 col-lg-4"] {
	          Notifications
	        }
	         
	        div[class="col-12 col-sm-12 col-md-4 col-lg-4"] {
	          Songs(ph)
	        }
	        
	        div[class="col-12 col-sm-12 col-md-4 col-lg-4"] {
	          SetLists(ph)
	        }
	     }
     
      ConfirmRemoveModal("clearNotification")
     
	    <div class="modal fade modal-tall" id="phModal" tabindex="-1">
	       <div class="modal-dialog modal-lg">
	         placeholder ph { }
	       </div>
	    </div>
	    
	   DashFooterWaves
   }
   

   
   ChoInterpreterJS
   BootstrapJS
}


template Notifications() {
  
  var username := principal.username
  var notifications := from Notification as n where n.receiver.username = ~username
    
  div[class="row border rounded cardheader ps-1 pe-1"] {
   div[class="col"] {
     h5[class="p-2"] {
        "Notifications"             
     }
   }
   
  div[class="col d-flex justify-content-end"] {   
     if (notifications.length > 0) {
        <button class="btn btn-danger header-button mt-1 mb-1 p-2" type="button" data-bs-toggle="modal" data-bs-target="#clearNotification">
           image("/images/trash.png")[class="button-icon"]
        </button>
     }        
   }   
 }
 
 div[class="row"] {
   div[class="card card-body carddims overflow-500"] {
    div[class="list-group "] {
      for (notification in notifications) {
        div[class="row list-group-item"] {
          if (notification isa SetListInvitation) {
             NotificationContent(notification as SetListInvitation) 
          }                    
        }
      }
    }
   }
 }
       
     
}

template NotificationContent(si : SetListInvitation) {
  
  action OnNotificationAccept() {
	  if (si.isAdmin) {
	    si.toJoin.admins.add(principal);
	  }
	  si.toJoin.pending.remove(principal);
	  si.toJoin.members.add(principal);
	  si.toJoin.save();
	  si.delete();
  }
  
  action OnNotificationReject() {
    si.toJoin.pending.remove(principal);
    si.delete();
  }

  div[class="card-header setlistinvite"] {
    "@~si.sender.username has invited you"  
  }
  
  div[class="card-body"] {
	  h5[class="card-title"] {
	    output(si.toJoin.title)
	  }
	  
	  h6[class="card-subtitle text-muted"]{
	    output(si.dateSent)
	  }
	  
	  block[class="card-text"] {
	     output(si.message)
	  }
	  
	  div[class="d-flex justify-content-end"] {
	   div[class="btn-group", role="group"] {
	     submitlink OnNotificationAccept()
	     [class="btn btn-success"] { image("/images/check.png")[class="invite-icon"] } 
	     submitlink OnNotificationReject()
	     [class="btn btn-danger"] { image("/images/cross.png")[class="invite-icon"] } 
	   }
	  }
  }
}

template SongCard(song : Song) {
    <div class="card-title row">
      <h5 class="col">output(song.title)</h5>
      <h5 class="col text-end">output(song.key)</h5>
    </div>
    <div class="card-subtitle border-bottom border-2">
      <h6 class="text-muted">output(song.subtitle)</h6>
    </div>
    <div class="card-text row">
      <span class="col"> "BPM:" </span>
      <span class="col text-end"> output(song.bpm) </span>
    </div>
    <div class="card-text row">
      <span class="col"> "Time Signature:" </span>
      <span class="col text-end"> output(song.timeSignature1) "/" output(song.timeSignature2) </span>
    </div>
}

template Songs(ph : Placeholder) {
  var username := securityContext.principal.username
  var songs :=  from Song as s where s.owner.username = ~username
  
  action OnShowSongAdd(p : Placeholder) {
    replace(p, AddSongModal);
    runscript("initRendering();");
  }
  
  action OnShowSongEdit(s : Song, p : Placeholder) {
    replace(p, EditSongModal(s));
    runscript("initRendering();");
  }
  
  action OnDelete() {
    tempFormData.admins := {principal};
    return RemoveSongs();
  }
  
	div[class="row border rounded cardheader ps-1 pe-1"] {
	  div[class="col"] {
	    h5[class="p-2"] { "My Songs" }
	  }
	   
	  div[class="col d-flex justify-content-end"] {
      submitlink OnDelete()
      [class="btn btn-danger header-button mt-1 mb-1 p-2"] 
      { image("/images/trash.png")[class="button-icon"] }
      
	    submitlink OnShowSongAdd(ph)
	    [class="btn btn-primary header-button mt-1 mb-1 p-2", data-bs-toggle="modal", data-bs-target="#phModal"] 
	    { image("/images/new.png")[class="button-icon"] }
	  }   
	}
	 
	div[class="row", id="songCard"] {
	   div[class="card card-body carddims overflow-500"] {
	     div[class="list-group"] {
	       
	       for (song in songs) {
	         submitlink OnShowSongEdit(song, ph)
	         [class="list-group-item list-group-item-action", id=song.id,  data-bs-toggle="modal", data-bs-target="#phModal"] { 
	           SongCard(song)
	         }
	       }
	       
	     }
	   }
	 }
 
}

template SetListCard(setlist : SetList) {
  <div class="card-body"> 
	  <div class="card-title">
	    <h5> ~setlist.title </h5>
	  </div>
	  <div class="card-subtitle text-muted">
	     "Songs: ~setlist.songs.length"
	  </div>
	  <div class="card-text row">
	    <div class="col"> "Members:" </div>
	    <div class="col">output(setlist.members.length)</div>
	  </div>
	  <div class="card-text row">
      <div class="col"> "Due:" </div>
      <div class="col">output(setlist.deadline)</div>
    </div>
  </div>
}

template SetLists(ph : Placeholder) {
  
   var u : User := securityContext.principal
   var setLists :=  [setlist | setlist in (from SetList) where u in setlist.members]
   
   action ShowSetListAdd(p : Placeholder) {
	   tempFormData.users := {principal};
	   tempFormData.admins  := {principal};
	   replace(p, AddSetListModal);   
   }
   
   action ShowSetListEdit(p : Placeholder, sl : SetList) {
	   tempFormData.songs   := sl.songs;
	   tempFormData.users   := sl.members;
	   tempFormData.admins  := sl.admins;
	   tempFormData.pending := sl.pending;
	   replace(p, EditSetListModal(sl));
   }
   
   action OnDelete() {
     return RemoveSetlists();
   }
   
   div[class="row border rounded cardheader ps-1 pe-1"] {
     div[class="col"] {
       h5[class="p-2"] {
          "My Setlists"            
       }
     }
     
     div[class="col d-flex justify-content-end"] {
        submitlink OnDelete()
        [class="btn btn-danger header-button mt-1 mb-1 p-2 pl-2 pr-2"] 
        { image("/images/trash.png")[class="button-icon"] }
        
        submitlink ShowSetListAdd(ph)
        [class="btn btn-primary header-button mt-1 mb-1 p-2", data-bs-toggle="modal", data-bs-target="#phModal"] 
        { image("/images/new.png")[class="button-icon"] }
     }   
   }
   
   div[class="row"] {
      div[class="card card-body carddims overflow-500"] {
        div[class="list-group"] {
          for (setlist in setLists) {
			       submitlink ShowSetListEdit(ph, setlist)
			       [class="list-group-item list-group-item-action", data-bs-toggle="modal", data-bs-target="#phModal"] { 
			         SetListCard(setlist)
			       }     
          }
        }
      }
   }
   
   
}

template Header(){

  action OnLogout() {
    logout(); 
    return root();
  }  

  div[class="row pt-3 mb-2 front"]{
     div[class="col p-2 d-flex align-items-center"]{
        h3[class="ml-4 text-uppercase"] {
          "Dashboard"
        }
     }
    
     div[class="col p-2 d-flex justify-content-end align-items-center"] {
        
        div[class="userheader p-2 rounded"] {
	        image(getRandomAvatar())[class="icon"]
	        span[class="username"] {
	          "@~securityContext.principal.username"
	        }
	        submitlink OnLogout()
	        [class="btn btn-danger m-3"] { image("/images/logout.png")[class="button-icon"] }
        }
     }
  }
   
}

access control rules
 
rule page Dashboard() { loggedIn() }

module dashmodal

imports usersearch
imports songsearch
imports confirmmodal
imports entities
imports waves

template modalButton(editor : User, text : String, modalId : String) {
   <button class="btn btn-danger mt-1 mb-1" type="button" data-bs-toggle="modal" data-bs-target="#" + modalId data-bs-dismiss="modal">
   ~text
   </button>
}

function hasExtension(file : String, ext : [String]) : Bool {
  var split : [String] := file.split(".");
  if (split.length > 1 && split.get(split.length - 1) in ext) {
    return true;
  }
  return false;
}

template SongView(song : Song) {
   <div class="container h-100">
    <div class="row h-100">
      <div class="col-md-6 hidden-print" id="choInput">
        label("Enter ChordPro Markup") { 
          input(song.chordRaw)[class="w-100 h-100 border border-3"] 
        }
      </div>
      <div class="col-md-6">
        <label>"Output:"</label>
        <div class="rendering-target w-100 h-100"></div>
      </div>
    </div>
  </div>
}

template SongFields(song : Song) {
  
  label("Title:")  [class="d-block text-start"] { input(song.title) [class="form-control"] {
    validate(song.title != "", "Title cannot be empty") 
  }}
  
  label("Subtitle:")  [class="d-block text-start"] { input(song.subtitle) [class="form-control"] }
  
  div[class="row"] {
    span[class="col-12 col-md-5"] {
        label("BPM:")    [class="d-block text-start"] { input(song.bpm)   [class="form-control",  maxlength="3"] {
			    validate(song.bpm > 0, "Beats per minute cannot be 0")
			    validate(song.bpm < 400, "Beats per minute cannot exceed 400")
			  }}
    }
    span[class="col-12 col-md-7"] {
        label("Time Signature:") [class="d-block text-start"] { 
          span[class="d-flex"] {
	          input(song.timeSignature1) [class="form-control",  maxlength="2"]
	          input(song.timeSignature2) [class="form-control",  maxlength="2"]
          }
        }
    }
    
  }

  
  label("Key:")    [class="d-block text-start"] { input(song.key)   [class="form-control"] {
    validate(song.key != null, "Key cannot be null")   
  }}
  
  label("Genre:")  [class="d-block text-start"] { input(song.genre) [class="form-control"] }
 
  label("Reference Track:")    [class="d-block text-start"] { input(song.refTrack)   [class="form-control"] }
 
  <div class="form-check form-check-inline">
  label("Public:") [class="form-check-label"] { input(song.public)[class="form-check-input"] }
  </div>
}

ajax template AddSongModal() {
    var song := Song{ owner := principal }
    
    action OnSongSave(s : Song) {
		  validate(s.refTrack != null, "You must upload a reference track");
		  validate(hasExtension(s.refTrack.fileName(), ["mp3"]), "Reference Track must be in mp3 format");
		  s.save();
		}
    
    div[class="modal-content"] {
      ModalHeaderSplit
      <div class="modal-header border-3 d-flex justify-content-center front">
      <h3 class="modal-title"> "Add Song" </h3>
      </div>
      <div class="modal-body front">
      
      form {
        <div class="row">
          <div class="col-12 col-md-4 border-end border-3">
          
            SongFields(song)
            
            <div class="mt-3 d-flex justify-content-center border-top border-3">
	            submitlink OnSongSave(song)
	            [class="btn btn-primary p-3 mt-2"]
	            { image("/images/save.png")[class="button-icon"] }
            </div> 
            
          </div>
          <div class="col-12 col-md-8">
            SongView(song)
          </div>
        </div>  
      }
      
      </div> 
    }
}

ajax template EditSongModal(song : Song) {

  action OnSongSave(s : Song) {
    validate(s.refTrack != null, "You must upload a reference track");
    validate(hasExtension(s.refTrack.fileName(), ["mp3"]), "Reference Track must be in mp3 format");
    s.save();
  }
  
  div[class="modal-content "] {
    ModalHeaderSplit
    <div class="modal-header border-3 d-flex justify-content-center front">
    <h3 class="modal-title"> "Edit Song" </h3>
    </div>
    <div class="modal-body front">
    
    form {
      <div class="row">
        <div class="col-12 col-md-4 border-end border-3">
        
		      SongFields(song)
		      
		      <div class="mt-3 d-flex justify-content-center border-top border-3">
	          submitlink OnSongSave(song)
	          [class="btn btn-primary p-3 mt-2"]
	          { image("/images/save.png")[class="button-icon"] }
          </div>
        </div>
        <div class="col-12 col-md-8">
          SongView(song)
        </div>
      </div>  
    }
    
    </div> 
  }
  
}

function getPendingMembers(setlist : SetList) : {User} {
  return [user | user in tempFormData.users where !(user in setlist.members)].set();
}

function getNonPendingMembers(setlist : SetList) : {User} {
  return [user | user in tempFormData.users where user in setlist.members].set();
}

function getNonPendingAdmins(setlist : SetList) : {User} {
  return [user | user in tempFormData.admins where user in setlist.members].set();
}

function SendSLInvite(sl : SetList, pendingMembers : {User}, pendingAdmins : {User}) {
	 for (user in pendingMembers where user != principal) {
	
	   sl.pending.add(user);
	   SetListInvitation { sender := sl.owner, receiver := user, 
                         type := invitation,
                         message := sl.description,
                         dateSent := today(),
                         toJoin := sl, isAdmin := (user in pendingAdmins) }.save();
	 }
}

template SetListFields(setlist : SetList) {
  label("Title:")  [class="d-block text-start"] { 
    input(setlist.title) [class="form-control"] {
      validate(setlist.title != "", "Title cannot be empty") 
    }
  }
  
  label("Short description:") [class="d-block text-start"] { 
    input(setlist.description) [class="form-control", prompt="Optional"]
  }
  
  label("Setlist Deadline:")  [class="d-block text-start"] { 
    input(setlist.deadline) [class="form-control"] {
      validate(setlist.deadline != null, "You must set a deadline for this setlist")
      validate(setlist.deadline.after(today()), "Deadline must be later than today")
    }
  }
}
   
ajax template AddSetListModal() {
   var setlist : SetList := SetList{ owner := principal, deadline:=today().addDays(1) }
   
   action OnSave(sl : SetList) {
     sl.songs.addAll(tempFormData.songs);
     sl.admins.add(principal);
     sl.members.add(principal);
     SendSLInvite(sl, tempFormData.users, tempFormData.admins);
     sl.save();
   }
   
  div[class="modal-content"] {
    ModalHeaderSplit
    div[class="modal-header border-3 front"] {
      <h3 class="modal-title"> "Add New Setlist" </h3>
    }
    
    div[class="modal-body row front"] {
      
      div[class="col-12 col-md-4 border-end border-3"] {
       form {
       
          SetListFields(setlist)
          
          <div class="mt-3 d-flex justify-content-center border-top border-3">
             submitlink OnSave(setlist)[class="btn btn-primary p-3 mt-2"] 
             { image("/images/save.png")[class="button-icon"] }
          </div>
        }
      }
      

      div[class="col-12 col-md-8 front"] {
        placeholder memberPh { userSearch(principal, "", memberPh) }
        placeholder songPh { songSearch("", songPh, true, true)  }
      }
      
    }
  }
}


ajax template EditSetListModal(setlist : SetList) {
  var nonPendingMembers : {User}
  var nonPendingAdmins  : {User}
  var pendingMembers    : {User}
  
  action OnSave(sl : SetList) {
     sl.songs.clear();
     sl.songs.addAll(tempFormData.songs);
     
     nonPendingAdmins  := getNonPendingAdmins(setlist);
     nonPendingMembers := getNonPendingMembers(setlist);
     pendingMembers    := getPendingMembers(setlist);
     
     sl.admins.clear();
     sl.admins.addAll(nonPendingAdmins);

     sl.members.clear();  
     sl.members.addAll(nonPendingMembers);
     
     SendSLInvite(sl, pendingMembers, tempFormData.admins);
     sl.save();
   }
   
  action OnLive() {
     return Live(setlist, 0);
  }  div[class="modal-content"] {

  div[class="modal-content"] {
    ModalHeaderSplit
    
    div[class="modal-header border-3 front"] {
      span[class="col-12 col-md-6"] {
        h3[class="modal-title"] { "Edit Setlist ~setlist.title" }
      }
      span[class="col-12 col-md-6 d-flex justify-content-end"] {
        submitlink OnLive()[class="btn btn-success p-2"] {"Go Live" } 
      }
    }
    
    div[class="modal-body row front"] {
      
      div[class="col-12 col-md-4 border-end border-3"] {
       form {
       
          SetListFields(setlist)
          
          <div class="mt-3 d-flex justify-content-center border-top border-3">
             submitlink OnSave(setlist)[class="btn btn-primary p-3 mt-2"] 
             { image("/images/save.png")[class="button-icon"] }
          </div>
        }
      }
      

      div[class="col-12 col-md-8 front"] {
        placeholder memberPh { userSearch(setlist.owner, "", memberPh) }
        placeholder songPh { songSearch("", songPh, true, true)  }
      }
        
      
    }
  }
  }
  
  
}


override template errorTemplateInput( messages: [String] ){
  elements
  <div class="col-6">
  for( ve in messages )
  {
      <div class="row">
        span[ style := "color: #FF0000" ]{
          text(ve)
        }
      </div>
  }
  </div>
}

access control rules

rule template modalButton(editor : User, text : String, modalId : String) { editor == principal }

rule ajaxtemplate AddSongModal() { true }
rule ajaxtemplate EditSongModal(song : Song) { song.owner == principal }
rule ajaxtemplate AddSetListModal() { true }
rule ajaxtemplate EditSetListModal(setlist : SetList) { 
  true 
  rule action OnSave(setList : SetList) { principal == setList.owner || principal in setList.admins }
  // rule action OnDelete(setList : SetList) { principal == setList.owner }
  rule action OnLive() { true }
}

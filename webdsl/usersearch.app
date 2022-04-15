module usersearch

template removeMemberButton(editor : User, user : User, isShown: Bool, ph : Placeholder) {
  
  action RemoveUser(e : User, u : User) {
    tempFormData.admins.remove(u);
    tempFormData.users.remove(u);
    replace(ph, userSearch(editor, "", ph)); 
  }
  if (editor != user && isShown) {
    submitlink RemoveUser(editor, user)[class="btn btn-close"] {}
  }
}

template adminButton(editor : User, user : User, isShown : Bool, interactible : Bool, ph : Placeholder) {
  
  action AddAdmin(e : User, u : User) {
    tempFormData.admins.add(u);
    replace(ph, userSearch(editor, "", ph)); 
  }
  
  action RemoveAdmin(e : User, u : User) {
    tempFormData.admins.remove(u);
    replace(ph, userSearch(editor, "", ph)); 
  }
  
  if (isShown) {
  
    if (interactible && editor != user) {
      if (user in tempFormData.admins) {
        submitlink RemoveAdmin(editor, user)
        [class="badge rounded-pill bg-success"] { "Admin" }
      }
      else {
        submitlink AddAdmin(editor, user)
        [class="badge rounded-pill bg-danger"] { "Admin" }
      }
    }
    else {
       label("Admin")[class="badge rounded-pill bg-success disabled w-100"]
    }  
    

  }
  
}

template memberButtonBar(editor : User, user : User, ph : Placeholder)  {

  var interactible := editor == principal
  var isShown := (user in tempFormData.admins || interactible) && !(user in tempFormData.pending)
  
  div[class="btn-group", role="group"] {
    if (user == editor) {
      label("Owner")[class="badge rounded-pill bg-info w-100"]
    }
    
    if (user in tempFormData.pending) {
      label("Pending")[class="badge rounded-pill bg-warning w-100"]
    }
    
    adminButton(editor, user, isShown, interactible, ph)
    removeMemberButton(editor, user, isShown, ph)
   
  } 
}


template userSearchInput(editor : User, query : String, ph : Placeholder) {
  request var newQuery := query
  
  action OnSearch(e : User) {
    replace(ph, userSearch(editor, newQuery, ph));
  }
  
  form {
    label("Add a member:")[class="d-block text-start mr-2"] {
      input( newQuery )[class="form-control", oninput=OnSearch(editor)]
    }
  }
}

template userCard(user : User, owner : User, ph : Placeholder) {
	div[class="list-group-item"] {
    div[class="row"] {
      div[class="col-sm col-md-7"] {
       "@~user.username" 
      }
      
      div[class="col-sm col-md-5 d-flex justify-content-end"] {
        memberButtonBar(owner, user, ph)
      }
    }
  }
}


ajax template userSearch(owner : User, query : String, ph : Placeholder) {
    
  action AddUser(editor : User, user : User) {
    if (!(user in tempFormData.pending)) {
      tempFormData.users.add(user);
    }
    replace(ph, userSearch(owner, "", ph)); 
  }
  
  div[class="row mb-2"] {
    div[class="col-sm col-md-4"] {
      
      userSearchInput(owner, query, ph)
      
      if (query != "") {
        div[class="list-group carddims overflow-200"] {
          for( user in searchUser(query + "*", 5) 
              where user != principal && !(user in tempFormData.pending)) {
            submitlink AddUser(owner, user) { 
              div[class="list-group-item"] {
                span[class="fw-bold"] { "@" }
                span { ~user.username }
              }
            }
          }
        }
      }
      
    }
    
    div[class="col-sm col-md"] {
      
      div[class="searchheader p-2 fw-bold"] {
        "Members: "
      }
      
      div[class="list-group carddims overflow-200"] {
        for (user in tempFormData.users) {
          userCard(user, owner, ph)
        }
        
        for (user in tempFormData.pending) {
          userCard(user, owner, ph)
        }  

      }
    }
    
  }
  
}

access control rules

rule template removeMemberButton  (editor : User, user : User, isShown : Bool, ph : Placeholder) { editor == principal } 
rule template userSearchInput (editor : User, query : String, ph : Placeholder) { editor == principal }

rule ajaxtemplate userSearch(*) { true 
  rule action AddUser (editor : User, user : User) { editor == principal }
  rule action OnSearch(editor : User) { editor == principal }
}

rule action RemoveUser (editor : User, user : User) { editor == principal }


application harmony

imports entities
imports dashboard
imports bootstrap
imports waves
imports api

access control rules
rule page root() { true }
rule ajaxtemplate Login(*) { true }
rule ajaxtemplate Register(*) { true }

section Main

page root {
   
  head {
	  Bootstrap
	  GlobalCSS
	  RootCSS
  }
  
  init {
	  if (loggedIn()) {
	     return Dashboard();
	  }
  }
  
  div[class="container pt-5"] {
      RootHeaderWaves
      div[class="front row d-flex justify-content-center text-center mt-4 mb-4"] {

        header { "Harmony" }
        h3 { "Organize your band rehearsals" }
      }
      
      div[class="row d-flex justify-content-center text-center mt-4 mb-4"] {
	        
        div[class="d-flex justify-content-center"] {
	        <button type="button" class="btn btn-primary w-25" data-bs-toggle="modal" data-bs-target="#login">
				  "Register or Sign in"
			    </button>			  
			  }
			  
			  
			  div[class="modal fade", id="login", tabindex="-1"] {
           div[class="modal-dialog modal-dialog-centered"] {
              div[class="modal-content w-100"]
              {
                placeholder ph { Login(ph) }  
              }
           }
        }
      }
      

    
    
    
      div[class="row mt-5 mb-4 mr-8 ml-8"] { 
	      block { 
          <span class="highlight">"Organize"</span>
          " your arrangements, pieces and songs in one place. "

	        <span class="highlight">"Share"</span> 
	        " your music with friends, band members and musicians all over the world. "

	         <span class="highlight">"Optimize"</span>
          " your rehearsals and private practice with all the sheets and tracks to help you grow your musical skills."
	      }
	    }
    
    
  
     RootFooterWaves

	  
  }
  
  BootstrapJS
}

ajax template Login(ph : Placeholder) {
  var uname : String
  var pass : Secret
  var remember := false
  
  div[class="modal-header justify-content-center"] {
    h3[class="modal-title"] {
      "Log in"
    }  
  }
    
  div[class="model-body"] {
    form[class="p-4"] {

      label("Username:")    [class="d-block text-start"] { input(uname)   [placeholder="username", class="form-control"] }
      label("Password:")    [class="d-block text-start"] { input(pass)    [class="form-control"] {
         validate(pass.length() >= 8, "Password needs to be at least 8 characters")
      }}
      <div class="form-check form-check-inline">
      label("Remember me:") [class="form-check-label"] { input(remember)[class="form-check-input"] }
      </div>
      <div class="d-block">
	    submitlink action { 
	      getSessionManager().stayLoggedIn := remember;
		    validate( authenticate( uname, pass), "The login credentials are not valid." );
		    return Dashboard();
	    }[class="btn btn-primary p-2 m-1 mt-3 ml-3 w-50"] {"Log in"}
	    </div>
    }
  }
 
  
  div[class="model-footer p-3"] { 
    div[class="text-right"] {
      "Not yet a user? Register "
      submitlink action {
        replace(ph, Register(ph));
      }{ "here." } 
    }
  }
}



ajax template Register(ph : Placeholder) {
    var uname : String := ""
    var email : Email := ""
    var pass : Secret := ""
  

    div[class="modal-header justify-content-center"] {
      h3[class="modal-title"] {
        "Sign up"
      }  
    }
      
    div[class="model-body"] {
      form[class="p-3"] {
        label("Username:")[class="d-block text-start" ]{ input(uname) [placeholder="username", class="form-control" ] }
        label("Email:")   [class="d-block text-start"] { input(email) [placeholder="example@email.com", class="form-control"] }
        label("Password:")[class="d-block text-start"] { input(pass)  [class="form-control"] }
          
        submitlink action { 
          User {
            username := uname
            email := email
            password := pass.digest()
          }.save();
        }[class="btn btn-primary p-2 m-1 mt-3 ml-3 w-50"] {"Sign up"}
      }
      
	  }
   
    
    div[class="model-footer p-3"] { 
      div[class="text-right"] {
	      "Already a user? Sign in "
        submitlink action {
          replace(ph, Login(ph));
        }{ "here." } 
      }
    }
}

module bootstrap

template Bootstrap 
{
  // https://getbootstrap.com/docs/5.0/getting-started/introduction/#starter-template

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  
}

template BootstrapJS
{
  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
}

template ChoInterpreterJS
{
  includeJS( IncludePaths.jQueryJS() )
  includeJS("chordproInterpreter.js")
}

template GlobalCSS() {
  <style>
   body {
	    color : white;
	    background-color : rgb(44, 52, 61);
   }
   
   .front {
	    position : relative;  
	    z-index: 1000;
   }
   
   .modal-content {
      background-color: rgb(37 42 46);
   }
   
   .modal-header {
      background-color: rgb(0 0 0 / 53%);
   }
   
   .form-control {
      color: #edeff1;
      background-color: #3c3c3c;
      border: 2px solid #232628;
   }
   
   .card {
	    background-color: rgb(39 46 56);
	    border: 3px solid rgb(44 52 61);
   }
   
   .card-body {
      padding: 0 0.4rem 0rem 0rem;
   }
   
   .border {
		  border: 3px solid #2c343d!important;
	 }
	 
	 .wav-header {
	    position: absolute;
	    top: 0;
	    left: 0;
	    width: 100%;
	    overflow: hidden;
	    line-height: 0;
	    
   }
	
	 .wav-header svg {
	    position: relative;
	    display: block;
	    width: calc(100% + 1.3px);
	    height: 96px;
	 }
	 
	 .split-top {
	    position: absolute;
	    top: 0;
	    left: 0;
	    width: 100%;
	    overflow: hidden;
	    line-height: 0;
		}
		
		.split-top svg {
		    position: relative;
		    display: block;
		    width: calc(177% + 1.3px);
		    height: 301px;
		}
		
		.split-top .shape-fill {
		    fill: rgb(20, 128, 101);
		}
		
		.searchheader {
      	background-color: rgb(0 0 0 / 20%);	 
      	border-top-left-radius: 0.25rem;
        border-top-right-radius: 0.25rem; 
		}

    .list-group-item {
		    color: whitesmoke;
		    background-color: rgb(37 48 64);
    }
   
  </style>
}

template RootCSS() {
  <style>
   input {
     max-width: 200px;
   }
  
  .highlight {
    font-size: 1.5em;
    text-transform: uppercase;
    color: #4CAF50;
  }
  
  block {
    font-size: 2rem;
  }
  
  .waves-top {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    overflow: hidden;
    line-height: 0;
	}
	
	.waves-top svg {
	    position: relative;
	    display: block;
	    width: calc(100% + 1.3px);
	    height: 96px;
	}
	
	.waves-top .shape-fill {
	    fill: rgb(25 135 84);
	}
	
	.waves-bottom {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    overflow: hidden;
    line-height: 0;
    transform: rotate(180deg);
	}
	
	.waves-bottom svg {
	    position: relative;
	    display: block;
	    width: calc(125% + 1.3px);
	    height: 65px;
	    transform: rotateY(180deg);
	}
	
	.waves-bottom .shape-fill {
	    fill: rgb(25 135 84);
	}
  
  </style>
}

template DashCSS() {
  <style>
  
  </style>
}

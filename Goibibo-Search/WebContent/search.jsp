<!DOCTYPE html>
<html>
    <head>
        <title>search</title>
         <link href="search.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <link href="https://fonts.googleapis.com/css?family=Cedarville+Cursive|Tomorrow|Solway:500&display=swap" rel="stylesheet">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.js" ></script>
        <script src="text/javascript" src="JS/jquery-1.4.2.min.js"></script>
        <script>
        jQuery(function()){
            $("text").autocomplete("suggest.jsp");
            }
        </script>
    </head>
    <body class="container">
    <audio src="audio.mp3" control loop autoplay style="display:none"></audio>
     <%
     response.setHeader("cache-control","no-cache,no-store,must-reValidate");
     
    if(session.getAttribute("myEmail")==null){
    	response.sendRedirect("formproject.html");
    }
    %>
        <div class ="header">WELCOME &nbsp ${name}</div>
        <div class ="box">
            <form action="se">
                <span ><input id="txt" type="text" name="qry"></span>
                <span><select name="option" id="op">
                    <option value="video">video</option>
                    <option value="music">music</option>
                    <option value="books">books</option>
                    <option value="movies">movies</option>
                </select>
                </span>
                <span><button class="btn btn-success">SEARCH</button></span>
            </form>
            <br>
            <br>
            <h2 style='margin-left:150px'>FLIGHT SEARCH</center></h2>
            <br/>
             <form action="fl">
                <span ><input id="from" type="text" name="from" placeholder="From"></span>&nbsp
                  <span ><input id="to" type="text" name="to" placeholder="to"></span>&nbsp
                    <span ><input id="date" type="date" name="date" placeholder="Date"></span>
                </span>
                <span><button class="btn btn-success">SEARCH</button></span>
                
                
                
            </form>
        </div>
        <div><center>
        <form action="hs">
        <input type="submit"  class ="btn btn-primary" value="History">
        </form>
        </br>
        <form action="Logout">
       
       <input   class="btn btn-primary"  type="submit" value="Logout">
       </form> 
        
        </center>
        </div>
       
    </body>
</html>

=<%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <title>search</title>
         <link href="search.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
        <link href="https://fonts.googleapis.com/css?family=Cedarville+Cursive|Tomorrow|Solway:500&display=swap" rel="stylesheet">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.js" ></script>
        <style>
        table,td,tr,th{
        border-style:solid;
        border-size:1px;
        color:red;
        border-color:black;
        font-size:30px;
        padding:30px;
        margin-left:50px;
        }
        th{
        color:black;
        
        
        
        }
        
        
        </style>
    </head>
    <body class="container">
     <%
     response.setHeader("cache-control","no-cache,no-store,must-reValidate");
     
    if(session.getAttribute("myEmail")==null){
    	response.sendRedirect("/search.jsp");
    }
    %>
        <div class ="header">WELCOME &nbsp ${name}</div>
        <div class ="box">
       <table>
       <tr>
       <th>Inputs</th>
       <th><center>Time</center></th></tr>
       <tr>
       <td>
<%
  List<String> li = (List<String>)request.getAttribute("text");
	for( String temp : li){
		out.println("<a href=\'https://www.youtube.com/results?search_query="+temp+"\'>"+temp+"</a><span><p>   </p></span>");
	}
%>
</td>
 <td>
<%
  List<String> ll = (List<String>)request.getAttribute("time");
	for( String temp1 : ll){
		out.println(temp1+"<span><p>  </p></span>");
	}
%>
</td>

</tr>
</table>
 </form>
        <form action="search.jsp">
       
       <input  class="btn btn-primary"  type="submit" value="Back">
       </form> 
     
           
        </div>
      
        
        
    </body>
</html>

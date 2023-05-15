<%-- 
    Document   : logic
    Created on : Jun 1, 2021, 5:37:24 PM
    Author     : kavi
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <script src="https://code.iconify.design/1/1.0.7/iconify.min.js"></script>
        <style>
             body {
        padding: 0px;
        margin: 0;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        box-sizing: border-box;
        background: linear-gradient(to right, #56ab2f, #a8e063);
        
    }
    a
    {
        color:lime;
    }
    .child
    {
        float: left;
        width: 25%;
    }
            table {
        background-color: #fff;
        width: 50%;
	border-collapse: collapse;
    }
    
    table td,table th{
  padding:12px 15px;
  border:1px solid #ddd;
  text-align: center;
  font-size:16px;
}
    
    tr {
        transition: all .2s ease-in;
        cursor: pointer;
    }
    .iconify { color: #ffcf00; }
    th,
    td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    #header {
        background-color: #16a085;
        color: #fff;
    }
    tr:hover {
        background:linear-gradient(to right, #40e0d0, #ff8c00, #ff0080);
        transform: scale(1.02);
        border: 1px solid black;
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
    }
    div
    {
        margin: 10px;
        padding: 10px;
    }
    .child1
    {
        display: flex;
        justify-content: center;
    }
    .child2
    {
        display: flex;
        justify-content: center;
    }
    @media(max-width: 500px){
	table thead{
		display: none;
	}
        th
        {
            
        }
	table, table tbody, table tr, table td{
		display: grid;
		width: 80%;
	}
	table tr{
		margin-bottom:15px;
	}
	table td{
		padding-left: 12%;
		position: relative;
	}
	table td::before{
		content: '';
		position: absolute;
		left:0;
		width: 50%;
		padding-left:15px;
		font-size:15px;
		font-weight: bold;
		text-align: left;
	}
        
        .Submit
        {
            background-color: darkgreen;
            
        }
}
        </style>
    </head>
    <body>
        <h1>Hello World!</h1><br>
        <form action="logic.jsp">
            <div>Product:<input type="text" name="p" required=""><br>
            Product Category:<select name="cat" required="" id="cat">
                <option value="">Choose...</option>
                <option value="mobile">Mobile</option>
                <option value="mobile">Laptop</option>
                <option value="mobile">Camera</option>
                <option value="mobile">TV</option>
                <option value="mobile">Washing Machine</option>
                <option value="mobile">AC</option>
                <option value="mobile">Geysers</option>
                <option value="mobile">Sewing Machines</option>
                <option value="mobile">Fridge</option>
                <option value="acc">Others</option>
                
            </select>
            <input type="submit" class="Submit" value="Click">
            </div>
            </form>
        <%
            
             String s=request.getParameter("p");
             String opt=request.getParameter("cat");
             String mobile="mobile";
             String acc="acc";
             if(s!=null)
             {
                 s=s.replaceAll("\\s","+");
            String url="https://www.flipkart.com/search?q="+s+"\"";
                 Document doc=Jsoup.connect(url).get();
               int i;
            Elements ele=doc.select("div._4rR01T");//mobile,laptops,camera,tv,washing machines,AC,Geysers,sewing machines,fridge
          
            Elements ele1=doc.select("a.s1Q9rs");//Mobile accessories,computer parts,kitchen appliances,toys
            //
            Elements price1=doc.select("div._30jeq3._1_WHN1"); 
            
            Elements price2=doc.select("div._30jeq3"); 
            out.print("<div>");
            out.print("<div class='child1'>");
            //out.print("<div>");
            out.print("<table>");
            out.print("<tr><th><span class='iconify' data-icon='simple-icons:flipkart' data-inline='false'></span>FLIPKART RESULT'S</th><th><a href='"+url+"' target='_blank'>Visit Page</th></tr>");
            out.print("<tr id='header'>");
            out.print("<th>Product Name</th><th>Price</th></tr>");
            if(opt.equals(mobile))
            {
            for(i=0;i<6;i++)
            {
                String st=price1.get(i).html().toString();
                String sub=st.substring(0,st.length());
                out.print("<tr> <td>"+ele.get(i).html()+"</td><td>"+sub+"</td></tr>");
            }
            }
            else if(opt.equals(acc))
            {
                for(i=0;i<6;i++)
            {
                String st=price2.get(i).html().toString();
                String sub=st.substring(0,st.length());
                out.print("<tr> <td>"+ele1.get(i).html()+"</td><td>"+sub+"</td></tr>");
            }
                
            }
            out.print("</table>");
            out.print("");
            out.print("</div>");
            out.print("<div class='child2'>");
            
            out.print("<table>");
            String url2="https://www.amazon.in/s?k="+s+"";
            out.print("<tr><th><span style='color:#b21f1f;' class='iconify' data-icon='mdi-amazon' data-inline='false'></span>AMAZON RESULT'S</th><th><a href='"+url2+"' target='_blank'>Visit Page</th></tr>");
            
            out.print("<tr id='header'>");
            out.print("<th>Product Name</th><th>Price</th></tr>");
            //String url2="https://www.amazon.com/s?k="+s+"&language=en_US&currency=INR";
            
        
            Document docu=Jsoup.connect(url2).userAgent("Chrome/90.0").get();
            Elements e=docu.select("span.a-size-medium.a-color-base.a-text-normal");
            Elements ealt=docu.select("span.a-size-base-plus.a-color-base.a-text-normal");
            Elements el=docu.select("span.a-offscreen");
            //out.print("<tr><td><a href='"+url2+"'>Click</td></tr>");
            if(opt.equals(mobile))
            {
            for(i=0;i<6;i++)
            {
                
                    out.print("<tr> <td>"+e.get(i).text()+"</td><td>"+el.get(i).text()+"</td></tr>");
            }
            }
            else
            {
                for(i=0;i<6;i++)
            {
                
                    out.print("<tr> <td>"+ealt.get(i).text()+"</td><td>"+el.get(i).text()+"</td></tr>");
            }
            }
            out.print("</table>");
            out.print("</div>");
            
            out.print("</div>");
            
             }
             
        %>
        
       
    </body>
</html>

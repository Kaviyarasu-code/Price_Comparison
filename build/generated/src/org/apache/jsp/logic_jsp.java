package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public final class logic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://code.iconify.design/1/1.0.7/iconify.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("             body {\n");
      out.write("        padding: 0px;\n");
      out.write("        margin: 0;\n");
      out.write("        font-family: Verdana, Geneva, Tahoma, sans-serif;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        background: linear-gradient(to right, #56ab2f, #a8e063);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    a\n");
      out.write("    {\n");
      out.write("        color:lime;\n");
      out.write("    }\n");
      out.write("    .child\n");
      out.write("    {\n");
      out.write("        float: left;\n");
      out.write("        width: 25%;\n");
      out.write("    }\n");
      out.write("            table {\n");
      out.write("        background-color: #fff;\n");
      out.write("        width: 50%;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    table td,table th{\n");
      out.write("  padding:12px 15px;\n");
      out.write("  border:1px solid #ddd;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size:16px;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    tr {\n");
      out.write("        transition: all .2s ease-in;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .iconify { color: #ffcf00; }\n");
      out.write("    th,\n");
      out.write("    td {\n");
      out.write("        padding: 12px;\n");
      out.write("        text-align: left;\n");
      out.write("        border-bottom: 1px solid #ddd;\n");
      out.write("    }\n");
      out.write("    #header {\n");
      out.write("        background-color: #16a085;\n");
      out.write("        color: #fff;\n");
      out.write("    }\n");
      out.write("    tr:hover {\n");
      out.write("        background:linear-gradient(to right, #40e0d0, #ff8c00, #ff0080);\n");
      out.write("        transform: scale(1.02);\n");
      out.write("        border: 1px solid black;\n");
      out.write("        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("    }\n");
      out.write("    div\n");
      out.write("    {\n");
      out.write("        margin: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("    }\n");
      out.write("    .child1\n");
      out.write("    {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("    }\n");
      out.write("    .child2\n");
      out.write("    {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("    }\n");
      out.write("    @media(max-width: 500px){\n");
      out.write("\ttable thead{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t}\n");
      out.write("        th\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\ttable, table tbody, table tr, table td{\n");
      out.write("\t\tdisplay: grid;\n");
      out.write("\t\twidth: 80%;\n");
      out.write("\t}\n");
      out.write("\ttable tr{\n");
      out.write("\t\tmargin-bottom:15px;\n");
      out.write("\t}\n");
      out.write("\ttable td{\n");
      out.write("\t\tpadding-left: 12%;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t}\n");
      out.write("\ttable td::before{\n");
      out.write("\t\tcontent: '';\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\twidth: 50%;\n");
      out.write("\t\tpadding-left:15px;\n");
      out.write("\t\tfont-size:15px;\n");
      out.write("\t\tfont-weight: bold;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t}\n");
      out.write("        \n");
      out.write("        .Submit\n");
      out.write("        {\n");
      out.write("            background-color: darkgreen;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1><br>\n");
      out.write("        <form action=\"logic.jsp\">\n");
      out.write("            <div>Product:<input type=\"text\" name=\"p\" required=\"\"><br>\n");
      out.write("            Product Category:<select name=\"cat\" required=\"\" id=\"cat\">\n");
      out.write("                <option value=\"\">Choose...</option>\n");
      out.write("                <option value=\"mobile\">Mobile</option>\n");
      out.write("                <option value=\"mobile\">Laptop</option>\n");
      out.write("                <option value=\"mobile\">Camera</option>\n");
      out.write("                <option value=\"mobile\">TV</option>\n");
      out.write("                <option value=\"mobile\">Washing Machine</option>\n");
      out.write("                <option value=\"mobile\">AC</option>\n");
      out.write("                <option value=\"mobile\">Geysers</option>\n");
      out.write("                <option value=\"mobile\">Sewing Machines</option>\n");
      out.write("                <option value=\"mobile\">Fridge</option>\n");
      out.write("                <option value=\"acc\">Others</option>\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" class=\"Submit\" value=\"Click\">\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        ");

            
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
             
        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

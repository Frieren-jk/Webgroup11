package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class log_002din_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <link href=\"css/Another.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"hidden\" id=\"status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row \">\r\n");
      out.write("                <!-- IMAGE CONTAINER BEGIN -->\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6 d-none d-md-block infinity-image-container\"></div>\r\n");
      out.write("                <!-- IMAGE CONTAINER END -->\r\n");
      out.write("\r\n");
      out.write("                <!-- FORM CONTAINER BEGIN -->\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6 infinity-form-container\">\t\t\t\t\r\n");
      out.write("                    <div class=\"col-lg-9 col-md-12 col-sm-9 col-xs-12 infinity-form\">\r\n");
      out.write("                        <!-- Company Logo -->\r\n");
      out.write("                        <div class=\"text-center mb-3 mt-5\">\r\n");
      out.write("                            <img src=\"img/core-img/logotransparent.png\" width=\"150px\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"text-center mb-4\">\r\n");
      out.write("                            <h4>Login to your account</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Form -->\r\n");
      out.write("                        <form class=\"px-3\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user\">\r\n");
      out.write("                            <!-- Input Box -->\r\n");
      out.write("                            <div class=\"form-input\">\r\n");
      out.write("                                <span><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                                <input type=\"text\" name=\"userNamelog\" placeholder=\"Type your Username\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-input\">\r\n");
      out.write("                                <span><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                                <input type=\"password\" name=\"passwordlog\" placeholder=\"Type your Password\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row mb-3\">\r\n");
      out.write("                                <!-- Remember Checkbox -->\r\n");
      out.write("                                <div class=\"col-auto d-flex align-items-center\">\r\n");
      out.write("                                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"cb1\">\r\n");
      out.write("                                        <label class=\"custom-control-label text-white\" for=\"cb1\">Remember me</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Login Button -->\r\n");
      out.write("                            <div class=\"mb-3\"> \r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-block\">Log In</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-right \">\r\n");
      out.write("                                <a href=\"reset.html\" class=\"forget-link\">Forgot password?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-center mb-2\">\r\n");
      out.write("                                <div class=\"text-center mb-2 text-white\">or login with</div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Facebook Button -->\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-social btn-facebook\"><i class=\"fa-brands fa-facebook\" aria-hidden=\"true\"></i> Facebook</a>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Google Button -->\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-social btn-google\"><i class=\"fa-brands fa-google\"></i> Google</a>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Twitter Button -->\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-social btn-twitter\"><i class=\"fa-brands fa-x-twitter\" aria-hidden=\"true\"></i> Twitter</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-center mb-5 text-white\">Don't have an account? \r\n");
      out.write("                                <a class=\"register-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\">Register here</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\t\t\t\t\t\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- FORM CONTAINER END -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\t\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                var status = $('#status').val();\r\n");
      out.write("                console.log(\"Status value: \" + status);\r\n");
      out.write("                if (status === \"failed\") {\r\n");
      out.write("                    Swal.fire({\r\n");
      out.write("                        icon: 'error',\r\n");
      out.write("                        title: 'Error Login',\r\n");
      out.write("                        text: 'Your username and password does not match!'\r\n");
      out.write("                    }).then(function () {\r\n");
      out.write("            ");
 session.removeAttribute("status");
      out.write(" // Clear the session attribute\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

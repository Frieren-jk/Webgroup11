package org.apache.jsp.WEB_002dINF.Inventor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inventoryUpdated_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags must come first in the head -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title  -->\r\n");
      out.write("        <title>Fur Real Pet Supplies - Registration</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Tab Icon  -->\r\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/iconlight.png\">\r\n");
      out.write("        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Style CSS -->\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdn.datatables.net/2.0.5/css/dataTables.dataTables.css\" />\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css\"/>\r\n");
      out.write("        <link defer rel=\"stylesheet\" href=\"https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.css\"/>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/2.0.5/js/dataTables.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/core-style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/Custom11Css.css\">     \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main-content-wrapper d-flex clearfix\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Search Start -->\r\n");
      out.write("            <div class=\"search-section section-padding-100\">\r\n");
      out.write("                <div class=\"search-close\">\r\n");
      out.write("                    <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"search-content\">\r\n");
      out.write("                                <form action=\"#\" method=\"get\">\r\n");
      out.write("                                    <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type your keyword...\">\r\n");
      out.write("                                    <button type=\"submit\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/img/core-img/searchicon.png\" alt=\"error\"></button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Search End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Mobile Nav -->\r\n");
      out.write("            <div class=\"mobile-nav\">\r\n");
      out.write("                <!-- Navbar Brand -->\r\n");
      out.write("                <div class=\"navbar-brand\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Navbar Toggler -->\r\n");
      out.write("                <div class=\"navbar-toggler\">\r\n");
      out.write("                    <span></span><span></span><span></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Topbar Start -->\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row upbar\">\r\n");
      out.write("                        <div class=\"col-lg-6 d-none d-lg-block\">\r\n");
      out.write("                            <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                                <a class=\"text-light\"><i class=\"fa-solid fa-phone\"></i> Call Us: 0960-542-2186</a>\r\n");
      out.write("                                <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                                <a class=\"text-light\"><i class=\"fa-solid fa-envelope\"></i> Our Email: furrealpetsupplies@gmail.com</a>\r\n");
      out.write("                                <span class=\"text-light px-2\">|</span>\r\n");
      out.write("                                <a style=\"color: #FBFF4B;\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/physicalshop\">Visit our physical shop. <i class=\"fa-solid fa-location-dot\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Header Area Start -->\r\n");
      out.write("            <header class=\"header-area clearfix\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Close Icon -->\r\n");
      out.write("                <div class=\"nav-close\">\r\n");
      out.write("                    <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Logo -->\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logolight.png\" alt=\"error\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Cart Menu -->\r\n");
      out.write("                <div class=\"cart-fav-search mb-100\">\r\n");
      out.write("                    <a href=\"#\" class=\"search-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/searchicon.png\" alt=\"error\"> Search</a>\r\n");
      out.write("<!--             hide for now       <a data-toggle=\"modal\" data-target=\"#myModal\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/loginicon.png\" alt=\"error\"> Log In</a>-->\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/registration\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/createicon.png\" alt=\"error\"> Register Now</a>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory\" class=\"fav-nav\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/inventoryicon.png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory\" alt=\"error\"> Inventory</a>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\" class=\"cart-nav\"><img class=\"pb-1\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/carticon.png\" alt=\"error\"> Cart <span>(0)</span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Main Nav -->\r\n");
      out.write("                <nav class=\"main-nav\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop\">Shop</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Product</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\">Cart</a></li>\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/checkout\">Checkout</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </nav>\r\n");
      out.write("\r\n");
      out.write("                <br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("                <!-- Social Button -->\r\n");
      out.write("                <div class=\"social-info d-flex justify-content-between\">\r\n");
      out.write("                    <a href=\"https://www.facebook.com/profile.php?id=61558747046846\" target=\"_blank\"><i class=\"fa-brands fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    <a href=\"https://www.instagram.com/furrealpetsupplies/\" target=\"_blank\"><i class=\"fa-brands fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    <a href=\"https://x.com/suppliesfurreal\" target=\"_blank\"><i class=\"fa-brands fa-x-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    <a href=\"https://www.pinterest.ph/furrealthopetssupplies/\" target=\"_blank\"><i class=\"fa-brands fa-pinterest\" aria-hidden=\"true\"></i></a>        \r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- Header Area End -->\r\n");
      out.write("\r\n");
      out.write("           <div class=\"container m-auto m-1 m-5 mb-auto \">\r\n");
      out.write("                <div class=\"cart-btn w-10 mt-1 mb-4\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/inventory/add/form\" class=\"btn amado-bt\">Add Inventory</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"registration-form-wrapper pt-auto\">\r\n");
      out.write("                    <div class=\"table-responsive\">\r\n");
      out.write("                    <table id=\"myTable\" class=\"table table-striped table-hover\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Name</th>\r\n");
      out.write("                                <th>Position</th>\r\n");
      out.write("                                <th>Office</th>\r\n");
      out.write("                                <th>Age</th>\r\n");
      out.write("                                <th>Start date</th>\r\n");
      out.write("                                <th>Salary</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>JK Salvador</td>\r\n");
      out.write("                                <td>System Architect</td>\r\n");
      out.write("                                <td>Edinburgh</td>\r\n");
      out.write("                                <td>61</td>\r\n");
      out.write("                                <td>2011-04-25</td>\r\n");
      out.write("                                <td>$320,800</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Alexander Pascual</td>\r\n");
      out.write("                                <td>Accountant</td>\r\n");
      out.write("                                <td>Tokyo</td>\r\n");
      out.write("                                <td>63</td>\r\n");
      out.write("                                <td>2011-07-25</td>\r\n");
      out.write("                                <td>$170,750</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Ian Palallos</td>\r\n");
      out.write("                                <td>Senior Technical Author</td>\r\n");
      out.write("                                <td>Los Alamos</td>\r\n");
      out.write("                                <td>66</td>\r\n");
      out.write("                                <td>1945-08-05</td>\r\n");
      out.write("                                <td>$186,000</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Senior Javascript Developer</td>\r\n");
      out.write("                                <td>Edinburgh</td>\r\n");
      out.write("                                <td>22</td>\r\n");
      out.write("                                <td>2012-03-29</td>\r\n");
      out.write("                                <td>$433,060</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Accountant</td>\r\n");
      out.write("                                <td>Tokyo</td>\r\n");
      out.write("                                <td>33</td>\r\n");
      out.write("                                <td>2008-11-28</td>\r\n");
      out.write("                                <td>$162,700</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Integration Specialist</td>\r\n");
      out.write("                                <td>New York</td>\r\n");
      out.write("                                <td>61</td>\r\n");
      out.write("                                <td>2012-12-02</td>\r\n");
      out.write("                                <td>$372,000</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Sales Assistant</td>\r\n");
      out.write("                                <td>San Francisco</td>\r\n");
      out.write("                                <td>59</td>\r\n");
      out.write("                                <td>2012-08-06</td>\r\n");
      out.write("                                <td>$137,500</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Integration Specialist</td>\r\n");
      out.write("                                <td>Tokyo</td>\r\n");
      out.write("                                <td>55</td>\r\n");
      out.write("                                <td>2010-10-14</td>\r\n");
      out.write("                                <td>$327,900</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Javascript Developer</td>\r\n");
      out.write("                                <td>San Francisco</td>\r\n");
      out.write("                                <td>39</td>\r\n");
      out.write("                                <td>2009-09-15</td>\r\n");
      out.write("                                <td>$205,500</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Software Engineer</td>\r\n");
      out.write("                                <td>Edinburgh</td>\r\n");
      out.write("                                <td>23</td>\r\n");
      out.write("                                <td>2008-12-13</td>\r\n");
      out.write("                                <td>$103,600</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Javascript Developer</td>\r\n");
      out.write("                                <td>Singapore</td>\r\n");
      out.write("                                <td>29</td>\r\n");
      out.write("                                <td>2011-06-27</td>\r\n");
      out.write("                                <td>$183,000</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Z------</td>\r\n");
      out.write("                                <td>Customer Support</td>\r\n");
      out.write("                                <td>New York</td>\r\n");
      out.write("                                <td>27</td>\r\n");
      out.write("                                <td>2011-01-25</td>\r\n");
      out.write("                                <td>$112,000</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                        <tfoot>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Name</th>\r\n");
      out.write("                                <th>Position</th>\r\n");
      out.write("                                <th>Office</th>\r\n");
      out.write("                                <th>Age</th>\r\n");
      out.write("                                <th>Start date</th>\r\n");
      out.write("                                <th>Salary</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tfoot>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- ##### Footer Area End ##### -->\r\n");
      out.write("            <footer class=\"footer_area clearfix w-100\">\r\n");
      out.write("                <div class=\"container \">\r\n");
      out.write("                    <div class=\"row align-items-center\">\r\n");
      out.write("                        <!-- Single Widget Area -->\r\n");
      out.write("                        <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                            <div class=\"single_widget_area\">\r\n");
      out.write("                                <!-- Logo -->\r\n");
      out.write("                                <div class=\"footer-logo mr-50\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/core-img/logodark.png\" alt=\"error\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Text -->\r\n");
      out.write("                                <p class=\"footerdescription\">\"Animals are such agreeable friends - they ask no questions; they pass no criticisms.\" - George Eliot\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Single Widget Area -->\r\n");
      out.write("                        <div class=\"col-12 col-lg-8\">\r\n");
      out.write("                            <div class=\"single_widget_area\">\r\n");
      out.write("                                <!-- Footer Menu -->\r\n");
      out.write("                                <div class=\"footer_menu\">\r\n");
      out.write("                                    <nav class=\"navbar navbar-expand-lg justify-content-end\">\r\n");
      out.write("                                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#footerNavContent\" aria-controls=\"footerNavContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("                                        <div class=\"collapse navbar-collapse\" id=\"footerNavContent\">\r\n");
      out.write("                                            <ul class=\"navbar-nav ml-auto ms-auto\">\r\n");
      out.write("                                                <li class=\"nav-item\">\r\n");
      out.write("                                                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index\">Home</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li class=\"nav-item\">\r\n");
      out.write("                                                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/shop\">Shop</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li class=\"nav-item\">\r\n");
      out.write("                                                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Product</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li class=\"nav-item\">\r\n");
      out.write("                                                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\">Cart</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li class=\"nav-item\">\r\n");
      out.write("                                                    <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/checkout\">Checkout</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </nav>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("            <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->\r\n");
      out.write("            <script src=\"js/jquery/jQuery v3.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!-- Popper js -->\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Bootstrap js -->\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Plugins js -->\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/plugins.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- Active js -->\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/active.js\"></script>\r\n");
      out.write("            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/CustomJs.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    $('#myTable').DataTable();\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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

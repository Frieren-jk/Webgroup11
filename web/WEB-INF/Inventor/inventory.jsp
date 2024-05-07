<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags must come first in the head -->

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Registration</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="img/core-img/iconlight.png">

        <!-- Core Style CSS -->
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.dataTables.css" />
        <link defer rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/css/bootstrap.min.css"/>
        <link defer rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.css"/>
        <script defer src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script defer src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.js"></script>
        <script defer src="https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.js"></script>
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="Custom11Css.css">
    </head>

    <body>
        <div class="main-content-wrapper d-flex clearfix">

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>
                <!-- Navbar Toggler -->
                <div class="navbar-toggler">
                    <span></span><span></span><span></span>
                </div>
            </div>

            <!-- Header Area Start -->
            <header class="header-area clearfix">

                <!-- Close Icon -->
                <div class="nav-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>

                <!-- Logo -->
                <div class="logo">
                    <a href="index.jsp"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Cart Menu -->
                <div class="sticky-top pt-1">
                    <div> </div>
                    <div class="cart-fav-search mb-100 mt-5 ">
                        <a href="" class="search-nav"><img src="img/core-img/searchicon.png" alt="error">Search</a>
                        <a class="fav-nav" data-toggle="modal" data-target="#myModal"><img src="img/core-img/loginicon.png" alt="error">Login</a>
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="img/core-img/createicon.png" alt="error">Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory" class="fav-nav"><img src="img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory" alt="error">Inventory</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="img/core-img/carticon.png" alt="error">Cart<span>(3)</span></a>
                    </div>

                    <!-- Main Nav -->
                    <nav class="main-nav ">
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/index">Home</a></li>
                            <li><a href="${pageContext.request.contextPath}/shop">Shop</a></li>
                            <li><a href="${pageContext.request.contextPath}/product">Product</a></li>
                            <li><a href="${pageContext.request.contextPath}/cart">Cart</a></li>
                            <li><a href="${pageContext.request.contextPath}/checkout">Checkout</a></li>
                        </ul>
                    </nav>
                    <br><br><br><br><br>

                    <!-- Social Button -->
                    <div class="social-info d-flex justify-content-between">
                        <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                        <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                        <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                        <a href="https://twitter.com/suppliesfurreal" target="_blank"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                    </div>
            </header>

            <div class="container m-1 mt-5 mb-auto w-75">
                <br><br><br><br><br><br>
                <table id="myTable" class="table order-column hover" style="width:100%">
                    <div class="cart-btn w-10 mt-1 ">
                        <a href="${pageContext.request.contextPath}/inventory/add/form" class="btn amado-bt ">Add Inventory</a>
                    </div>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Position</th>
                            <th>Office</th>
                            <th>Age</th>
                            <th>Start date</th>
                            <th>Salary</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John Karl Salvador</td>
                            <td>System Architect</td>
                            <td>Edinburgh</td>
                            <td>61</td>
                            <td>2011-04-25</td>
                            <td>$320,800</td>
                        </tr>
                        <tr>
                            <td>Alexander Pascual</td>
                            <td>Accountant</td>
                            <td>Tokyo</td>
                            <td>63</td>
                            <td>2011-07-25</td>
                            <td>$170,750</td>
                        </tr>
                        <tr>
                            <td>Ian Palallos</td>
                            <td>Senior Technical Author</td>
                            <td>Los Alamos</td>
                            <td>66</td>
                            <td>1945-08-05</td>
                            <td>$169,690</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Senior Javascript Developer</td>
                            <td>Edinburgh</td>
                            <td>22</td>
                            <td>2012-03-29</td>
                            <td>$433,060</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Accountant</td>
                            <td>Tokyo</td>
                            <td>33</td>
                            <td>2008-11-28</td>
                            <td>$162,700</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Integration Specialist</td>
                            <td>New York</td>
                            <td>61</td>
                            <td>2012-12-02</td>
                            <td>$372,000</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Sales Assistant</td>
                            <td>San Francisco</td>
                            <td>59</td>
                            <td>2012-08-06</td>
                            <td>$137,500</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Integration Specialist</td>
                            <td>Tokyo</td>
                            <td>55</td>
                            <td>2010-10-14</td>
                            <td>$327,900</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Javascript Developer</td>
                            <td>San Francisco</td>
                            <td>39</td>
                            <td>2009-09-15</td>
                            <td>$205,500</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Software Engineer</td>
                            <td>Edinburgh</td>
                            <td>23</td>
                            <td>2008-12-13</td>
                            <td>$103,600</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Javascript Developer</td>
                            <td>Singapore</td>
                            <td>29</td>
                            <td>2011-06-27</td>
                            <td>$183,000</td>
                        </tr>
                        <tr>
                            <td>z------</td>
                            <td>Customer Support</td>
                            <td>New York</td>
                            <td>27</td>
                            <td>2011-01-25</td>
                            <td>$112,000</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr>
                            <th>Name</th>
                            <th>Position</th>
                            <th>Office</th>
                            <th>Age</th>
                            <th>Start date</th>
                            <th>Salary</th>
                        </tr>
                    </tfoot>
                </table>
            </div>

            <!-- ##### Footer Area Start ##### -->
            <footer class="footer_area clearfix" 
                <div class="container-fluid"> <!-- Use container-fluid to span full width -->
                    <div class="row align-items-center">
                        <!-- Single Widget Area -->
                        <div class="col-12 col-lg-4">
                            <div class="single_widget_area">
                                <!-- Logo -->
                                <div class="footer-logo mr-50">
                                    <a href="index.jsp"><img src="<%=request.getContextPath()%>/img/core-img/logodark.png" alt="error"></a>
                                </div>
                                <!-- Text -->
                                <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms." - George Eliot
                                    <br>
                                    <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
                                </p>
                            </div>
                        </div>

                        <!-- Single Widget Area -->
                        <div class="col-12 col-lg-8">
                            <div class="single_widget_area">
                                <!-- Footer Menu -->
                                <div class="footer_menu">
                                    <nav class="navbar navbar-expand-lg justify-content-end">
                                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                        <div class="collapse navbar-collapse" id="footerNavContent">
                                            <ul class="navbar-nav ml-auto">
                                                <li class="nav-item active">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/index">Home</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/shop">Shop</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/product-details">Product</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                                </li>
                                                <li class="nav-item">
                                                    <a class="nav-link" href="${pageContext.request.contextPath}/checkout">Checkout</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>

            <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
            <script src="js/jquery/jQuery v3.7.1.min.js"></script>

            <!-- Popper js -->
            <script src="js/popper.min.js"></script>

            <!-- Bootstrap js -->
            <script src="js/bootstrap.min.js"></script>

            <!-- Plugins js -->
            <script src="js/plugins.js"></script>

            <!-- Active js -->
            <script src="js/active.js"></script>
            <script src="js/CustomJs.js"></script>
            <script>
                            $(document).ready(function () {
                                $('#myTable').DataTable();
                            });
            </script>
    </body>
</html>
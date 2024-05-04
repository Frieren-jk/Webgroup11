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
        <link rel="icon" href="<%=request.getContextPath()%>/img/core-img/iconlight.png">

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/core-style.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/style.css">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/Custom11Css.css">
        <style>
            /* Select all text within the sidebar */
            .sticky-top a,
            .main-nav a {
                opacity: 0.5; /* Apply gray color to all text */
            }

            /* Select the "Inventory" link and override the color */
            .sticky-top #available,
            .main-nav a[href="${pageContext.request.contextPath}/inventory"] {
                opacity: 1; /* Apply black color to the "Inventory" link */
            }
        </style>



    </head>

    <body>
        <div class="modal fade " style="z-index: 1060;" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex justify-content-evenly">
                        SUCCESS!!
                    </div>
                    <div class="modal-footer ">
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Back to Home</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Search Start -->
        <div class="search-section section-padding-100">
            <div class="search-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="search-content">
                            <form action="#" method="get">
                                <input type="search" name="search" id="search" placeholder="Type your keyword...">
                                <button type="submit"><img src="<%=request.getContextPath()%>/img/core-img/search.png" alt="error"></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Search End -->

        <!-- ##### Main Content Wrapper Start ##### -->
        <div class="main-content-wrapper d-flex clearfix">

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="index.jsp"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
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
                    <a href="index.jsp"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Cart Menu -->
                <div class="sticky-top pt-1" >
                    <div> </div>
                    <div class="cart-fav-search mb-100 mt-5 ">
                        <a  ><img src="<%=request.getContextPath()%>/img/core-img/searchicon.png" alt="error">Search</a>
                        <a class="fav-nav" data-toggle="modal" data-target="#myModal"><img src="<%=request.getContextPath()%>/img/core-img/loginicon.png" alt="error">Login</a>
                        <a class="fav-nav"><img src="<%=request.getContextPath()%>/img/core-img/createicon.png" alt="error">Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory" id="available"  class="fav-nav"><img src="<%=request.getContextPath()%>/img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory" alt="error">Inventory</a>
                        <a  class="cart-nav"><img class="pb-1" src="<%=request.getContextPath()%>/img/core-img/carticon.png" alt="error">Cart<span>(0)</span></a>
                    </div>

                    <!-- Main Nav -->
                    <nav class="main-nav ">
                        <ul>
                            <li ><a>Home</a></li>
                            <li><a >Shop</a></li>
                            <li><a >Product</a></li>
                            <li><a >Cart</a></li>
                            <li><a >Checkout</a></li>
                        </ul>
                    </nav>
                    <br><br><br><br><br>
                </div>





            </header>
            <!-- Header Area End -->


            <div class="cart-table-area section-padding-100" >
                <br><br><br><br>
                <div class="container-fluid ">
                    <div class="row">
                        <div class="col-12">
                            <div class="checkout_details_area mt-50 clearfix position-relative">

                                <div class="cart-title">
                                    <h2>Add Inventory</h2>
                                </div>

                                <form method="POST" action="${pageContext.request.contextPath}/inventory/add" class="py-3 " id="regform">
                                    <div class="row">
                                        <div class="col-12 col-md-8 mt-3">
                                            <div class="form-group ">
                                                <label for="username">Full Name</label>
                                                <input type="text" class="form-control" id="username" placeholder="Enter the Full Name" >
                                                <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                            </div> 
                                        </div>
                                        <div class="col-12 col-md-4 mt-3">
                                            <div class="form-group ">
                                                <label for="username">Position</label>
                                                <input type="text" class="form-control" id="username" placeholder="Enter the Position of the Employee" >
                                                <small id="usernameHelp"  class="form-text">Alphanumeric, must be between 4 - 12 characters.</small>
                                            </div> 
                                        </div>

                                    </div>



                                    <div class="row ">


                                        <div class="col-12 col-md-4  mt-5 ">
                                            <div class="form-group">
                                                <label for="Middle Name">Office</label>
                                                <input type="text" class="form-control" id="middlename" name="middleName" placeholder="Enter The Office" >
                                                <small id="middlenameHelp" class="form-text">Middle name must be characters only or leave it empty.</small>
                                            </div>
                                        </div>
                                        <div class="col-12 col-md-4  mt-5 ">
                                            <div class="form-group">
                                                <label for="Last Name">Age</label>
                                                <input type="text" class="form-control" id="lastname" name="lastName" placeholder="Enter The Age" >
                                                <small id="lastnameHelp" class="form-text">Last name must be characters only, minimum of 2 characters.</small>
                                            </div>
                                        </div>
                                        <div class="col-12 col-md-4  mt-5">
                                            <div class="form-group">
                                                <label for="address">Start Date</label>
                                                <input type="text" class="form-control" id="address" placeholder="Enter The Start Date" >
                                                <small id="addressHelp" class="form-text">Address must be alphanumeric, does not contain special characters.</small>
                                            </div>
                                        </div>

                                    </div> 

                                    <div class="row ">

                                    </div>
                                    <div class="row ">
                                        <div class="col-12 col-md-4 me-auto mt-5">
                                            <div class="form-group">
                                                <label for="Birthday">Salary</label>
                                                <input type="text" class="form-control" id="birthday" placeholder="Enter The Salary" >
                                                <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY.</small>
                                            </div>
                                        </div>
                                    </div> 
                                </form>
                                <button type='submit' form="regform" class="btn btn-primary d-block mx-auto mt-3">Add</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Main Content Wrapper End ##### -->

        <!-- ##### Footer Area Start ##### -->
        <footer class="footer_area clearfix">
            <div class="container">
                <div class="row align-items-center">
                    <!-- Single Widget Area -->
                    <div class="col-12 col-lg-4">
                        <div class="single_widget_area">
                            <!-- Logo -->
                            <div class="footer-logo mr-50">
                                <a href="index.jsp"><img src="${pageContext.request.contextPath}/img/core-img/logodark.png" alt="error"></a>
                            </div>
                            <!-- Text -->
                            <p class="footerdescription">Because we care for your pet's safety and health.
                                <br>
                                <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
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
                                            <li class="nav-item">
                                                <a class="nav-link" href="index.jsp">Home</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="shop.jsp">Shop</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="product-details.jsp">Product</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="cart.jsp">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="checkout.jsp">Checkout</a>
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
        <!-- ##### Footer Area End ##### -->

        <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
        <script src="<%=request.getContextPath()%>/js/jquery/jQuery v3.7.1.min.js"></script>


        <!-- Popper js -->
        <script src="<%=request.getContextPath()%>/js/popper.min.js"></script>

        <!-- Bootstrap js -->
        <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>

        <!-- Plugins js -->
        <script src="<%=request.getContextPath()%>/js/plugins.js"></script>

        <!-- Active js -->
        <script src="<%=request.getContextPath()%>/js/active.js"></script>
<!--        <script src="<%=request.getContextPath()%>/js/CustomJs.js"></script>-->

    </body>

</html>

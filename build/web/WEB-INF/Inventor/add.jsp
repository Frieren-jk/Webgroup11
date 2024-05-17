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

        <!-- ##### Main Content Wrapper Start ##### -->
        <div class="main-content-wrapper d-flex clearfix">

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="${pageContext.request.contextPath}/index"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
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
                    <a href="${pageContext.request.contextPath}/index"><img src="<%=request.getContextPath()%>/img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Cart Menu -->
                <div class="sticky-top" >

                    <div class="cart-fav-search mb-100">
                        <a href="#" class="search-nav"><img src="${pageContext.request.contextPath}/img/core-img/searchicon.png" alt="error"> Search</a>
                        <a data-toggle="modal" data-target="#myModal" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/loginicon.png" alt="error"> Log In</a>
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/createicon.png" alt="error"> Register Now</a>
                        <a href="${pageContext.request.contextPath}/inventory" class="fav-nav"><img src="${pageContext.request.contextPath}/img/core-img/inventoryicon.png" href="${pageContext.request.contextPath}/inventory" alt="error"> Inventory</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="${pageContext.request.contextPath}/img/core-img/carticon.png" alt="error"> Cart <span>(0)</span></a>
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
                                    <h2>ADD INVENTORY</h2>
                                </div>
                                <div class="registration-form-wrapper">
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
                                                    <input type="text" class="form-control" id="middlename" name="middleName" placeholder="Enter the Office" >
                                                    <small id="middlenameHelp" class="form-text">Middle name must be characters only or leave it empty if not applicable.</small>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-4  mt-5 ">
                                                <div class="form-group">
                                                    <label for="Last Name">Age</label>
                                                    <input type="text" class="form-control" id="lastname" name="lastName" placeholder="Enter the Age" >
                                                    <small id="lastnameHelp" class="form-text">Last name must be characters only, minimum of 2 characters.</small>
                                                </div>
                                            </div>
                                            <div class="col-12 col-md-4  mt-5">
                                                <div class="form-group">
                                                    <label for="address">Start Date</label>
                                                    <input type="text" class="form-control" id="address" placeholder="Enter the Start Date" >
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
                                                    <input type="text" class="form-control" id="birthday" placeholder="Enter the Salary" >
                                                    <small id="birthdayHelp" class="form-text">Birthday format must be MM-DD-YYYY.</small>
                                                </div>
                                            </div>
                                        </div> 
                                    </form>

                                    <button type='submit' form="regform" class=" d-block mx-auto mt-5 buttonfx angleindouble ">Add</button>
                                </div>
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
                                <a href="${pageContext.request.contextPath}/index"><img src="<%=request.getContextPath()%>/img/core-img/logodark.png" alt="error"></a>
                            </div>
                            <!-- Text -->
                            <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms." - George Eliot
                                <br>
                                <b>Fur Real Pet Supplies | <script>document.write(new Date().getFullYear());</script></b>
                            </p>
                        </div>
                    </div>

                    <!-- Single Widget Area -->
                    <div class="col-12 col-lg-8 ">
                        <div class="single_widget_area">
                            <!-- Footer Menu -->
                            <div class="footer_menu">
                                <nav class="navbar navbar-expand-lg justify-content-end">
                                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                    <div class="collapse navbar-collapse" id="footerNavContent">
                                        <ul class="navbar-nav ml-auto">
                                            <li class="nav-item">
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
        <!--<script src="<%=request.getContextPath()%>/js/CustomJs.js"></script>-->
    </body>

</html>
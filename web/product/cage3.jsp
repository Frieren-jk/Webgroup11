<%@ page import="javax.servlet.http.HttpSession" %>
<%
    session = request.getSession(false); 

    if (session == null || session.getAttribute("userNamelog") == null) {
        // User is not logged in, redirect to the login page
        response.sendRedirect(request.getContextPath() + "/login");
    }

    // Set headers to prevent caching
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    response.setDateHeader("Expires", 0); // Proxies
%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags must come first in the head -->
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!-- Title  -->
        <title>Fur Real Pet Supplies - Cage 3</title>

        <!-- Tab Icon  -->
        <link rel="icon" href="img/core-img/iconlight.png">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>

        <!-- Core Style CSS -->
        <link rel="stylesheet" href="css/core-style.css">
        <link rel="stylesheet" href="./style.css">
    </head>

    <body>
        <input type="hidden" id="logstatus" value="${userSuccess}">
        <input type="hidden" id="userNameCurrent" value="${userNamelog}">
        <input type="hidden" id="passwordCurrent" value="${latestpass}">
        <input type="hidden" id="passwordlogged" value="${currentPassword}">
        <input type="hidden" id="userRole" value="${userRole}">
        
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
                                <button type="submit"><img src="img/core-img/searchicon.png" alt="error"></button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Search End -->

        <!-- ##### Main Content Wrapper Start ##### -->
        <div class="main-content-wrapper d-flex clearfix" >

            <!-- Mobile Nav -->
            <div class="mobile-nav">
                <!-- Navbar Brand -->
                <div class="navbar-brand">
                    <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>
                <!-- Navbar Toggler -->
                <div class="navbar-toggler">
                    <span></span><span></span><span></span>
                </div>
            </div>

            <!-- Topbar Start -->
                <div class="container-fluid">
                    <div class="row upbar">
                        <div class="col-lg-6 d-none d-lg-block">
                            <div class="d-inline-flex align-items-center">
                                <a class="text-light"><i class="fa-solid fa-phone"></i> Call Us: 0960-542-2186</a>
                                <span class="text-light px-2">|</span>
                                <a class="text-light"><i class="fa-solid fa-envelope"></i> Our Email: furrealpetsupplies@gmail.com</a>
                                <span class="text-light px-2">|</span>
                                <a style="color: #FBFF4B;" href="${pageContext.request.contextPath}/physicalshop">Visit our physical shop. <i class="fa-solid fa-location-dot"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            <!-- Topbar End -->

            <!-- Header Area Start -->
            <header class="header-area clearfix ">

                <!-- Close Icon -->
                <div class="nav-close">
                    <i class="fa fa-close" aria-hidden="true"></i>
                </div>

                <!-- Logo -->
                <div class="logo">
                    <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logolight.png" alt="error"></a>
                </div>

                <!-- Main Nav -->
                <div class="sticky-top pt-1">
                    <div class="cart-fav-search mb-100 mt-5 ">
                        <a style="color: steelblue;" class="fav-nav"><img src="img/core-img/usericon.png" alt="error">${userNamelog} <span style="padding-left: 29px;">(${userRole})</span></a>
                        <a href="#" id="changePasswordBtn" class="fav-nav"><img src="img/core-img/changepassicon.png" alt="error">Change Pass</a>
                        <a href="${pageContext.request.contextPath}/logout" class="fav-nav"><img src="img/core-img/logouticon.png" alt="error">Log Out</a>
                        <br><br><br>
                        <a href="#" class="search-nav"><img src="img/core-img/searchicon.png" alt="error">Search</a>
                        <a href="${pageContext.request.contextPath}/registration" class="fav-nav"><img src="img/core-img/createicon.png" alt="error">Register Now</a>
                        <c:if test="${userRole == 'Admin' || userRole == 'admin'}">
                            <a href="${pageContext.request.contextPath}/inventory/users" class="fav-nav">
                                <img src="img/core-img/inventoryicon.png" alt="error">Inventory
                            </a>
                        </c:if>
                        <a href="${pageContext.request.contextPath}/home" class="fav-nav"><img src="img/core-img/homeicon.png" alt="error">Home</a>
                        <a href="${pageContext.request.contextPath}/cages" class="fav-nav"><img src="img/core-img/shopicon.png" alt="error">Shop</a>
                        <a href="${pageContext.request.contextPath}/cart" class="cart-nav"><img class="pb-1" src="img/core-img/carticon.png" alt="error">Cart<span>(3)</span></a>
                    </div>
                    <br><br><br><br><br>

                    <!-- Social Button -->
                    <div class="social-info d-flex justify-content-between">
                        <a href="https://www.facebook.com/profile.php?id=61558747046846" target="_blank"><i class="fa-brands fa-facebook" aria-hidden="true"></i></a>
                        <a href="https://www.instagram.com/furrealpetsupplies/" target="_blank"><i class="fa-brands fa-instagram" aria-hidden="true"></i></a>
                        <a href="https://x.com/suppliesfurreal" target="_blank"><i class="fa-brands fa-x-twitter" aria-hidden="true"></i></a>
                        <a href="https://www.pinterest.ph/furrealthopetssupplies/" target="_blank"><i class="fa-brands fa-pinterest" aria-hidden="true"></i></a>        
                    </div>
                </div>
            </header>
            <!-- Header Area End -->

            <!-- Product Details Area Start -->
            <div class="single-product-area section-padding-100 clearfix">
                <div class="container-fluid">

                    <div class="row">
                        <div class="col-12">
                            <nav aria-label="breadcrumb">
                                <ol class="breadcrumb mt-50">
                                    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                                    <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/cages">Cages</a></li>
                                    <li class="breadcrumb-item active" aria-current="page">Carbon Quality and Wood Cage</li>
                                </ol>
                            </nav>
                        </div>
                    </div>
                    <div class="cart-wrapper">                
                    <div class="row">
                        <div class="col-12 col-lg-7">
                            <div class="single_product_thumb">
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <a class="gallery_img" href="img/product-img/prodetails/cage 3 shop.png">
                                            <img class="d-block w-100" src="img/product-img/prodetails/cage 3 shop.png" alt="First slide">
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-12 col-lg-5">
                            <div class="single_product_desc">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line"></div>
                                    <p class="product-price">PHP 1600.00</p>
                                    <a href="${pageContext.request.contextPath}/cage3">
                                        <h6>Carbon Quality and Wood Cage</h6>
                                    </a>
                                </div>
                                <div class="short_overview my-5">
                                    <p>The carbon quality and wood cage is a premium dog crate designed to provide a secure and comfortable space for your pet. Made from high-quality, sustainably sourced wood, it combines durability with a stylish aesthetic that complements any home decor. The cage features a sturdy framework, ensuring the safety and well-being of your dog, while the eco-friendly materials and carbon-neutral production process reflect a commitment to environmental responsibility. Ideal for both home use and travel, this cage offers a practical and green solution for pet owners.</p>
                                </div>
                                <div>
                                <a href="${pageContext.request.contextPath}/addtocart?productID=1003"><button type="submit" name="addtocart" value="5" class="btn amado-bt">Add to Cart</button></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
            <!-- Product Details Area End -->
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
                                <a href="${pageContext.request.contextPath}/home"><img src="img/core-img/logodark.png" alt="error"></a>
                            </div>
                            <!-- Text -->
                            <p class="footerdescription">"Animals are such agreeable friends - they ask no questions; they pass no criticisms."<br>
                                - George Eliot
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
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/home">Home</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cages">Shop</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/cart">Cart</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/physicalshop">Physical Shop</a>
                                            </li>
                                            <li class="nav-item">
                                                <a class="nav-link" href="${pageContext.request.contextPath}/registration">Register Now</a>
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

        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script>
                                    $(document).ready(function () {
                                        var statusreg = $('#logstatus').val();
                                        var username = $('#userNameCurrent').val();




                                        $('#changePasswordBtn').click(function (event) {
                                            event.preventDefault(); // Prevent default form submission behavior

                                            Swal.fire({
                                                title: 'Change Password for ' + username,
                                                html: `
                <form id="changePasswordForm">
                    <input type="hidden" name="username" value="${userNamelog}">
                            <div class="password-field">
                            <input type="password" id="newPassword" name="newPassword" class="swal2-input" placeholder="New Password">
                        <i class="fa fa-eye-slash showPass" onclick="togglePasswordVisibility('newPassword')"></i>
                    </div>
                        <div class="password-field">
                            <input type="password" id="confirmNewPassword" name="confirmNewPassword" class="swal2-input" placeholder="Confirm New Password">
                        <i class="fa fa-eye-slash showPass" onclick="togglePasswordVisibility('confirmNewPassword')"></i>
                    </div>
                </form>

            `,
                                                confirmButtonText: 'Change',
                                                focusConfirm: false,
                                                didOpen: () => {
                                                    const popup = Swal.getPopup();
                                                    const newPasswordInput = popup.querySelector('#newPassword');
                                                    const confirmNewPasswordInput = popup.querySelector('#confirmNewPassword');

                                                    newPasswordInput.onkeyup = (event) => event.key === 'Enter' && Swal.clickConfirm();
                                                    confirmNewPasswordInput.onkeyup = (event) => event.key === 'Enter' && Swal.clickConfirm();
                                                },
                                                preConfirm: () => {
                                                    const newPassword = document.getElementById('newPassword').value;
                                                    const confirmNewPassword = document.getElementById('confirmNewPassword').value;
                                                    var currentPassword = $('#passwordCurrent').val();
                                                    var logPassword = $('#passwordlogged').val();

                                                    if (currentPassword === "samepass" || logPassword == newPassword || currentPassword == newPassword) {
                                                        Swal.showValidationMessage('New password cannot be the same as the current password');
                                                        return false;
                                                    }

                                                    if (!newPassword || !confirmNewPassword) {
                                                        Swal.showValidationMessage('Please fill out all fields');
                                                        return false;
                                                    }

                                                    if (newPassword !== confirmNewPassword) {
                                                        Swal.showValidationMessage('Passwords do not match');
                                                        return false;
                                                    }

                                                    const passwordRegex = /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/;
                                                    if (!passwordRegex.test(newPassword)) {
                                                        Swal.showValidationMessage('8-16 characters long, with at least one lowercase letter, one uppercase letter, and one number');
                                                        return false;
                                                    }

                                                    // Submit the form using AJAX to prevent default submission behavior
                                                    $.ajax({
                                                        type: 'POST',
                                                        url: '${pageContext.request.contextPath}/changePassword',
                                                        data: $('#changePasswordForm').serialize(),
                                                        success: function () {
                                                            // Show success alert
                                                            Swal.fire({
                                                                icon: 'success',
                                                                title: 'Password Changed',
                                                                text: 'Your password has been successfully changed!',
                                                                showConfirmButton: true,
                                                                timer: 0
                                                            }).then((result) => {
                                                                if (result.isConfirmed) {
                                                                    // Redirect to home page after success
                                                                    window.location.href = '${pageContext.request.contextPath}/cage3';
                                                                }
                                                            });
                                                        },
                                                        error: function (xhr, status, error) {
                                                            Swal.showValidationMessage(`Error: ${error}`);
                                                        }
                                                    });
                                                }
                                            });
                                        });
                                    });


                                    function togglePasswordVisibility(inputId) {
                                        const input = document.getElementById(inputId);
                                        const icon = input.nextElementSibling;
                                        if (input.type === "password") {
                                            input.type = "text";
                                            icon.classList.remove("fa-eye-slash");
                                            icon.classList.add("fa-eye");
                                        } else {
                                            input.type = "password";
                                            icon.classList.remove("fa-eye");
                                            icon.classList.add("fa-eye-slash");
                                        }
                                    }


        </script>
    </body>

</html>
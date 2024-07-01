<!DOCTYPE html>
<html>
    <head>
        <title>Login Page</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="css/Another.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.2/css/bootstrap.min.css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer"/>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    </head>
    <body>

        <input type="hidden" id="status" value="${status}">

        <div class="container-fluid">
            <div class="row ">
                <!-- IMAGE CONTAINER BEGIN -->
                <div class="col-lg-6 col-md-6 d-none d-md-block infinity-image-container"></div>
                <!-- IMAGE CONTAINER END -->

                <!-- FORM CONTAINER BEGIN -->
                <div class="col-lg-6 col-md-6 infinity-form-container">				
                    <div class="col-lg-9 col-md-12 col-sm-9 col-xs-12 infinity-form">
                        <!-- Company Logo -->
                        <div class="text-center mb-3 mt-5">
                            <img src="img/core-img/logotransparent.png" width="150px">
                        </div>
                        <div class="text-center mb-4">
                            <h4>Login to your account</h4>
                        </div>
                        <!-- Form -->
                        <form class="px-3" method="post" action="${pageContext.request.contextPath}/user">
                            <!-- Input Box -->
                            <div class="form-input">
                                <span><i class="fa fa-user"></i></span>
                                <input type="text" name="userNamelog" placeholder="Type your Username" required>
                            </div>
                            <div class="form-input">
                                <span><i class="fa fa-lock"></i></span>
                                <input type="password" name="passwordlog" placeholder="Type your Password" required>
                            </div>
                            <div class="row mb-3">
                                <!-- Remember Checkbox -->
                                <div class="col-auto d-flex align-items-center">
                                    <div class="custom-control custom-checkbox">
                                        <input type="checkbox" class="custom-control-input" id="cb1">
                                        <label class="custom-control-label text-white" for="cb1">Remember me</label>
                                    </div>
                                </div>
                            </div>
                            <!-- Login Button -->
                            <div class="mb-3"> 
                                <button type="submit" class="btn btn-block">Log In</button>
                            </div>
                            <div class="text-right ">
                                <a href="reset.html" class="forget-link">Forgot password?</a>
                            </div>
                            <div class="text-center mb-2">
                                <div class="text-center mb-2 text-white">or login with</div>

                                <!-- Facebook Button -->
                                <a href="" class="btn btn-social btn-facebook"><i class="fa-brands fa-facebook" aria-hidden="true"></i> Facebook</a>

                                <!-- Google Button -->
                                <a href="" class="btn btn-social btn-google"><i class="fa-brands fa-google"></i> Google</a>

                                <!-- Twitter Button -->
                                <a href="" class="btn btn-social btn-twitter"><i class="fa-brands fa-x-twitter" aria-hidden="true"></i> Twitter</a>
                            </div>
                            <div class="text-center mb-5 text-white">Don't have an account? 
                                <a class="register-link" href="${pageContext.request.contextPath}/registration">Register here</a>
                            </div>
                        </form>
                    </div>					
                </div>
                <!-- FORM CONTAINER END -->
            </div>
        </div>	
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script>

            $(document).ready(function () {
                var status = $('#status').val();
                console.log("Status value: " + status);
                if (status === "failed") {
                    Swal.fire({
                        icon: 'error',
                        title: 'Error Login',
                        text: 'Your username and password does not match!'
                    })
                }
            });
        </script>
    </body>
</html>
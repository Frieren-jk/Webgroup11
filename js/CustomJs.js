 $(document).ready(function () {


                const inputs = document.querySelectorAll('input');
                const patterns = {
                    username: /^[a-zA-Z0-9]{4,12}$/i,
                    firstname: /^[a-zA-Z" "]{1,}$/i,
                    middlename: /^[a-zA-Z" "]{0,}$/i,
                    lastname: /^[a-zA-Z" "]{2,}$/i,
                    address: /^[a-zA-Z0-9" "]+$/i,
                    birthday: /^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])-(19|20)\d{2}$/i,
                    number: /^[0-9]{11}$/i,
                    password: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/,
                    confirmpassword: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/


                };
                inputs.forEach((input) => {
                    input.addEventListener('keyup', (e) => {
                        validate(e.target, patterns[e.target.attributes.id.value]);
                    });
                });


                function validate(field, regex) {
                    if (!regex.test(field.value)) {
                        field.className = 'form-control invalid';

                    } else {
                        field.className = 'form-control valid';



                    }
                }

                //CODE FOR MAKING A MODAL APPEAR UPON SUBMIT 

                $('form#regform').submit(function (event) {
                    event.preventDefault(); // prevents form from submitting or resetting

                    //sets AllUserInfoValid to true if all user input are in correct format
                    let AllUserInfoValid = true;
                    // Check if all inputs are valid by using jQuery to iterate over each input
                    $('form#regform input').each(function () {
                        if (!$(this).hasClass('valid')) {
                            //sets AllUserInfoValid to false if an input element doesn't contains a 'valid' class
                            AllUserInfoValid = false;
                        }
                    });
                    // Checks if AllUserInfoValid is true or false and returns a proper response upon submit
                    if (!AllUserInfoValid) {
                        //if AllUserInfoValid is false it returns a warning that there is an incorrect format
                        alert("Please fill in all required fields correctly before submitting.");
                    } else {
                        //else if AllUserInfoValid is true it returns a success modal
                        $('#staticBackdrop').modal('show');
                    }
                });





                //jquery script for checking if password is the same as confirm password

                const passwordInput = $('#password');
                const confirmPasswordInput = $('#confirmpassword');

                passwordInput.on('keyup', function () {
                    validatePassword();
                });

                confirmPasswordInput.on('keyup', function () {
                    validatePassword();
                });

                function validatePassword() {
                    const password = passwordInput.val();
                    const confirmPassword = confirmPasswordInput.val();

                    if (password === confirmPassword) {
                        confirmPasswordInput.removeClass('invalid').addClass('valid');
                    } else {
                        confirmPasswordInput.removeClass('valid').addClass('invalid');
                    }
                }





                // script for the password and confirmPassword visibility 

                function passvisibility(password, form) {

                    const toggleVisibility = document.querySelector('.' + password);
                    const selector = '.' + form + ' input'; //concatenates queryselector properly so makes it easier to insert inside the jquery 
                    const input = document.querySelector(selector);  // (P.S. can't make the function work when I concatenate inside jquery selector :/
                    var passwordHidden = true;  //set pass hidden to true since input type is password
                    toggleVisibility.addEventListener('click', function () {
                        if (passwordHidden) {
                            input.setAttribute('type', 'text'); // if passwordHidden is true, it will show password
                            $('.' + password).removeClass("fa-eye-slash");
                            $('.' + password).addClass("fa-eye");
                        } else {
                            input.setAttribute('type', 'password'); // else if passwordHidden is false, it will be hidden
                            $('.' + password).removeClass("fa-eye");
                            $('.' + password).addClass("fa-eye-slash");

                        }
                        passwordHidden = !passwordHidden; // set passwordHidden to false so next click event will hide the password
                    });

                }
                //pass arguments (input class, div class)to function to toggle visibility of password
                passvisibility('showPass', 'form-pass');
                passvisibility('confirmPass', 'form-confirm');


            });
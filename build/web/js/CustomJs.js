

$(document).ready(function () {
    const inputs = document.querySelectorAll('input');
    const patterns = {
        username: /^(?=.*[a-zA-Z])(?=.*\d)[a-zA-Z\d]{4,12}$/i,
        firstname: /^(?=[a-zA-Z\s]*[a-zA-Z])[a-zA-Z\s]{1,}$/i,
        middlename: /^[a-zA-Z\s]*$/i,
        lastname: /^[a-zA-Z\s]{2,}$/i,
        address: /^(?=.*[a-zA-Z])(?=.*\d)[a-zA-Z\d ]+$/i,
        birthday: /^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])-(19[2-9][0-9]|200[0-5])$/i,
        number: /^09[0-9]{9}$/i,
        password: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/,
        confirmpassword: /^(?=.*[A-Z].*)(?=.*[a-z].*)(?=.*\d)(?=.*[!@#$&*])[A-Za-z\d!@#$&*]{8,16}$/
    };

    inputs.forEach((input) => {
        input.addEventListener('input', (e) => {
            validate(e.target, patterns[e.target.attributes.id.value]);
        });
    });

    function validate(field, regex) {
        const value = field.value.trim(); // Trim whitespace from the value
        const parent = field.parentElement;

        if (!value) {
            // If the trimmed value is empty, remove both valid and invalid classes
            field.classList.remove('valid');
            field.classList.remove('invalid');
            parent.classList.remove('was-validated', 'valid', 'invalid');
        } else if (!regex.test(value)) {
            // If the value does not match the regex pattern
            field.classList.add('invalid');
            field.classList.remove('valid');
            parent.classList.remove('was-validated', 'valid', 'invalid');
        } else {
            // If the value is valid, do an additional logical validation for the date
            if (field.id === 'birthday' && !isValidDate(value)) {
                field.classList.add('invalid');
                field.classList.remove('valid');
            } else {
                field.classList.remove('invalid');
                field.classList.add('valid');
                parent.classList.remove('was-validated', 'valid', 'invalid');
            }
        }
    }

    function isValidDate(dateString) {
        const [month, day, year] = dateString.split('-').map(Number);
        const date = new Date(`${year}-${month}-${day}`);
        return date.getMonth() + 1 === month && date.getDate() === day && date.getFullYear() === year;
    }

    $('#regform').submit(function (event) {
        

        let allUserInfoValid = true;

        $('#regform input').each(function () {
            const inputId = $(this).attr('id');
            const value = $(this).val().trim();
            const pattern = patterns[inputId];

            if (inputId !== 'middlename') {
                if (!value) {
                    allUserInfoValid = false;
                } else if (pattern && !pattern.test(value)) {
                    allUserInfoValid = false;
                } else if (!$(this).hasClass('valid')) {
                    allUserInfoValid = false;
                }
            } else {
                // Special validation for middlename to allow empty value
                if (value && !pattern.test(value)) {
                    allUserInfoValid = false;
                }
            }
        });

        if (!allUserInfoValid) {
            // Prevent showing the modal if validation fails
            event.preventDefault(); // Prevent form submission
            alert("Please fill in all required fields correctly before submitting.");
        } else {

            alert("ACCOUNT CREATED SUCCCESSFULLY");



        }
    });

   

//            $.ajax({
//                type: 'POST',
//                url: '/TestingWeb/registration/add', // Replace with your form submission URL
//                data: $('#regform').serialize() + '&_=' + new Date().getTime(),
//                contentType: false, // The content type used when sending data to the server.
//                cache: false, // To unable request pages to be cached
//
//
//                success: function (response) {
////                    location.reload();
////
////                    // After refreshing, redirect to inventory page
////                    window.location.href = '/TestingWeb/home';
////                    
//                    // Optionally, you can also show an alert after refreshing
//                    alert("Registration Successful");
//                },
//                error: function (xhr, ajaxOptions, thrownError) {
//                    if (xhr.status === 404) {
//                        alert("Error: " + xhr.status + "\nResponse Text: " + xhr.responseText);
//                    } else {
//                        alert("Error: " + xhr.status + "\nResponse Text: " + xhr.responseText);
//                    }
//                }
//
//
//
//            });


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

    function passvisibility(password, form) {
        const toggleVisibility = document.querySelector('.' + password);
        const selector = '.' + form + ' input';
        const input = document.querySelector(selector);
        var passwordHidden = true;

        toggleVisibility.addEventListener('click', function () {
            if (passwordHidden) {
                input.setAttribute('type', 'text');
                $('.' + password).removeClass("fa-eye-slash").addClass("fa-eye");
            } else {
                input.setAttribute('type', 'password');
                $('.' + password).removeClass("fa-eye").addClass("fa-eye-slash");
            }
            passwordHidden = !passwordHidden;
        });
    }

    passvisibility('showPass', 'form-pass');
    passvisibility('confirmPass', 'form-confirm');
});

(function () {
    'use strict';

    var forms = document.querySelectorAll('.needs-validation');

    Array.prototype.slice.call(forms)
            .forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault();
                        event.stopPropagation();
                    }

                    form.classList.add('was-validated');
                }, false);
            });
})();

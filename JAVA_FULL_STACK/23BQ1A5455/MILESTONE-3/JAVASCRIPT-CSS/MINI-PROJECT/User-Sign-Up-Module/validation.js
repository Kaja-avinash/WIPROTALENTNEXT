// ----------------------------------------
// Display current date and time
// ----------------------------------------

function updateDateTime() {
    const now = new Date();

    document.getElementById("dateTime").textContent =
        now.toLocaleString();
}

updateDateTime();


// ----------------------------------------
// Three-minute timer
// ----------------------------------------

let startTime = Date.now();
let threeMinuteAlertShown = false;

setInterval(function () {

    const elapsedTime = Date.now() - startTime;

    if (elapsedTime >= 180000 && !threeMinuteAlertShown) {
        alert("3 mins passed");
        threeMinuteAlertShown = true;
    }

}, 1000);


// ----------------------------------------
// Form Validation
// ----------------------------------------

document.getElementById("signupForm").addEventListener("submit", function (event) {

    event.preventDefault();

    const firstName = document.getElementById("firstName");
    const lastName = document.getElementById("lastName");
    const password = document.getElementById("password");
    const confirmPassword = document.getElementById("confirmPassword");
    const mobile = document.getElementById("mobile");
    const dob = document.getElementById("dob");
    const email = document.getElementById("email");

    // ------------------------------------
    // First Name
    // ------------------------------------

    if (firstName.value.trim() === "") {
        alert("First Name must be entered.");
        firstName.focus();
        return;
    }

    if (!/^[A-Za-z]+$/.test(firstName.value.trim())) {
        alert("First Name must contain characters only.");
        firstName.focus();
        return;
    }


    // ------------------------------------
    // Last Name
    // ------------------------------------

    if (lastName.value.trim() === "") {
        alert("Last Name must be entered.");
        lastName.focus();
        return;
    }

    if (!/^[A-Za-z]+$/.test(lastName.value.trim())) {
        alert("Last Name must contain characters only.");
        lastName.focus();
        return;
    }


    // ------------------------------------
    // Password
    // ------------------------------------

    if (password.value === "") {
        alert("Password must be entered.");
        password.focus();
        return;
    }

    if (password.value.length < 6 || password.value.length > 20) {
        alert("Password length should be between 6 to 20 characters.");
        password.focus();
        return;
    }


    // ------------------------------------
    // Confirm Password
    // ------------------------------------

    if (confirmPassword.value === "") {
        alert("Confirm Password must be entered.");
        confirmPassword.focus();
        return;
    }

    if (confirmPassword.value.length < 6 ||
        confirmPassword.value.length > 20) {

        alert("Confirm Password length should be between 6 to 20 characters.");
        confirmPassword.focus();
        return;
    }

    if (password.value !== confirmPassword.value) {
        alert("Password and Confirm Password should be same.");
        confirmPassword.focus();
        return;
    }


    // ------------------------------------
    // Gender
    // ------------------------------------

    const gender = document.querySelector(
        'input[name="gender"]:checked'
    );

    if (!gender) {
        alert("Gender must be selected.");
        document.querySelector(
            'input[name="gender"]'
        ).focus();
        return;
    }


    // ------------------------------------
    // Mobile Number
    // ------------------------------------

    if (mobile.value.trim() === "") {
        alert("Mobile Number must be entered.");
        mobile.focus();
        return;
    }

    const mobilePattern =
        /^\d{3}[-. ]\d{3}[-. ]\d{4}$/;

    if (!mobilePattern.test(mobile.value.trim())) {
        alert(
            "Mobile Number must be in one of these formats:\n" +
            "XXX-XXX-XXXX\n" +
            "XXX.XXX.XXXX\n" +
            "XXX XXX XXXX"
        );

        mobile.focus();
        return;
    }


    // ------------------------------------
    // DOB
    // ------------------------------------

    if (dob.value.trim() === "") {
        alert("DOB must be entered.");
        dob.focus();
        return;
    }

    const dobPattern =
        /^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\d{4}$/;

    if (!dobPattern.test(dob.value.trim())) {
        alert("DOB must be in DD-MM-YYYY format.");
        dob.focus();
        return;
    }


    // ------------------------------------
    // Email Address
    // ------------------------------------

    if (email.value.trim() === "") {
        alert("Email Address must be entered.");
        email.focus();
        return;
    }

    const emailValue = email.value.trim();

    const emailPattern =
        /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

    if (!emailPattern.test(emailValue)) {
        alert("Enter a valid Email Address.");
        email.focus();
        return;
    }

    // @ must not be first character
    if (emailValue.startsWith("@")) {
        alert("The @ symbol must not be the first character.");
        email.focus();
        return;
    }

    // At least one character after @
    const atPosition = emailValue.indexOf("@");

    if (atPosition === emailValue.length - 1) {
        alert("There must be at least one character after @.");
        email.focus();
        return;
    }


    // ------------------------------------
    // Successful submission
    // ------------------------------------

    alert("Registration successful!");

});
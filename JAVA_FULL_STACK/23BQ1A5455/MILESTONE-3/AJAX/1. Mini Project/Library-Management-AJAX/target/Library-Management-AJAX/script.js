let emailAvailable = false;
let emailChecked = false;


function checkEmail() {

    const email = document.getElementById("email").value.trim();
    const message = document.getElementById("registerMessage");

    emailAvailable = false;
    emailChecked = false;

    if (email === "") {
        showMessage(
            "Invalid email-id",
            false
        );
        return;
    }

    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailPattern.test(email)) {
        showMessage(
            "Invalid email-id",
            false
        );
        return;
    }

    const xhr = new XMLHttpRequest();

    xhr.open(
        "GET",
        "check-email?email=" + encodeURIComponent(email),
        true
    );

    xhr.onreadystatechange = function () {

        if (xhr.readyState === 4) {

            if (xhr.status === 200) {

                try {

                    const data = JSON.parse(
                        xhr.responseText
                    );

                    if (data.error) {

                        showMessage(
                            data.error,
                            false
                        );

                        return;
                    }

                    emailChecked = true;

                    if (data.exists) {

                        emailAvailable = false;

                        showMessage(
                            "Email already exists!",
                            false
                        );

                    } else {

                        emailAvailable = true;

                        showMessage(
                            "Email is available.",
                            true
                        );
                    }

                } catch (error) {

                    showMessage(
                        "Invalid response received from server.",
                        false
                    );
                }

            } else {

                showMessage(
                    "Server error. Please try again.",
                    false
                );
            }
        }
    };

    xhr.send();
}


document.getElementById("registerForm").addEventListener(
    "submit",
    function (event) {

        event.preventDefault();

        const email =
            document.getElementById("email").value.trim();

        const password =
            document.getElementById("password").value;

        const name =
            document.getElementById("name").value.trim();

        const dateOfBirth =
            document.getElementById("dateOfBirth").value;

        const gender =
            document.getElementById("gender").value;

        const occupation =
            document.getElementById("occupation").value.trim();

        const city =
            document.getElementById("city").value.trim();

        const mobile =
            document.getElementById("mobile").value.trim();


        if (email === "" ||
            password === "" ||
            name === "") {

            showMessage(
                "Please fill all required fields.",
                false
            );

            return;
        }


        const emailPattern =
            /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailPattern.test(email)) {

            showMessage(
                "Invalid email-id",
                false
            );

            return;
        }


        if (!emailChecked) {

            showMessage(
                "Please check the email-id first.",
                false
            );

            return;
        }


        if (!emailAvailable) {

            showMessage(
                "Email already exists!",
                false
            );

            return;
        }


        const xhr = new XMLHttpRequest();

        xhr.open(
            "POST",
            "register",
            true
        );

        xhr.setRequestHeader(
            "Content-Type",
            "application/x-www-form-urlencoded"
        );

        xhr.onreadystatechange = function () {

            if (xhr.readyState === 4) {

                if (xhr.status === 200) {

                    try {

                        const data =
                            JSON.parse(xhr.responseText);

                        if (data.success) {

                            showMessage(
                                data.message,
                                true
                            );

                            setTimeout(
                                function () {

                                    window.location.href =
                                        "login.html";

                                },
                                1000
                            );

                        } else {

                            showMessage(
                                data.message,
                                false
                            );
                        }

                    } catch (error) {

                        showMessage(
                            "Invalid response received from server.",
                            false
                        );
                    }

                } else {

                    showMessage(
                        "Server error. Please try again.",
                        false
                    );
                }
            }
        };


        const formData =
            "email=" + encodeURIComponent(email) +
            "&password=" + encodeURIComponent(password) +
            "&name=" + encodeURIComponent(name) +
            "&dateOfBirth=" + encodeURIComponent(dateOfBirth) +
            "&gender=" + encodeURIComponent(gender) +
            "&occupation=" + encodeURIComponent(occupation) +
            "&city=" + encodeURIComponent(city) +
            "&mobile=" + encodeURIComponent(mobile);


        xhr.send(formData);
    }
);


function showMessage(text, success) {

    const message =
        document.getElementById("registerMessage");

    message.textContent = text;

    message.className =
        success
            ? "message success"
            : "message error";

    message.style.display = "block";
}
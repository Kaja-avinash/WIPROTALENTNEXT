function checkProfile() {

    const emailInput = document.getElementById("email");
    const message = document.getElementById("message");
    const profile = document.getElementById("profile");

    const email = emailInput.value.trim();

    // Hide previous results
    message.style.display = "none";
    profile.style.display = "none";

    // Check empty input
    if (email === "") {
        showMessage("Please enter an email address.", false);
        return;
    }

    // Validate email format
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailPattern.test(email)) {
        showMessage("Invalid Email", false);
        return;
    }

    // Create AJAX request
    const xhr = new XMLHttpRequest();

    xhr.open(
        "GET",
        "profile?email=" + encodeURIComponent(email),
        true
    );

    xhr.onreadystatechange = function () {

        if (xhr.readyState === 4) {

            if (xhr.status === 200) {

                try {

                    const data = JSON.parse(xhr.responseText);

                    if (data.error) {
                        showMessage(data.error, false);
                        return;
                    }

                    if (data.available) {

                        showMessage(
                            "Available!",
                            true
                        );

                    } else {

                        showMessage(
                            "Not Available!",
                            false
                        );

                        displayProfile(data);
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


function showMessage(text, success) {

    const message = document.getElementById("message");

    message.textContent = text;

    message.className = success
        ? "success"
        : "error";

    message.style.display = "block";
}


function displayProfile(data) {

    document.getElementById("profileEmail").textContent =
        data.email || "";

    document.getElementById("profileName").textContent =
        data.name || "";

    document.getElementById("profileDob").textContent =
        data.dateOfBirth || "";

    document.getElementById("profileGender").textContent =
        data.gender || "";

    document.getElementById("profileCity").textContent =
        data.city || "";

    document.getElementById("profilePincode").textContent =
        data.pincode || "";

    document.getElementById("profileMobile").textContent =
        data.mobile || "";

    document.getElementById("profile").style.display =
        "block";
}
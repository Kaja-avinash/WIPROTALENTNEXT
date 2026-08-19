function loadCities() {

    const state = document.getElementById("state").value;
    const cityTable = document.getElementById("cityTable");

    if (state === "") {
        cityTable.innerHTML = "";
        return;
    }

    const xhr = new XMLHttpRequest();

    xhr.open(
        "GET",
        "cities?state=" + encodeURIComponent(state),
        true
    );

    xhr.onreadystatechange = function () {

        if (xhr.readyState === 4) {

            if (xhr.status === 200) {
                cityTable.innerHTML = xhr.responseText;
            } else {
                cityTable.innerHTML =
                    "<p>Unable to retrieve city data.</p>";
            }
        }
    };

    xhr.send();
}
let mainBear = document.getElementById("main-bear");

let brB = document.getElementById("brown-bear");
brB.addEventListener("click", brownBear);

let blB = document.getElementById("black-bear");
blB.addEventListener("click", blackBear);

let poB = document.getElementById("polar-bear");
poB.addEventListener("click", polarBear);

function brownBear() {
    // console.log(bears[0].getAttribute("alt"));
    mainBear.setAttribute("src", brB.getAttribute("src"));
    mainBear.setAttribute("alt", brB.getAttribute("alt"));
}

function blackBear() {
    // console.log(bears[1].getAttribute("alt"));
    mainBear.setAttribute("src", blB.getAttribute("src"));
    mainBear.setAttribute("alt", blB.getAttribute("alt"));
}

function polarBear() {
    // console.log(bears[2].getAttribute("alt"));
    mainBear.setAttribute("src", poB.getAttribute("src"));
    mainBear.setAttribute("alt", poB.getAttribute("alt"));
}
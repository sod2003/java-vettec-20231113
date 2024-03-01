let bears = document.getElementsByClassName("bears")

for (let i = 0; i < bears.length; i++) {
    console.log(bears[i].getAttribute("alt") +" is loaded");
    bears[i].addEventListener("onClick", (this) => {
        let mainBear = document.getElementById("main-bear");
        mainBear.setAttribute("src", this.target.getAttribute("src"));
        mainBear.setAttribute("alt", this.target.getAttribute("alt"))
    });
}
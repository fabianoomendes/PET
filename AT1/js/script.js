
(function () {
    const menuToggle = document.querySelector(".menu")
    menuToggle.onclick = function (e) {
        const body = document.body
        body.classList.toggle('togle')
    }
})()
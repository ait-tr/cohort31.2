setInterval(printTime, 1000);

function printTime() {
    const date = new Date();
    const h = date.getHours() > 9 ? date.getHours() : '0' + date.getHours();
    const m = date.getMinutes() > 9 ? date.getMinutes() : '0' + date.getMinutes();
    const s = date.getSeconds() > 9 ? date.getSeconds() : '0' + date.getSeconds();
    const t = `${h} : ${m} : ${s}`;

    time.textContent = t;

    time.style.margin = '10px auto 0';
    time.style.width = 'fit-content';
}
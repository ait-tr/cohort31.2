console.log('Hello world!');
console.log(5 + 4);
console.log('9');

// однострочный комментарий
/* 
    однострочный комментарий
*/

console.log(document.body);

/*
        Ключевые слова для создания переменных
        Блочная область видимости:
    1. const - константа (не может быть переопределена)
    2. let - переменная (может быть переопределена)
    
        Глобальная область видимости:
    3. var (deprecated, устарело)
*/

let a = 10;
console.log(a);

a = '15';
console.log(a)

// const b = 10;
// console.log(b);

// b = 5; нельзя переопределять константу 
// console.log(b);

const div1 = document.getElementById('div1');
console.log(div1);

console.log(div1.style.border); //значение свойства border

div1.style.border = '1px solid black';

console.log(div1.style.border);


const div1Query = document.querySelector('#div1');
console.log(div1Query);

const pDiv1 = document.querySelectorAll('#div1 > p');
console.log(pDiv1);


// ""   ''   ``
// 'Кто-то сказал: "a" '
// "I'm learning IT"
// 

for (let i = 0; i < pDiv1.length; i++) {
    pDiv1[i].innerHTML = `<span>new text ${i + 1}</span>`; // "<span>new text " + i + " </span>"
}

const children = div1.children;
console.log(children.length);

for (let i = 0; i < children.length; i++) {
    children[i].style.color = 'red';    
};

const newP = document.createElement('p');
console.log(newP);

const newPText = document.createTextNode('This text was created by special method');

newP.appendChild(newPText);

div1.appendChild(newP); // insertBefore() - в начало



//  HomeWork

const t = setInterval(move, 20)
let pos = 0;
const box = document.getElementById('box');

function move() {
    pos++;
    if (pos == 150) {
        clearInterval(t)
    }
    box.style.top = pos + 'px';
    box.style.left = pos + 'px';
}
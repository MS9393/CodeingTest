//let input = require("fs").readFileSync('/dev/stdin').toString().trim();
let input = `5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91`;
let originArr = [];
let sumArr = [];
let sum = 0;
for(let i=0; i<=parseInt(input.split('\n')[0]); i++){
    if(i != 0)
        originArr.push(input.split('\n')[i].split(' ').map(Number));
}
for(let i=0; i<originArr.length; i++){
    originArr[i].shift();
    originArr[i].forEach(x =>{
        sum += x;
    });
    avg = sum/originArr[i].length;
    sumArr.push(avg);
    sum = 0;
}
console.log(originArr);
console.log(sumArr);
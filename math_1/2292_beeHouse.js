let input = require('fs').readFileSync('/dev/stdin').toString();
//let input = `58`;
let range = 1, block = 1;
while (block < input) {  
	block += 6 * range;
	range++;
}
console.log(range);
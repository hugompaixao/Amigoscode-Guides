// If statements
// var condition = 1 < 0;

// if (condition) {
//     console.log("Runs....");
// } else {
//     console.log("Else condition ran..");
// }

var gender = 'FEMALE';

if (gender == 'M') {
    console.log('Male');
} else if (gender == 'F' || gender == 'FEMALE') {
    console.log('Female');
} else {
    console.log('Unkown');
}

console.log();

// Ternary If Statement
var number = 101;
var result = number % 2 == 0 ? 'Even' : 'Odd';
console.log(result); 

// if (number % 2 == 0) {
//     console.log('even');
// } else {
//     console.log('odd');
// }
// Functions
console.log("Functions")
function addNumbers(number1, number2) {
    var addition = number1 + number2;
    return addition;
}

var result1 = addNumbers(10, 10);
var result2 = addNumbers(7, 3);

console.log(result1);
console.log(result2);
console.log()

// Built in functions
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference
console.log("Built in Functions")
var person = {
    name: "Jamila"
}
console.log(Object.values(person));
console.log(Object.keys(person));

console.log("Jamila".toUpperCase());
console.log("Jamila".toLocaleLowerCase());
console.log("Jamila".indexOf("i"));
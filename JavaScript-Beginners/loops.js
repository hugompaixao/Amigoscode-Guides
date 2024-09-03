// Loops
/**
 * For Loop
 */
for (var i = 0; i <= 10; i++) {
    console.log(i);
}

console.log()

console.log("Loop through names")
var names = [
    "Alex",
    "Jamila", 
    "Joe", 
    "Aisha",
    "Bob"
];

for (var i = 0; i < names.length; i++) {
    console.log(names[i]);
}

console.log()

/**
 * Other types of for loops
 */
console.log("fori");
for (var i = 0; i < names.length; i++) {
    console.log(names[i]);
}

console.log();

console.log("for of");
for (const name of names) {
    console.log(name);
}

console.log();

console.log("forEach");
names.forEach(function(name) {
    console.log(name)
});

console.log();

/**
 * While Loop
 */
console.log("Numbers:");
var number = 0;
while (number < 5) {
    console.log(number);
    number = number + 1;
}

console.log();

console.log("Using Condition");
var condition = true
while (condition) {
    console.log("hello");
    condition = false;
}

console.log();

console.log("Loop through names");
var index = 0;
while(index < names.length) {
    console.log(names[index]);
    index = index + 1;
}

console.log();

/**
 * Do While Loop
 */
console.log("Do While");
do {
    console.log("hello");
} while(false);
console.log();
// Break and Continue
/**
 * Break
 */
console.log("Break");
for (var i = 0; i <= 10; i++) {
    console.log(i);
    if (i == 5) {
        break;
    }
}

console.log();

/**
 * Continue
 */
console.log("Continue");
for (var i = 0; i <= 10; i++) {
    if (i < 5) {
        continue;
    }
    console.log(i);
}
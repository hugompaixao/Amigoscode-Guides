// Const
// let
console.log("Let");
let brand_1 = "Nike"
brand_1 = {};
brand_1 = 10;
brand_1 = function() {
    return "Hello";
}
console.log(brand_1);

console.log();

// Const
console.log("Const");
const brand_2 = "Nike"
//brand_2 = {};
//brand_2 = 10;
//brand_2 = function() {
//    return "Hello";
//}
console.log(brand_2);

console.log();

// Object
console.log("Object");
const brand_3 = "Nike"
brandObject = {};
brandObject["brand"] = brand_3;
delete brandObject.brand;
//brand_3 = function() {
//    return "Hello";
//}
console.log(brand_3);
console.log(brandObject);

/**
 * Let vs Const
 * Start with const keyword functions variables objects
 * To reassine use let
 */
const hello = function() {
    console.log("Hello");
}
console.log(hello());
fun main() {
    foo(bar = {
        println("Function")
    })
    foo(bar = {
        println("World")
    })
    foo {
        println("other way")
    }
    println()
    val (v1, v2) = twoValues()
    println("$v1 $v2")

    val (t1, t2, t3) = threeValues()
    println("$t1, $t2, $t3")

}
// must be last argument
fun foo(bar: ()-> Unit) {
    println("Hello")
    bar()
}

//Function return 2 values
fun twoValues() : Pair<String, Int> {
    return "Hello" to 2
}

//Function return 3 values
fun threeValues() : Triple<String, Int, Char> {
    return Triple("Hello", 20, 'C')
}

fun main() {
    val number = 23
    if (number < 20) {
        println("Smaller")
    } else {
        println("Bigger")
    }

    val number2 = if (number < 20) 20 else 0
    println(number2)
}
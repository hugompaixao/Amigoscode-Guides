fun main() {
    // When Part 1
    val gender = 'F'

    when(gender){
        'F' -> println("Female")
        'M' -> println("Male")
        else -> println("Unknown")
    }

    val g = when(gender){
        'F' -> "Female"
        'M' -> "Male"
        else -> "Unknown"
    }
    println(g)


    // When Part 2
    val number = 20
    when {
        (number < 20) -> println("bad")
        (number > 20) -> println("good")
        else -> println("mid")
    }

    val age = 15
    when(age) {
        in 13..19 -> println("teen")
        !in 0..12 -> println("child")
        else -> println("adult")
    }
}
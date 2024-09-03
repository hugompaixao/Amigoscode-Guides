fun main() {
    /**
    *For
    * */

    val names = listOf("Hugo", "Mariol", "Alex", "Joao")
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for (name in names) {
        val n = name.replaceFirstChar { it.lowercase() }
        println(n)
    }
    for (number in numbers) {
        println(number)
    }
    // range
    for (i in 1..5) println(i)
    // down to
    for (i in 5 downTo 1) println(i)
    // using step
    for (i in 1..5 step 2) println(i)

    // String
    val brand = "nike"
    for (c in brand) {
        println(c)
    }

    // forEach
    names.forEach { println(it) }

    /**
     * While
     */

    var x = 1
    while (x < 5) {
        println(x)
        ++x
    }

    /**
     * Do While
     */
    do {
        print("Hello")
    } while (false)
}


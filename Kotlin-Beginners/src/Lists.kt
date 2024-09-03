fun main() {
    // Lists Part 1
    val names_1: List<String> = listOf(
        "Joao", "Carlos", "Antonio", "Mario"
    )
    println(names_1)
    println(names_1.size)
    println(names_1.contains("Mario"))


    // Lists Part 2
    val names_2 = mutableListOf(
        "Joao", "Carlos", "Antonio", "Mario"
    )
    names_2.remove("Mario")
    println(names_2)
    println(names_2.size)
    println(names_2.contains("Mario"))
    names_2.add("Alex")
    println(names_2)


    // Lists Part 2
    val names = listOf(
        "Joao", "Carlos", "Antonio", "Mario"
    )
    println(names_1)

    val (one, tow, _, four) = names
    println("$one $tow $four")
}
fun main() {
    // Arrays Part 1
    val names = arrayOf("Joao", "Carlos", "Antonio", "Mario")

    if ("Andre" in names) println("Found") else println("Not Found")
    println(names[0])
    println(names[1])
    names[2] = "Andre"
    println(names[2])
    println(names[3])
    println(names.size)
    println(names.contentToString())
    if ("Andre" in names) println("Found") else println("Not Found")


    // Arrays Part 2
    val arrayOfNulls = arrayOfNulls<String>(9)
    arrayOfNulls.fill("*")
    arrayOfNulls[4] = "Hello"
    println(arrayOfNulls.contentToString())


}
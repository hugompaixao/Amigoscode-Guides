import kotlin.math.*

fun main() {
    println("Hello World!")

    val email = """
            Hello %s
              How
            Are You
    """.trimIndent()

    println(email.format("Ana"))
}
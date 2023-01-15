package signature

fun main() {
    val (firstName, lastName) = readln().split(" ")
    val length = ("* $firstName $lastName *").length

    repeat(length){ print("*") }
    println()
    println("* $firstName $lastName *")

    /*println(" _____________ \n" +
            "| Hyper Skill |\n" +
            " ••••••••••••• ")*/

    repeat(length){ print("*") }
}

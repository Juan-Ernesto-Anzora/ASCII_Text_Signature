fun main() {
    val ch1 = readln().first()
    val ch2 = readln().first()
    val ch3 = readln().first()

    println(((ch1 < ch2) && (ch2 < ch3) ) && ch2 == ch1 + 1 && ch3 == ch2 + 1)
}
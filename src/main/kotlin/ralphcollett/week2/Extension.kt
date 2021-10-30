package ralphcollett.week2

fun List<Int>.sum(): Int = fold(0, Int::plus)

fun main() {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}
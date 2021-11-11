package ralphcollett.week5

import ralphcollett.eq

fun fibonacci(): Sequence<Int> =
    generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }

fun main(args: Array<String>) {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}
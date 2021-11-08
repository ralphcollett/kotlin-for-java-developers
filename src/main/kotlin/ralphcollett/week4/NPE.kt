package ralphcollett.week4

open class A(open val value: String) {
    init {
        value.length
    }
}

class B(override val value: String) : A(value)

fun main(args: Array<String>) {
    B("a")
}
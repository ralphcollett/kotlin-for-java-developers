package ralphcollett.week4

// Without modifying the class 'A' complete the code in 'main'
// so that an exception UninitializedPropertyAccessException was thrown.
// Then fix the newly added code in 'main' so that no exception was thrown.

class LateInitA {
    private lateinit var prop: String

    fun setUp() {
        prop = "value"
    }

    fun display() {
        println(prop)
    }
}

fun main(args: Array<String>) {
    val lateInitA = LateInitA()
    lateInitA.setUp()
    lateInitA.display()
}
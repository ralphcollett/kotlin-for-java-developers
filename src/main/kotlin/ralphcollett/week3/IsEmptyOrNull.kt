package ralphcollett.week3

import ralphcollett.eq

// Add and implement an extension function 'isEmptyOrNull()' on the type String?. It should return true, if the string is null or empty.

fun String?.isEmptyOrNull() = this?.isEmpty() ?: true

fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}
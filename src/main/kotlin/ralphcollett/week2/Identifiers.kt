package ralphcollett.week2

fun isValidIdentifier(s: String): Boolean {
    val lowerCase = 'a' .. 'z'
    val upperCase = 'A' .. 'Z'
    val digits = '0' .. '9'
    val validFirstCharacter = lowerCase.toList() + upperCase.toList() + '_'
    val validCharacters = validFirstCharacter + digits.toList()
    return when {
        s.isEmpty() -> false
        s[0] !in validFirstCharacter -> false
        s.any { it !in validCharacters } -> false
        else -> true
    }
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

/*var greeting: String? = "HIIIIIIII !!!!"*/
var greeting: String? = null

fun main() {

    if (greeting != null){
        println(greeting)
    } else {
        println("Hellow there you litle")
    }

    when (greeting){
        null -> println(greeting)
        else -> println("Hellow there you litle")
    }

    val greeting_to_print = if(greeting != null) greeting else "Hi"
    println(greeting_to_print)

    val greeting_to_print_2 = when (greeting){
        null -> "Hi"
        else -> greeting
    }
    println(greeting_to_print_2)
}
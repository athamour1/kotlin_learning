fun getGreetings(): String{
    return "Greetings"
}

fun sayGreetings(){
    println("From sayGreetings")
    println(getGreetings())
}

fun sayHello(greetings:String, itemToGreet:String) = println("$greetings $itemToGreet")

fun main() {
    println("Hello from main function")
    println(getGreetings())
    sayGreetings()
    sayHello("hello", "thanos")
    sayHello("From", "Kotlin")
}
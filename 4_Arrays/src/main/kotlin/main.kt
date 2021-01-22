fun sayHello(greeting: String, itemsToGreet:List<String>){
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun sayHello2 (greeting: String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
}

fun greetingPerson(greeting: String = "Hi", name: String = "Kotlin"){
    println("$greeting $name")
}

fun main() {
    val InterstingThings = arrayOf("Kotlin","Programming","Piano")
    println(InterstingThings.size)
    println(InterstingThings[0])
    println(InterstingThings.get(0))
    println("\n")
    for (InterstingThings in InterstingThings){
        println(InterstingThings)
    }
    println("\n")
    InterstingThings.forEach {
        println(it)
    }
    println("\n")
    InterstingThings.forEach { InterstingThings ->
        println(InterstingThings)
    }
    println("\n")
    InterstingThings.forEachIndexed { index, InterstingThing->
        println("$InterstingThing is at index $index")
    }
    println("\n")
    val InterstingThings2 = mutableListOf("Kotlin2","Programming2","Piano2")
    println(InterstingThings2.size)
    println(InterstingThings2[0])
    println(InterstingThings2.get(0))
    println("\n")
    for (InterstingThings2 in InterstingThings2){
        println(InterstingThings)
    }
    println("\n")
    InterstingThings2.forEach {
        println(it)
    }
    println("\n")
    InterstingThings2.forEach { InterstingThings2 ->
        println(InterstingThings2)
    }
    println("\n")
    InterstingThings2.forEachIndexed { index, InterstingThing2->
        println("$InterstingThing2 is at index $index")
    }
    InterstingThings2.add("Sex")
    println("\n")
    InterstingThings2.forEachIndexed { index, InterstingThing2->
        println("$InterstingThing2 is at index $index")
    }
    println("\n")
    sayHello("hello", InterstingThings2)
    println("\n")
    sayHello2("hello", *InterstingThings)
    println("\n")
    greetingPerson(greeting = "Hello", name = "Thano" )
    println("\n")
    greetingPerson(name = "Thano", greeting = "Hello")
    println("\n")
    greetingPerson(name = "Thano")
    println("\n")
    greetingPerson(greeting = "Hello")
    println("\n")
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "C")
    map.forEach { key, value -> println("$key -> $value")  }
    println("\n")
    map.put(4, "d")
    map.forEach { key, value -> println("$key -> $value")  }
    println("\n")
}
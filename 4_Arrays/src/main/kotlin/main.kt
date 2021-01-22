fun sayHello(greetings:String, itemToGreet:String) = println("$greetings $itemToGreet")

fun main() {
    val InterstingThings = arrayOf("Kotlin","Programming","Piano")
    println(InterstingThings.size)
    println(InterstingThings[0])
    println(InterstingThings.get(0))

    for (InterstingThings in InterstingThings){
        println(InterstingThings)
    }

    InterstingThings.forEach {
        println(it)
    }

    InterstingThings.forEach { InterstingThings ->
        println(InterstingThings)
    }

    InterstingThings.forEachIndexed { index, InterstingThing->
        println("$InterstingThing is at index $index")
    }

    val InterstingThings2 = listOf("Kotlin2","Programming2","Piano2")
    println(InterstingThings2.size)
    println(InterstingThings2[0])
    println(InterstingThings2.get(0))

    for (InterstingThings2 in InterstingThings2){
        println(InterstingThings)
    }

    InterstingThings2.forEach {
        println(it)
    }

    InterstingThings2.forEach { InterstingThings2 ->
        println(InterstingThings2)
    }

    InterstingThings2.forEachIndexed { index, InterstingThing2->
        println("$InterstingThing2 is at index $index")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "C")
    map.forEach { key, value -> println("$key -> $value")  }
}
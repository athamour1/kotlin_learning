class person(val firstName:String = "Kati", val lastName:String = "Thanos"){
    var nickName: String? = null
        set(value) {
            field = value
            println("LOG : The new nickname is $value")
        }
}
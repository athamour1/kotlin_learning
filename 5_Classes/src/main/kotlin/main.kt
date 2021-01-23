fun main(args: Array<String>) {
  val person=person("Thanos", "Mourtzoukos")
  println(person.firstName)
  println(person.lastName)

  val person2=person()
  println(person2.firstName)
  println(person2.lastName)
  person.nickName = "Malakas"
  person.nickName = "GEIASOOO"
}
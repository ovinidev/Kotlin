fun main() {
  class Person(val name: String, val age: Int) {
      
    fun introduce() {
      println("Hi, my name is $name and I'm $age years old.")
    }
  }
    
  val test = Person("Vini", 22)
  test.introduce()
} 
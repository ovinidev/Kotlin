// 1. Simple Class with Properties and Methods
class Person(val name: String, val age: Int) {
	fun introduce() {
		println("Hi, my name is $name and I'm $age years old.")
	}
}

// 2. Class with Primary Constructor and Initializer Block
class Rectangle(val width: Double, val height: Double) {
	init {
		println("Rectangle created with width: $width and height: $height")
	}

	fun calculateArea(): Double {
		return width * height
	}
}

// 3. Class with Secondary Constructor
class Car(val brand: String, val model: String) {
	var year: Int = 0

	constructor(brand: String, model: String, year: Int) : this(brand, model) {
		this.year = year
	}

	fun carInfo() {
		println("$brand $model, Year: $year")
	}
}

// 4. Data Class
data class User(val id: Int, val username: String)

// 5. Abstract Class
abstract class Shape {
	abstract fun calculateArea(): Double
}

class Circle(val radius: Double) : Shape() {
	override fun calculateArea(): Double {
		return Math.PI * radius * radius
	}
}

// 6. Interface
interface Animal {
	fun makeSound()
}

class Dog : Animal {
	override fun makeSound() {
		println("Woof! Woof!")
	}
}

// 7. Inheritance
open class Vehicle(val type: String) {
	fun describe() {
		println("This is a $type.")
	}
}

class Bike(type: String, val brand: String) : Vehicle(type) {
	fun bikeInfo() {
		println("Bike brand: $brand")
	}
}

// 8. Singleton (Using Object)
object Singleton {
	var counter = 0
	fun showMessage() {
		println("This is a singleton object. Counter: $counter")
	}
}

// 9. Companion Object
class MathUtils {
	companion object {
		fun square(number: Int): Int {
			return number * number
		}
	}
}

// 10. Nested and Inner Classes
class OuterClass {
	class NestedClass {
		fun nestedMessage() {
			println("Hello from the nested class!")
		}
	}

	inner class InnerClass {
		fun innerMessage() {
			println("Hello from the inner class!")
		}
	}
}

fun main() {
	// 1. Simple Class
	val person = Person("Alice", 25)
	person.introduce()

	// 2. Class with Initializer Block
	val rectangle = Rectangle(5.0, 3.0)
	println("Rectangle area: ${rectangle.calculateArea()}")

	// 3. Class with Secondary Constructor
	val car = Car("Toyota", "Corolla", 2022)
	car.carInfo()

	// 4. Data Class
	val user = User(1, "JohnDoe")
	println(user)

	// 5. Abstract Class
	val circle = Circle(7.0)
	println("Circle area: ${circle.calculateArea()}")

	// 6. Interface
	val dog = Dog()
	dog.makeSound()

	// 7. Inheritance
	val bike = Bike("Two-wheeler", "Yamaha")
	bike.describe()
	bike.bikeInfo()

	// 8. Singleton
	Singleton.counter++
	Singleton.showMessage()

	// 9. Companion Object
	println("Square of 4: ${MathUtils.square(4)}")

	// 10. Nested and Inner Classes
	val nested = OuterClass.NestedClass()
	nested.nestedMessage()

	val outer = OuterClass()
	val inner = outer.InnerClass()
	inner.innerMessage()
}

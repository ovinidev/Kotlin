fun main() {
	// 1. Basic Lambda Example
	val add: (Int, Int) -> Int = { a, b -> a + b }
	println("Addition: ${add(5, 10)}") // Output: 15

	// 2. Lambda with No Parameters
	val greet: () -> String = { "Hello, Kotlin!" }
	println(greet()) // Output: Hello, Kotlin!

	// 3. Lambda as a Function Argument
	fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
		return operation(a, b)
	}
	val result = calculate(4, 5) { x, y -> x * y }
	println("Multiplication: $result") // Output: 20

	// 4. Lambda with Single Parameter (Implicit `it`)
	val double: (Int) -> Int = { it * 2 }
	println("Double of 6: ${double(6)}") // Output: 12

	// 5. Using Lambdas with Collection Operations
	val numbers = listOf(1, 2, 3, 4, 5, 6)

	// Filtering
	val evenNumbers = numbers.filter { it % 2 == 0 }
	println("Even Numbers: $evenNumbers") // Output: [2, 4, 6]

	// Mapping
	val squares = numbers.map { it * it }
	println("Squares: $squares") // Output: [1, 4, 9, 16, 25, 36]

	// 6. Returning a Lambda
	fun createMultiplier(multiplier: Int): (Int) -> Int {
		return { number -> number * multiplier }
	}
	val multiplyBy3 = createMultiplier(3)
	println("3 times 4 is: ${multiplyBy3(4)}") // Output: 12

	// 7. Higher-Order Function with Inline Lambda
	fun repeatAction(times: Int, action: (Int) -> Unit) {
		for (i in 1..times) {
				action(i)
		}
	}
	repeatAction(3) { println("Action executed for iteration $it") }
	// Output:
	// Action executed for iteration 1
	// Action executed for iteration 2
	// Action executed for iteration 3

	// 8. Lambdas with Scope Functions
	// Using `run`
	val runResult = run {
		val x = 10
		val y = 20
		x + y
	}
	println("Result of run: $runResult") // Output: 30

	// Using `apply`
	data class Person(var name: String, var age: Int)
	val person = Person("Vinicius", 22).apply {
		name = "Celestino"
		age = 23
	}
	println(person) // Output: Person(name=Celestino, age=23)

	// 9. Capturing External Variables in Lambda
	var counter = 0
	val increment: () -> Unit = { counter++ }
	increment()
	increment()
	println("Counter: $counter") // Output: 2
}

// 1. Simple Function (No Parameters, No Return Value)
fun greet() {
	println("Hello, Kotlin!")
}

// 2. Function with Parameters
fun greet(name: String) {
	println("Hello, $name!")
}

// 3. Function with Return Value
fun add(a: Int, b: Int): Int {
	return a + b
}

// 4. Function with Default Parameter Value
fun greetWithDefault(name: String = "Guest") {
	println("Hello, $name!")
}

// 5. Function with Multiple Return Values (Using Pair)
fun getPersonInfo(): Pair<String, Int> {
	return Pair("Alice", 25)
}

// 6. Function with Variable Number of Arguments (Varargs)
fun sum(vararg numbers: Int): Int {
	return numbers.sum()
}

// 7. Lambda Function
val multiply: (Int, Int) -> Int = { a, b -> a * b }

// 8. Extension Function
fun String.lastChar(): Char {
	return this[this.length - 1]
}

// 9. Anonymous Function
val divide = fun(a: Int, b: Int): Int {
	return a / b
}

// 10. Higher-Order Function
fun operation(a: Int, b: Int, func: (Int, Int) -> Int): Int {
	return func(a, b)
}

fun main() {
	// Calling the functions
	greet() // Simple function with no parameters

	greet("Bob") // Function with parameters

	val result = add(5, 3) // Function with return value
	println("Addition Result: $result")

	greetWithDefault() // Function with default parameter
	greetWithDefault("Charlie") // Function with default parameter with custom value

	val (name, age) = getPersonInfo() // Function with multiple return values (Pair)
	println("Name: $name, Age: $age")

	println("Sum: ${sum(1, 2, 3, 4)}") // Function with varargs

	println("Multiplication: ${multiply(4, 3)}") // Lambda function

	val nameString = "Kotlin"
	println("Last Character: ${nameString.lastChar()}") // Extension function

	println("Division Result: ${divide(10, 2)}") // Anonymous function

	// Higher-Order Function with Lambda
	val sumResult = operation(5, 3) { x, y -> x + y }
	println("Higher-Order Function Sum: $sumResult")
}

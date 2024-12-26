fun main() {
  var mutableVar = 22
  mutableVar = 10

  val intNumber: Int = 42           // Integer (32-bit)
  val longNumber: Long = 300000L    // Long (64-bit)
  val shortNumber: Short = 120      // Short (16-bit)
  val byteNumber: Byte = 8          // Byte (8-bit)
  
  val floatNumber: Float = 3.14F    // Float (32-bit)
  val doubleNumber: Double = 2.718  // Double (64-bit)
  
  val singleChar: Char = 'A'        // Single character
  val text: String = "Hello, Kotlin!" // String

  val isKotlinFun: Boolean = true   // Boolean (true or false)
  val isJavaBetter: Boolean = false
  
  val nullableInt: Int? = null      // Nullable Integer
  val nullableString: String? = null // Nullable String

  val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
  val stringArray: Array<String> = arrayOf("Apple", "Banana", "Cherry")

  println("intNumber: $intNumber")
  println("longNumber: $longNumber")
  println("shortNumber: $shortNumber")
  println("byteNumber: $byteNumber")
  println("floatNumber: $floatNumber")
  println("doubleNumber: $doubleNumber")
  println("singleChar: $singleChar")
  println("text: $text")
  println("isKotlinFun: $isKotlinFun")
  println("isJavaBetter: $isJavaBetter")
  println("nullableInt: $nullableInt")
  println("nullableString: $nullableString")
}




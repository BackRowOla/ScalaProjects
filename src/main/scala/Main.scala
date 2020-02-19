class Person(var name: String, var age: Int)

object Main {

  def main(args: Array[String]): Unit = {

    /*
    Basic Exercises
     */
    // Hello World!
    println("Hello World!")

    // Assignment
    var text = "Hello World!"
    println(text)

    // Parameters
    helloWorld("something")

    // Return types
    println(foo("Hello World!"))

    // Type inference
    newFoo(2.1)
    newFoo("some text")
    newFoo(5)
    newFoo(true)

    // Strings
    println(endOfString("Hello", 3))

    // Strings 2
    println(fourParamStringMethod("Ha", "llo", 'a', 'e'))

    // Operators
    println(operatorMethod(2, 3))

    // Conditionals
    print("Conditionals - 2nd Operation method: ")
    println(operatorMethod2(2, 5, bool = false))

    // Conditionals 2
    print("Conditionals 2 - 3rd Operation method: ")
    println(operatorMethod3(2, 12, bool = true))

    // Iteration
    iterationMethod("Hi", 3)

    // Iteration 2

    // Iteration 3

    // Iteration 4

    // Pattern Matching 1

    // Pattern Matching 2

    // Functional 1

    /*
    Intermediate Exercises
    */
  }

  def helloWorld(text: String): Unit = {
    println(text)
  }

  def foo(text: String): String = {
    text
  }

  def newFoo(thing: Any): Unit = {
    println(thing)
  }

  2

  def endOfString(word: String, index: Int): String = {
    word.substring(word.length - index)
  }

  def fourParamStringMethod(word1: String, word2: String, char1: Char, char2: Char): String = {
    val newWord = word1 concat word2
    println(newWord)
    newWord.replace(char1, char2)
  }

  def operatorMethod(x: Int, y: Int): Int = x + y

  def operatorMethod2(x: Int, y: Int, bool: Boolean): Int = {
    val output: Int = if (!bool) x * y else x + y
    output
  }

  def operatorMethod3(x: Int, y: Int, bool: Boolean): Int = {
    val output: Int = if (x == 0 && y == 0) 0
    else if (x == 0) y
    else if (y == 0) x
    else if (!bool) x * y
    else x + y

    output
  }

  def iterationMethod(word: String, num: Int): Unit = {
    for (i <- 1 to num)
      println(word)
  }

  def iterationMethod2(word: String, num: Int): Unit = {
    /*
    Unfinished

    create an empty string, for the length of num, concat the string onto the existing string val
    when num has been reached create new line and repeat for has many values num has.

    i = how many rows and j = how many items in row
     */


    //    for (i <- 1 to num; j <- 1 to num) {
    //      var emptyString = ""
    //
    //    }

    for (i <- 1 to num) {

    }

  }

}
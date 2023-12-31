/*
// Scala program of higher order
// function

// Creating object
object HigherOrderFunction
{
  // Main method
  def main(args: Array[String])
  {

    // Creating a list of numbers
    val num = List(7, 8, 9)

    // Defining a method
    def multiplyValue = (y: Int) => y * 4

    // Creating a higher order function
    // that is assigned to the variable
    val result = num.map(y => multiplyValue(y))

    // Displays output
    println("Multiplied List is: " + result)
  }
}*/

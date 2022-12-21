package scalabasics

object Functions extends App {

  def aFunction(a: String, b: Int) : String ={
    a + " " + b
  }

  println(aFunction("Rishi",92))

  def aParameterlessFunction(): Int = 42;

  println(aParameterlessFunction())
  //println(aParameterlessFunction) // only works in scala 2

  def aRepeatedFunction(aString: String, n : Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 4))

  //When you need loops use Recursion
  // Compiler can also infer the return types of the function on its own if its not given

  def aFunction1(a: String, b: Int) = {
    a + " " + b
  }
  println(aFunction1("Rishi",92))

  // But if return type is not explicitly provided for an recursive function the compiler will complain
  // because compiler can't figure out the return type of recursive function on its own

  def aFunctionWithSideEffects(aString : String) : Unit = {
    println(aString)
  }


  //Auxilary Functions -
  def aBigFunction(n: Int) : Int = {
    def aSmallFunction(a: Int, b: Int) = a + b

    aSmallFunction(n, n-1)
  }

  println(aBigFunction(5))

  /*
    1. A Greeting Function(name,age) => "Hi, my name is $name and I am $age years old"
    2. Factorial Function 1*2*3*4*...*n
    3. A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n-1) + f(n-2)
    4. test if the number is prime
    */

  //1. A Greeting Function
  def aGreetingFunction(name: String, age: Int) : Unit = {
    println("Hi, My Name is " + name + " and I am "+ age + " years old")
  }
  aGreetingFunction("Rishi", 30)

  //2. Factorial Function
  def computeFactorial(num: Long): Long = {
    if(num == 1) num
    else num * computeFactorial(num - 1)
  }
  println("Factorial of 5 is " + computeFactorial(5))

  println("Factorial of 20 is " + computeFactorial(20))

  //3. Fibonacci Series


}

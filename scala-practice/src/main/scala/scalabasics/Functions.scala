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

}

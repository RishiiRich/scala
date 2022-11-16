package scalabasics

object Functions extends App {

  def aFunction(a: String, b: Int) : String ={
    a + " " + b
  }

  println(aFunction("Rishi",92))

  def aParameterlessFunction(): Int = 42;

  println(aParameterlessFunction())
  //println(aParameterlessFunction) // only works in scala 2

}

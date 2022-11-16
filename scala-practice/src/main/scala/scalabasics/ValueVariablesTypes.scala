package scalabasics

object ValueVariablesTypes extends App {

  val x: Int = 42;
  println(x);

  //Val are immutable

  //Scala Compiler can infer types

  val aString: String = "hello"
  println(aString)

  val anotherString = "goodBye";
  println(anotherString)

  val aBoolean: Boolean = true;
  val aBoolean2 = false;
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 224
  val aLong: Long = 13242242432L
  val aFloat: Float = 2.0f
  val aDouble: Double = 44.9877


  //Variables in Scala
  //Var are mutable
  var aVariable: Int = 45
  aVariable = 56 // Also called as Side effects in functional programming
  println(aVariable)

}

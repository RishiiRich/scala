package scalabasics

import scala.language.postfixOps

object Expressions extends App {

  val x = 1+2; //Expression
  println(x)


  var aVariable = 2
  aVariable += 3; //thi also works with -= *= /= ... side effects
  println(aVariable)



  //Instructions Vs Expressions
  //Instruction is something you tell the computer to do that-- in java, Python we use Instruction
  /*Expressions is something which has a value...
  In functional programming like scala we will think in terms of expressions..
  every single bit of your code will compute a value...Lets discuss this with one example*/

  //IF Expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3;
  println("aConditionValue=" + aConditionValue)
  println(if (aCondition) 5 else 3)

  /*From the above example we can see that IF Expression is returning some value so it is called as IF Expression
   and not an IF instructions*/
  //As in java we tell the compiler if the condition in true then do this else do this but here it is retuning some value

  //Loops
  var i = 0
  while (i < 10) {
    println("num="+i)
    i += 1
  }

  //NEVER USE LOOP LIKE THIS above because see below
  val aWhileLoop = while (i < 10) {
    println("num=" + i)
    i += 1
  }
  //aWhileLoop has return type as Unit

  val aWierdVariable = (aVariable = 3)
  println(aWierdVariable)

  //side effects : println, while, reassigning


  //Code Blocks

  val aCodeBlock = {
    val x = 5;
    val y = x + 5;

    if(y>x) "Hello!!" else "GoodBye!!"
  }


  println(aCodeBlock) // the value of the code block is the value of the last expression
  //Instructions are executed(Java) vs Expressions are evaluated(Scala)
  //In Scala we think in terms of expressions


  //1. Difference between "hello world" vs printLn("Hello World")
  /* "Hello World" is the value of type string
  * printLn("Hello World") is an expression which is a side effects and it is returning unit */
  //2.
  val someValue = {
    2<3
  }
  println(someValue)

  val someOtheralue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtheralue)




}

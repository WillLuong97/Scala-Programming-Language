package example

object Hello {
  /**
   * This is the main entry point to the program. 
   * When the program starts the `main` method will be executed 
   * 
   * @param args the argument to the program. 
   * @group console-output 
   */
  //Main function: 
  def main(args: Array[String]): Unit = { 
      //Scala keyword: val, var, def, lazy, type
      //val == var in 
      println("-" * 50)
      val const = {
        println("I'm going to bind const to 1337")
        1337 
      }
      
      
      println(const)

      //var == let in JS
      var let = { //let is just a declared variable not a buit-in Scala keywords
        println("I'm going to bind let to 1337")

        1337
      }

      let = { 
        println("I am going to assign 1338 to let")
        let + 1

      }
     println(let)

      //to increment an int, use += 
      let += 1
      println(let)
    
    //def: a function declaration 
    def function = {
      println("I am going to bind a function to 1337")
      println("But I will recalculate it everytime")
      1337 
    
    }
    //functtion call 
    println(function)

    lazy val mix = {
      println("I'm going to bind the mix to 1337")
      println("But only on demand (when it is needed!)")
      1338 
    }
    println(mix)
    
  }

  //Specifying a type: 

  var const: Int = 1330
  def function2(p1: Int, p2: Int): Int = 23
  println(const)
  /** A function can be defined by alphamueric character but can also be defined by the character like * or . / *
   * But the function name cannot start with a number, 3Function() is not a valid function name. 
   * 
   * 
  */

  def multiplicationFunction(first: Int, second: Int): Int = first * second
  println(multiplicationFunction(2, 4))

  
  // println(function2(1,2))

  /** 
   * Nothing is the absolute “no value” type in Scala. It doesn't have any methods or values
  
   */
//  var nothing: Nothing = throw new Exception
//  println("Unreacheable code!") 

  //Unit type: Unit is the return type of functions returning nothing. It’s equivalent to the void type in Java except for one difference: The Unit type in Scala has one singleton value that is (), but void in Java does not have any value:
  val unit1: Unit = ()
  println(unit1)

  val unit2: Unit = ()
  println(unit2)

  //Null type has only one value and it is null.
  val danger: Null = null
  println(danger)


  //Boolean: True and False
  val yes: Boolean = true
  println(yes)

  val no: Boolean = false
  println(no)

  //Byte min: getting the smallest number 
  val byteMin: Byte = Byte.MinValue
  println(byteMin)

  //Byte Max: getting the biggest number 
  val byteMax: Byte = Byte.MaxValue
  println(byteMax)
 
  //Type alias: to help define the type of the object
  type N = Int
  val myFavNumber: N = 1337
  println(myFavNumber)

  val N: N = 1337
  println(N)
  

  println("-" * 50)

}


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
  println(function2(1,2))

  println("-" * 50)

}


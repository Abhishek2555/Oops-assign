package abhishek

object main {

    def main(args: Array[String]): Unit =
    {

      val Person1=new person(24,"testAgain")
      val Person2=new person(25,"test")


      if ((Person1.Name).equals(Person2.Name))
      {
        if((Person1.Age) < (Person2.Age))
        {
          println("true")
        }
        else
        {
          println("false")
        }

      }
      else if ((Person1.Name.length()) < (Person2.Name.length()))
      {
        println("true")
      }
      else
      {
        println("false")
      }

    }
}

 object Exercise2 {

    def main (args:Array[String]): Unit = {
      //output
      print(connectStrings(listOfString,separator))

    }

   //spearator command to seperate the strings



    val listOfString: List[String] = List("Bartek","Andrezj","Igor","Janusz")
    def connectStrings(listOfString:List[String], separator:String): Unit = {
      for (i <- listOfString) {
        print(i + separator)
      }

    }




  }
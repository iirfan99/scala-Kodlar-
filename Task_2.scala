package deneme



object Task_2 {


    def main(args: Array[String]): Unit = {


      print("result :" +  funArithmetic(2,3,4))



    }

    def funArithmetic(x:Double, c:Double,b: Int) : List[Double]=
    {
      def go(a:Double, y:Double,b: Int) : List[Double]=List match
      {
        case _ if(b==0)=>List()

        case _ if(b==1)=>List(a)

        case _else => a::go(a+y,y,b-1)
      }
      go(x,c,b)
    }


  }
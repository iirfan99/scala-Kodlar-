import scala.annotation.tailrec



object Exercise4 {
  def tailRecursiveBig(n :Int) : BigInt = {

    @tailrec
    def aux(n : Int, next :BigInt, acc :BigInt) :BigInt ={

      if(n == 0) acc
      else aux(n-1, acc + next,next)
    }

    aux(n,1,0)
  }
  def main(args: Array[String]): Unit = {
    print("fibonacci sequence = ")
    (0 to 20).foreach( (x : Int) => print(tailRecursiveBig(x) + " "))
  }
}

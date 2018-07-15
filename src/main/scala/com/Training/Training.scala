package com.Training
//Write your code here


object Training {
  class Calculator {

    var n = 0
    var p = 0

    @throws(classOf[Exception])
    def power(n: Int, p: Int): Int = {

        if (n < 0 || p < 0)
          throw new Exception("n and p should be non-negative")
        else

      return math.pow(n, p).toInt
    }
  }
  def main(args: Array[String]) {
    var myCalculator=new Calculator();
    var T=scala.io.StdIn.readLine().toInt

    while(T>0){
      val Array(n,p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
      try{
        var ans=myCalculator.power(n,p);
        println(ans);
      }
      catch{
        case e: Exception => {
          println(e.getMessage());
        }
      }
      T-=1;
    }
  }


}
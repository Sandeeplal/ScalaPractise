package com.MapPractise

import scala.collection.mutable

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var input = new mutable.HashMap[String, Int]()
    var number = scala.io.StdIn.readInt()
    var flag = 0
    for (i <- 1 to number) {
      val temp = scala.io.StdIn.readLine().split(" ").toList

      input.put(temp(0), temp(1).toInt)
    }

    var l = new mutable.ArrayBuffer[String]()

    while (flag != 1) {
      var key = scala.io.StdIn.readLine()
      if (key.isEmpty)
        flag = 1
      else {
        var st =""
        if(input.contains(key) ) {
           st = key + " = " + input.getOrElse(key,"")
        }else{
           st ="Not found"
        }
        l += st
      }
    }
    for (k <- l) {
      println(k)
    }

  }
}
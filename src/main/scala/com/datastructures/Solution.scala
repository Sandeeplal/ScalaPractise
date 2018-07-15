package com.datastructures

import scala.collection.mutable
import scala.collection.mutable.Stack
import scala.collection.mutable.Queue
import scala.util.control._

object Solution {
  def main(args: Array[String]) {
    // read the string s
    var s = scala.io.StdIn.readLine()
    // create the Solution class object p
    var obj = new Solution()
    var i = 0
    var len = s.length()
    //push/enqueue all the characters of string s to stack
    for (i <- 0 to len - 1) {
      obj.pushCharacter(s.charAt(i))
      obj.enqueueCharacter(s.charAt(i))
    }

    var isPalindrome = true
    /*pop the top character from stack
      dequeue the first character from queue
      compare both the characters*/

    val loop = new Breaks
    loop.breakable {
      for (i <- 0 to len / 2) {
        if (obj.popCharacter() != obj.dequeueCharacter()) {
          isPalindrome = false
          loop.break
        }
      }
    }

    //finally print whether string s is palindrome or not
    if (isPalindrome) {
      println("The word, " + s + ", is a palindrome.")
    }
    else {
      println("The word, " + s + ", is not a palindrome.")
    }
  }
}


class Solution {
  //Write your code here

  var queue_var= new mutable.Queue[Char]()
  var stack_var = new mutable.Stack[Char]()


  def pushCharacter(s:Char):Unit={
    stack_var.push(s)
  }
  def popCharacter():Char={
    return(stack_var.pop())
  }
  def enqueueCharacter(s:Char):Unit={
    queue_var.enqueue(s)
      }
  def dequeueCharacter():Char={
    return(queue_var.dequeue())
  }

}
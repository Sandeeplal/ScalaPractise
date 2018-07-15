package com.Sorting
// Bubble Sorting
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var a = new Array[Int](n)
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt()
    }
    var numberOfSwaps = 0
    var flag = 0
    var temp = 0
    for (i <- 0 until n; if flag != 1) {
      // Track number of elements swapped during a single array traversal

      for (j <- 0 until n - 1) {
        // Swap adjacent elements if they are in decreasing order
        if (a(j) > a(j + 1)) {
          temp = a(j)
          a(j) = a(j + 1)
          a(j + 1) = temp
          numberOfSwaps += 1
        }
      }

      // If no elements were swapped during a traversal, array is sorted
      if (numberOfSwaps == 0) {
        flag = 1
      }


    }
    println("Array is sorted in " + numberOfSwaps + " swaps.")
    println("First Element: " + a(0))
    println("Last Element: " + a(n - 1))


  }
}
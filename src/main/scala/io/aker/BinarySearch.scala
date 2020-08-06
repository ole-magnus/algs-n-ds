package io.aker

import scala.annotation.tailrec

object BinarySearch {

  /**
   * time: O(log n)
   * space: O(log n) for regular recursion, i.e. log n is the stack depth, but
   *        only O(1) for the tail-recursive version (like the iterative one)
   */
  @tailrec
  def search(a: Int, array: Array[Int]): Boolean = array match {
    case Array() => false
    case Array(b) => a == b
    case _ => {
      val middle = math.floorDiv(array.size, 2)
      val left = array(middle-1)
      val right = array(middle) 

      if (a < right) search(a, array.take(middle))
      else search(a, array.drop(middle))
    }
  }
}
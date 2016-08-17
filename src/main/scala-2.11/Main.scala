import scala.annotation.tailrec
import scala.util.Random

object Main {

  @tailrec
  def series(n: Int, acc: Int): Int = {
    if (n == 0) {
      acc
    } else {
      series(n - 1, acc + n)
    }
  }

  @tailrec
  def fact(n: Int, acc: Int): Int = if (n == 1) acc else fact(n - 1, acc * n)


  case class Switch(isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  def twice(f: Int => Int): Int => Int = f.compose(f)

  def isSorted[E](sortedSeq: Seq[E])(isOrdered: (E, E) => Boolean): Boolean = {
    def isSortedRecursive(i: Int): Boolean = {
      if (i == sortedSeq.length - 1) true
      else if (!isOrdered(sortedSeq(i), sortedSeq(i + 1))) false
      else isSortedRecursive(i + 1)
    }
    isSortedRecursive(0)
  }
  
}

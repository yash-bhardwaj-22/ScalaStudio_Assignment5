package ClassAndObject

import scala.sys.error

object ZeroInt extends Integer {
  def isZero: Boolean = true
  def predecessor: Integer = new Pred(this)
  def successor: Integer = new Succ(this)
  def +(that: Integer): Integer = that
  def -(that: Integer): Integer = {
    {
      def iter(n: Integer, res: Integer): Integer = {
        if (n.isZero) res
        else if (n.isPositive) iter(n.predecessor, res.predecessor)
        else iter(n.successor, res.successor)
      }
      iter(that, this)
    }
  }
  override def isPositive: Boolean = false
}

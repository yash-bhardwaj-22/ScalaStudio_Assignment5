package ClassAndObject

class Succ(x: Integer) extends Integer {
  def isZero: Boolean = false
  def predecessor: Integer = x
  def successor: Integer = new Succ(this)
  def + (that: Integer): Integer = x + that.successor
  def - (that: Integer): Integer = x - that.predecessor
  override def isPositive: Boolean = true
}

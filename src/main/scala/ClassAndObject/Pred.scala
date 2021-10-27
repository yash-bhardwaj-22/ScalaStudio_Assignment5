package ClassAndObject

class Pred(x: Integer) extends Integer{
  def isZero: Boolean = false
  def predecessor: Integer = new Pred(this)
  def successor: Integer = x
  def + (that: Integer): Integer = x + that.predecessor
  def - (that: Integer): Integer = x - that.successor

  override def isPositive: Boolean = false
}

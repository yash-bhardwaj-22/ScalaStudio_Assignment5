package ClassAndObject

trait Integer {
  def isZero: Boolean
  def predecessor: Integer
  def successor: Integer
  def +(that: Integer): Integer
  def -(that: Integer): Integer
  def isPositive: Boolean
  def negate: Integer = ZeroInt - this
}

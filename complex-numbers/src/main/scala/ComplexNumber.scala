class ComplexNumber(val real: Int, val imaginary: Int) {
//  def real(): Double = real.toDouble
  def +(that: ComplexNumber) = ComplexNumber(real + that.real, imaginary + that.imaginary)
  def -(that: ComplexNumber) = ComplexNumber(real - that.real, imaginary - that.imaginary)
  def /(that: ComplexNumber) = {
    val d = that.real* that.real + that.imaginary * that.imaginary
    ComplexNumber((real*that.real + imaginary*that.imaginary) / d,
      (real*that.imaginary + imaginary*that.real) / d)
  }
  def *(that: ComplexNumber) = ComplexNumber(real * that.real - imaginary* that.imaginary,
    real*that.imaginary + imaginary*that.real)
}

object ComplexNumber {
  def apply(real: Int = 0, imaginary: Int = 0): ComplexNumber = new ComplexNumber(real, imaginary)

}
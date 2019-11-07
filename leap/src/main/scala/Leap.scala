object Leap {
  def leapYear(year: Int): Boolean = {
    if (!isDivide(year, 4)) {
      false
    } else if (isDivide(year, 100) && !isDivide(year, 400)) {
      false
    } else {
      true
    }
  }

  def isDivide(x:Int, y:Int): Boolean = {
    x % y == 0
  }
}

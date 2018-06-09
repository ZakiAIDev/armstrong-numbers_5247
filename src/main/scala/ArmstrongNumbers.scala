object ArmstrongNumbers {
  def isArmstrongNumber(number: Int) = {
    val numberMap = number.toString.map(_.asDigit)
    val numberLen = numberMap.length

    numberMap.map(Math.pow(_, numberLen)).sum == number

  }


}

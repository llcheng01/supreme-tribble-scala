object Bob {
  val questionChar = "?"

  def response(statement: String): String = {
    clean(statement) match {
      case s if isStatementEmpty(s) => "Fine. Be that way!"
      case s if isShoutingQuestion(s) => "Calm down, I know what I'm doing!"
      case s if isRegularQuestion(s) => "Sure."
      case s if isQuestionButNotShouting(s) => "Whoa, chill out!"
      case _ => "Whatever."
    } 
  }

  def isStatementEmpty(statement: String): Boolean =
    statement.isEmpty

  def isShoutingQuestion(statement: String): Boolean =
    isQuestion(statement) && isAllUpperCase(removeNonLetters(statement))

  def isRegularQuestion(statement: String): Boolean =
    isQuestion(statement) && !isAllUpperCase(removeNonLetters(statement))

  def isQuestionButNotShouting(statement: String): Boolean =
    !isQuestion(statement) && isAllUpperCase(removeNonLetters(statement))

  def clean(statement: String): String = 
     statement.trim

  def isAllUpperCase(statement: String): Boolean = 
    statement match {
      case x if !x.isEmpty => x == x.toList.map(_.toUpper).mkString
      case _ => false
    }

  // Can become empty string! 
  def removeNonLetters(statement: String): String = 
    statement.filter(_.isLetter)

  def isQuestion(statement: String): Boolean = 
    questionChar == statement.takeRight(1)
  
}

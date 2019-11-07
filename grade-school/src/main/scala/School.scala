class School {
  type DB = scala.collection.mutable.Map[Int, Seq[String]]

  def add(name: String, g: Int) = db += (g -> grade(g) :+ name)

  def db: DB = scala.collection.mutable.Map[Int, Seq[String]]()

  def grade(g: Int): Seq[String] = {
    db(g)
  }
//
//  def sorted: DB = {}
}
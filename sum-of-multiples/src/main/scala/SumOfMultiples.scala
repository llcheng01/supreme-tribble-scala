object SumOfMultiples {

  def sum(factors: Set[Int], limit: Int): Int = {
      // go through each element of set and generates
      // multiple sets
      // merge sets together
      // sum the final set
      
      val listOfSets = factors.map(multiples(_, limit)).toList
      val commonSet = listOfSets.foldLeft(Set.empty[Int])(_ ++ _) 
      commonSet.foldLeft(0)(_ + _)
  }

  // Create set based on factor
  def multiples(n: Int, limit: Int): Set[Int] = {
      (1 to limit / n).map(_ * n).filter(_ < limit).toSet
  }
}

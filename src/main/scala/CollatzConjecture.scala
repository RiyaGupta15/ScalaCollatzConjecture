object CollatzConjecture {
  def steps(steps: Int):Option[Int] = {
    var n:Int = steps
    var sum:Int = 0
    if(n == 1) Some(0)
    else if (n < 1) None
    else {
      while(n>1) {
        if(n%2 == 0) {
          n = n/2
          sum +=1
        }
        else {
          n = (3*n) + 1
          sum +=1
        }
      }
      Some(sum)
    }
  }
}
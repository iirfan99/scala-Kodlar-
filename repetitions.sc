def multiplicate(elements: List[Int], repetitions: List[Int]): List[Int] = {
  elements.zip(repetitions).flatMap{case(element, n) => List.fill(n)(element)}
}
multiplicate (List (1, 2, 3), List (0, 3, 1, 4))
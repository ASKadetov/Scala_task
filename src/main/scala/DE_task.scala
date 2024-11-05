object StringProcessor {
//  Старая версия кода:

//  def processStrings(strings: List[String]): List[String] = {
//    var result = List[String]()
//    for (str <- strings) {
//      if (str.length > 3) {
//        result = result :+ str.toUpperCase
//      }
//    }
//    result
//  }

// В исходном варианте в теле метода создается новый список, и кладется в изменяемую переменную.
// Если хотим использовать функциональный стиль, то мы не создаем новый объект в памяти, а
// используем список передаваемый на входе. В исходном варианте преобразование списка происходит
// в цикле в один проход по списку, сложность - O(n). Мы сделаем это с такой же сложностью, но
// в более читаемом виде с помощью метода collect

  def processStrings(strings: List[String]): List[String] = {
    strings.collect { case s if s.size > 3 => s.toUpperCase }
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
fun main() {
    var thePoppyWar = Book()
    thePoppyWar.title ="The Poppy War"
    thePoppyWar.author= "R.F.Kuang"
    thePoppyWar.yearPublished= 2018

    println("Title: ${thePoppyWar.title}")
    println("Author: ${thePoppyWar.author}")
    println("Year Published: ${thePoppyWar.yearPublished}")
}
class Book {
    var title: String = ""
    var author: String = ""
    var yearPublished: Int = 2018
}
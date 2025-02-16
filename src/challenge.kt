fun main(){
    var myBookTwo= BooksTwo("The Poppy war", "R.F.Kuang",
        "Fantasy", 2018)

    println(myBookTwo.getBookInfo())


}
class BooksTwo constructor(var title: String,
                        val author:String,
                        val genre: String,
                        val yearPublished: Int){
    fun getBookInfo(){

        println("$title by $author is a $genre story ($yearPublished)")
    }

}
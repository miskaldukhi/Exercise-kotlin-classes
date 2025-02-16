
fun main(){
var myBook= Books("The Poppy war", "R.F.Kuang",
    2018)

  println(myBook.getBookInfo())


}
class Books constructor(var title: String,
                       val author:String,
                       val yearPublished: Int){
    fun getBookInfo(){

        println("$title by $author ($yearPublished)")
    }

}
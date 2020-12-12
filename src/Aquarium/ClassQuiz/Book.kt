package Aquarium.ClassQuiz

open class Book(val title:String = "defaultTitle", val author:String = "defaultAuthor") {

    var currentPage = 0;
    open fun readPage(){
        currentPage = currentPage + 1
    }
}

class eBook(val format: String = "text"): Book(){
    var wordCount : Int = 0
    override fun readPage(){
        wordCount = wordCount + 250
    }
}

fun main(args: Array<String>){
    val eBook = eBook()
    eBook.readPage()
    eBook.readPage()
    println("eBook wordCount: ${eBook.wordCount}")
}
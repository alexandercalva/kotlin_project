// Parent class
open class Material(var title: String, var author: String, var year: Int)
{
   
}

// Child class : Material
class Article(title: String, author: String, year: Int, var newspaper: String, var section: String, var date: String) : 
              Material(title, author, year)
{
       
}

// Child class : Material 
// Parent class
open class Book(title: String, author: String, year: Int, var publisher: String) : Material(title, author, year)
{
    
}

// Child class: Material
class Brochure(title: String, author: String, year: Int, var theme: String, var editorial: String) : Material(title, author, year)
{
    
}

// Child class : Book
class Subjects(title: String, author: String, year: Int, publisher: String, var specialization: String) : Book(title, author, year, publisher)
{
    
}


//Main
fun main(){
    val book = Material("Harry Potter", "J. K. Rowling", 1997)
    println("Title: " + book.title)
    println("Author: " + book.author)
    println("Year: " + book.year)
}



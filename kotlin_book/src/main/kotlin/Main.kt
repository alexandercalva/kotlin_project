import java.util.Scanner

// Parent class
open class Material(var title: String, var author: String, var year: Int)
{

}

// Child class : Material
class Article(title: String, author: String, year: Int, var newspaper: String, var section: String, var date: String) : Material(title, author, year)
{

}

// Child class : Material 
// Parent class
open class Book(title: String, author: String, year: Int, var publisher: String, var isbn: String) : Material(title, author, year)
{

}

// Child class: Material
class Brochure(title: String, author: String, year: Int, var theme: String, var editorial: String) : Material(title, author, year)
{

}

// Child class : Book
class Subjects(title: String, author: String, year: Int, publisher: String, isbn: String, var specialization: String) : Book(title, author, year, publisher, isbn)
{

}


//Main
fun main()
{
    /*val book = Material("Harry Potter", "J. K. Rowling", 1997)
    println("Title: " + book.title)
    println("Author: " + book.author)
    println("Year: " + book.year)*/
    // Input
    //print("Enter the book isbn: ")
    //var name = readLine()!!.toInt()
    //println("Book: $name")
    println("****************************")
    println("*          Menu            *")
    println("* 1. Book                  *")
    println("* 2. Article               *")
    println("* 3. Brochure              *")
    println("* 4. Exit                  *")
    println("****************************")
    print("Choose an option: ")
    var op = readLine()!!.toInt()

    when(op)
    {
        1 -> {
            // Book
            println("Book ")
        }
        2 -> {
            // Article
            println("Article ")
        }
        3 -> {
            // Brochure
            println("Brochure ")
        }
        4 -> {
            //Exit
            println("Exit ")
        }
        else -> {

        }
    }

}



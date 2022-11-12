/* Design a program that has a parent class called "Material" that allows the user to enter any type of writing.
This class will have as class members "author, title and year of publication". It will also have classes children "Book,
Article and Brochure, whose member data are:
* Book : publisher
* Article: newspaper, section, and date
* Brochure: theme and editorial
The class "Subjects" is derived from the class "book" and indicates the specialization of the book, e.g. digital,
packages, mathematics, etc.
*/

// Parent class
open class Material() {
    // Variables
    var title: String = ""
    var author: String = ""
    var year: Int = 0
}

// Child class : Material
class Article() : Material()
{
    //Variables
    var newspaper: String = ""
    var section: String = ""
    var date: String = ""

}

// Child class : Material 
// Parent class
open class Book():Material() {
    //Variables
    var publisher: String = ""
    var isbn: String = ""
}

// Child class: Material
class Brochure() : Material()
{
    //Variables
    var theme: String = ""
    var editorial: String = ""

}

// Child class : Book
class Subjects() : Book()
{
    //Variables
    var specialization: String = ""
}

//Main
fun main()
{
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
            println("Book")
            println("Please enter all information")
            val book = Book()
            val subject = Subjects()
            print("Author: ")
            book.author = readLine()!!.toString()
            print("Title: ")
            book.title = readLine()!!.toString()
            print("Year: ")
            book.year = try
            {
                readLine()!!.toInt()
            }catch (e: NumberFormatException){
                return
            }
            if(book.year == 2022){
                println("New book")
            }
            print("Publisher: ")
            book.publisher = readLine()!!.toString()
            print("ISBN: ")
            book.isbn = readLine()!!.toString()
            print("Specialization: ")
            subject.specialization = readLine()!!.toString()
            println("\n")
            println("\n")
            println("\n")
            println("\n")
            println("Book information")
            println("Author: ${book.author}")
            println("Title: ${book.title}")
            println("Year: ${book.year}")
            println("Publisher: ${book.publisher}")
            println("ISBN: ${book.isbn}")
            println("Specialization: ${subject.specialization}")

           }
        2 -> {
            // Article
            println("Article")
            println("Please enter all information")
            val article = Article()
            print("Newspaper: ")
            article.newspaper = readLine()!!.toString()
            print("Section: ")
            article.section = readLine()!!.toString()
            print("Date: ")
            article.date = readLine()!!.toString()
            println("\n")
            println("\n")
            println("\n")
            println("\n")
            println("Article information")
            println("Newspaper: ${article.newspaper}")
            println("Section: ${article.section}")
            println("Date: ${article.date}")
            }
        3 -> {
            // Brochure
            println("Brochure ")
            println("Please enter all information")
            val brochure = Brochure()
            print("Theme: ")
            brochure.theme = readLine()!!.toString()
            print("Editorial: ")
            brochure.editorial = readLine()!!.toString()
            println("\n")
            println("\n")
            println("\n")
            println("\n")
            println("Brochure information")
            println("Theme: ${brochure.theme}")
            println("Editorial: ${brochure.editorial}")
            }
        else ->
        {
                println("Exit")
        }
    }
}



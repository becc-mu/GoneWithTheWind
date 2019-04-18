package com.company.library

import scala.collection.mutable

object Library {


  def main(args: Array[String]): Unit = {
    val books = Books.all:List[Book]
    //println(books)

    def searchByTitle(title: String): Unit = {
      val list = mutable.MutableList[Book]()
      for(a <- Books.all) {
        if(title != "" && a.title.contains(title)) {
          list += a
        }
      }
      for(a <- list) {
        println("searching by Title")
        println(a.title, a.author, a.ISBN)
        println("\n")
      }
    }

//    def searchByAuthor(author: String): Unit = {
//
//    }


//    def searchByAuthor() = ???
//
//    def searchByIsbn() = ???
//
//    def lendBooks() = ???
//
//    def notLendRefBooks() = ???
//
//    def bookIsAvaialable() = ???

  }
}

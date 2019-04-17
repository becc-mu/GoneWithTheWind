package com.company.library

import scala.collection.mutable

object Library {


  def main(args: Array[String]): Unit = {
    //val books = Books.all:List[Book]
    //println(books)

    def searchByTitle(title: String): Unit = {
      val list = mutable.MutableList[Book]()
      for(a <- Books.all) {
        if(title != "" && a.title.contains(title)) {
          list += a
        }
      }
    }


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

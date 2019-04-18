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

    def searchByAuthor(author: String) {
      val list = mutable.MutableList[Book]()
      for(a <- Books.all) {
        if(author != "" && a.author.contains(author)) {
          list += a
        }
      }

      for(a <- list){
        println("searching by Author")
        println(a.title, a.author, a.ISBN)
        println("\n")
      }
    }

    def searchByIsbn(ISBN: String) {
      val list = mutable.MutableList[Book]()
      for(a <- Books.all) {
        if(ISBN != "" && a.ISBN.equals(ISBN)) {
          list += a
        }
      }

      for(a <- list) {
        println("searching by ISBN")
        println(a.title, a.author, a.ISBN)
        println("\n")
      }
    }

//    def lendBooks() = ???
//
//    def notLendRefBooks() = ???
//
//    def bookIsAvaialable() = ???

  }
}

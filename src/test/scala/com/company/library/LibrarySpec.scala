package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class LibrarySpec extends FunSuite {

  def assert(all: List[Book]): List[Book] = Books.all

  test("returns list of all books") {
    val books = Books.all
    books shouldBe a [List[_]]
    assert(Books.all) == books
  }

  test("getBooks") {
    case class Book(title: String, author: String, isbn: String)
    val book = Book("Da Vinci, The", "Brown, Dan", "pidtkl")
    book.title shouldBe "Da Vinci, The"
    book.author shouldBe "Brown, Dan"
    book.isbn shouldBe "pidtkl"
  }


  test("searchByTitle") {
    val book = Book("Down Under", "Bryson, Bill", "gucmvq")
    book.title shouldBe "Down Under"
  }

  test("searchByAuthor") {
    val book = Book("Small Island", "Levy, Andrea", "venrqop")
    book.author shouldBe "Levy, Andrea"
  }

  test("searchByIsbn") {
    val book = Book("Small Island", "Levy, Andrea", "venrqop")
    book.ISBN shouldBe "venrqop"
  }
}

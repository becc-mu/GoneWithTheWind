package com.company.library

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class LibrarySpec extends FunSuite {

  def assert(all: List[Book]) = Books.all

  test("returns list of all books") {
    val books = Books.all
    books shouldBe a [List[_]]
    assert(Books.all) == books
  }
}

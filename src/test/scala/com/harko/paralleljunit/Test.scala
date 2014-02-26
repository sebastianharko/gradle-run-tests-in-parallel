package com.harko.paralleljunit

import com.harko.paralleljunit;


import org.scalatest._
import org.scalatest.junit.JUnitRunner

import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class Test extends FunSuite {


  test("Should return the magic number (I) ") {
    assert(ClassToTest.methodToTest() == 42)
  }


  test("Should return the magic number (II) ") {
    assert(ClassToTest.methodToTest() == 42)
  }


  test("Should return the magic number (III ") {
    assert(ClassToTest.methodToTest() == 42)
  }


}

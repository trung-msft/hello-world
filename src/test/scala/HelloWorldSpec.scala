package test.scala

import java.nio.file.Paths

import Paths._

import org.specs2._

/**
 *
 */
class HelloWorldSpec extends Specification { def is = s2"""
	This is a spec to check the 'Hello world' str

	Foo example
 		foo needs to be ... $foo

"""

	def foo = Array(1, 2, 2, 3) must equalTo(Array(1,2,3))


}

package test.scala

import org.specs2._

/**
 *
 */
class TestUnitSpec extends mutable.Specification {

	val two = 2

	"this is my unit spec" >> {
		"where ex 1 must be true" >> {
			1 must_== 1
		}
		"where ex2 must be true" >> {
			two must_== (1+1)
		}
	}

}

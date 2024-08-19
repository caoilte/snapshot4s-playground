package example

import snapshot4s.Repr
import snapshot4s.munit.SnapshotAssertions
import snapshot4s.generated.snapshotConfig

import java.util.UUID

class HelloSpec extends munit.FunSuite with SnapshotAssertions {

  val pprinter = pprint.copy(
    additionalHandlers = {
      case u:UUID => pprint.Tree.Literal(s"""UUID.fromString("${u.toString}")""")
    }
  )
  implicit val reprForHelloWorld: Repr[HelloWorld] = (h:HelloWorld) => pprinter.apply(h).plainText

  test("say hello") {
    assertInlineSnapshot(HelloWorld.test(), ???)
  }
}

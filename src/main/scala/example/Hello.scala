package example

import java.util.UUID

case class HelloWorld(name: String, uuid: UUID)

object HelloWorld {
  def test():HelloWorld = HelloWorld("caoilte", UUID.fromString("b8d4b9b6-faaa-4446-bcd9-abd902c5174b"))
}
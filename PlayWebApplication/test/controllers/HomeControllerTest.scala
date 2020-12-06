package controllers

import org.specs2.mutable._
import play.api.test.Helpers._
import play.api.test._

import scala.collection.mutable.ListBuffer


class HomeControllerTest extends Specification {

  class ApplicationSpec extends Specification {

    "Application" should {

      "work" in {
        running(TestServer(9000)) {

          val clientInteraction = new ClientInteraction()

          clientInteraction.client.connectBlocking()
          clientInteraction.client.send("Sports")

          eventually {
            clientInteraction.messages.nonEmpty
          }
        }
      }
    }

  }

}

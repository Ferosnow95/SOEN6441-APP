package controllers

import java.net.URI

import org.java_websocket.client.WebSocketClient
import org.java_websocket.drafts.{Draft_10, Draft_17}
import org.java_websocket.handshake.ServerHandshake


import scala.jdk.CollectionConverters.MapHasAsScala
import scala.collection.mutable.ListBuffer

class ClientInteraction {

  val messages = ListBuffer[String]()

  val client = new WebSocketClient(URI.create("ws://localhost:9000/ws"),
    new Draft_17()) {

    def onError(p1: Exception) {
      println("onError")
    }

    def onMessage(message: String) {
      messages += message
      println("onMessage, message = " + message)
    }

    def onClose(code: Int, reason: String, remote: Boolean) {
      println("onClose")
    }

    def onOpen(handshakedata: ServerHandshake) {
      println("onOpen")
    }
  }
}
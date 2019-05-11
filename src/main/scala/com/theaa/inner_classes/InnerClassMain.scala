package com.theaa.inner_classes

object InnerClassMain {
  def main(args: Array[String]): Unit = {
    val graph: Graph = new Graph

    val node1: graph.Node = graph.newNode
    val node2: graph.Node = graph.newNode
    val node3: graph.Node = graph.newNode

    node1.connectTo(node2)
    node2.connectTo(node3)
  }
}

class Graph {
  class Node {
    var connectedNotes: List[Node] = Nil
    def connectTo(node: Node): Unit = {
      if (!connectedNotes.exists(node.equals(_))) {
        connectedNotes = node :: connectedNotes
      }
    }
  }

  var nodes: List[Node] = Nil
  def newNode: Node = {
    val node = new Node
    nodes = node :: nodes
    node
  }
}

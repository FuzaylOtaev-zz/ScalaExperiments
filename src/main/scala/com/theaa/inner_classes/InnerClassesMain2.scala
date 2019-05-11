package com.theaa.inner_classes

object InnerClassesMain2 {
  def main(args: Array[String]): Unit = {

    val graph1 = new Graph
    val node1: graph1.Node = graph1.newNode
    val node2: graph1.Node = graph1.newNode

    val graph2 = new Graph
    val node3: graph2.Node = graph2.newNode

    node1.connectTo(node2)
    node1.connectTo(node3)


  }

}

class Graph {
  class Node {
    var connectedNotes: List[Graph#Node] = Nil
    def connectTo(node: Graph#Node): Unit = {
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

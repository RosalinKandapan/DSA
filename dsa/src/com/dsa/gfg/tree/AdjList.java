package com.dsa.gfg.tree;
class AdjNode {
    int vertex;
    AdjNode next;

    public AdjNode(int data)
    {
        vertex = data;
        next = null;
    }
}

// Adjacency List representation
class AdjList {
    private int v;
    private AdjNode[] graph;

    public AdjList(int vertices)
    {
        v = vertices;
        graph = new AdjNode[v];
        for (int i = 0; i < v; ++i) {
            graph[i] = null;
        }
    }

    // Function to add an edge from a source vertex
    // to a destination vertex
    public void addEdge(int source, int destination)
    {
        AdjNode node = new AdjNode(destination);
        node.next = graph[source];
        graph[source] = node;
    }

    // Function to add a vertex between two vertices
    public void addVertex(int vk, int source,
                          int destination)
    {
        addEdge(source, vk);
        addEdge(vk, destination);
    }

    // Function to print the graph
    public void printGraph()
    {
        for (int i = 0; i < v; ++i) {
            System.out.print(i + " ");
            AdjNode temp = graph[i];
            while (temp != null) {
                System.out.print("-> " + temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Function to delete a vertex
    public void delVertex(int k)
    {
        // Iterate through all the vertices of the graph
        for (int i = 0; i < v; ++i) {
            AdjNode temp = graph[i];
            if (i == k) {
                graph[i] = temp.next;
                temp = graph[i];
            }
            // Delete the vertex using linked list concept
            while (temp != null) {
                if (temp.vertex == k) {
                    break;
                }
                AdjNode prev = temp;
                temp = temp.next;
                if (temp == null) {
                    continue;
                }
                prev.next = temp.next;
                temp = null;
            }
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        AdjList graph = new AdjList(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);

        System.out.println("Initial adjacency list");
        graph.printGraph();

        // Add vertex
        graph.addVertex(5, 3, 2);
        System.out.println(
            "Adjacency list after adding vertex");
        graph.printGraph();

        // Delete vertex
        graph.delVertex(4);
        System.out.println(
            "Adjacency list after deleting vertex");
        graph.printGraph();
    }
}

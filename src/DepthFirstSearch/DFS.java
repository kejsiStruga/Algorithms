package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {

        // if multiple components - not connected graph
        for(Vertex v: vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsRecursive(Vertex vertex) {

        System.out.println(vertex.getName()+" ");

        for(Vertex v : vertex.getNeighboursList()) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }

    }

    private void dfsWithStack(Vertex rootVertex) {
        // LIFO
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!this.stack.isEmpty()) {
            Vertex current = this.stack.pop();
            System.out.println(current.getName() + " ");

            for(Vertex v : current.getNeighboursList()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }

}

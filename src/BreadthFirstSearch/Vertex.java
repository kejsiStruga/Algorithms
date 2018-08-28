package BreadthFirstSearch;

import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> neighboursList;

    public Vertex(int data, boolean visited, List<Vertex> neighboursList) {
        this.data = data;
        this.visited = visited;
        this.neighboursList = neighboursList;
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Vertex> getNeighboursList() {
        return neighboursList;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setNeighboursList(List<Vertex> neighboursList) {
        this.neighboursList = neighboursList;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data=" + data +
                ", visited=" + visited +
                ", neighboursList=" + neighboursList +
                '}';
    }
}

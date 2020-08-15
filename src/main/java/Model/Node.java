package Model;

public class Node {
    private String fact;
    private Node upNode;
    private Node downNode;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Node getUpNode() {
        return upNode;
    }

    public void setUpNode(Node upNode) {
        this.upNode = upNode;
    }

    public Node getDownNode() {
        return downNode;
    }

    public void setDownNode(Node downNode) {
        this.downNode = downNode;
    }
}

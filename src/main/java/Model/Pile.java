package Model;

public class Pile {
    private int nodeMeter;
    private Node headNode;

    public int getNodeMeter() {
        return nodeMeter;
    }

    public Node getHeadNode() {
        return headNode;
    }
    
    public void push(Node n){
        nodeMeter++;
        if(headNode == null)
            headNode = n;
        else{
            n.setDownNode(headNode);
            headNode.setUpNode(n);
            headNode = n;
        }   
    }
    
    public void pop(){
        if(nodeMeter > 0){
            nodeMeter--;
            headNode = headNode.getDownNode();
        }
    }
    
    public String peek(){
        return headNode.getFact();
    }
}

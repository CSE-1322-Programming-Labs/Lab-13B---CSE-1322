public class Node {
    private String task;
    public Node next;

    Node(String task){
        this.task = task;
        next = null;
    }

    public String getTask(){
        return task;
    }

}

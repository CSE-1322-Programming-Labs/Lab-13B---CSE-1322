public class LinkedList {
    private Node head;
    private Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }

    public void addTask(String task){
        //if the list is empty, then make the head point to first task and tail point to first task.
        if(head == null){
            head = new Node(task);
            tail = head;
        }
        //if the list already has tasks in it, then go to the last task in the list and add one more, then make the tail point to it.
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            //(the default constructor here will make temp.next.next = null)
            temp.next = new Node(task);
            tail = temp.next;
        }
    }

    public String nextTask()throws Exception{
        //if there is no tasks, throw exception.
        if(head == null) throw new Exception("There are no tasks :) ");
        //else save the head, move the head over 1 node and then return the saved head.
        else {
            Node temp = head;
            head = head.next;
            return temp.getTask();
        }
    }
}

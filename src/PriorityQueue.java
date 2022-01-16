public class PriorityQueue {
    private LinkedList[] priorityQueue = new LinkedList[3];


    //default constructor initializes 3 linked lists for us, one for each of the 3 priorities high,medium,low.
    PriorityQueue(){
        for(int i=0;i<priorityQueue.length;i++){
            priorityQueue[i] = new LinkedList();
        }
    }

    //This method adds the said task to the correct linked list. If there is no such priority, tell the user.
    public void addTask(String task,String priority){
        switch (priority.trim().toLowerCase()){
            case "high" -> priorityQueue[0].addTask(task);
            case "medium"-> priorityQueue[1].addTask(task);
            case "low" -> priorityQueue[2].addTask(task);
            default ->{
                System.out.println("Please enter a valid priority");
                return;
            }
        }
    }

    //This will get the next highest priority task and then return that as a string, if there is no tasks to begin with, throws Exception.
    public String getNextTask()throws Exception{
        for(int i=0;i<priorityQueue.length;i++){
            if(!priorityQueue[i].isEmpty()){
                return priorityQueue[i].nextTask();
            }
        }
        //if all 3 priorityLinkedLists are empty.
        throw new Exception("No tasks!");
    }

}

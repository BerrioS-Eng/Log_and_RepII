package queues.queueInLinkedlist;

import doublyLinkedListExercises.exerciseTwo.Person;

public class NodeQueue {
    private Person info;
    private NodeQueue liga;
    public NodeQueue(){
        info = null;
        liga = null;
    }
    public NodeQueue(Person info){
        this.info = info;
        liga = null;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public NodeQueue getLiga() {
        return liga;
    }

    public void setLiga(NodeQueue liga) {
        this.liga = liga;
    }
}


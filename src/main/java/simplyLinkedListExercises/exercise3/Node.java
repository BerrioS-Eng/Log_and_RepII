package simplyLinkedListExercises.exercise3;

public class Node {
    private Employee info;
    private Node liga;

    public Node (Employee info){
        this.info = info;
        this.liga = null;
    }

    public Employee getInfo() {
        return info;
    }

    public void setInfo(Employee info) {
        this.info = info;
    }

    public Node getLiga() {
        return liga;
    }

    public void setLiga(Node liga) {
        this.liga = liga;
    }
}

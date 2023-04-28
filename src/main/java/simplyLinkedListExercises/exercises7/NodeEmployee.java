package simplyLinkedListExercises.exercises7;

public class NodeEmployee {
    private Employee info;
    private NodeEmployee liga;
    public NodeEmployee(Employee info){
        this.info = info;
        liga = null;
    }

    public Employee getInfo() {
        return info;
    }

    public void setInfo(Employee info) {
        this.info = info;
    }

    public NodeEmployee getLiga() {
        return liga;
    }

    public void setLiga(NodeEmployee liga) {
        this.liga = liga;
    }
}

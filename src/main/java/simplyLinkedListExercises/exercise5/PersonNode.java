package simplyLinkedListExercises.exercise5;

public class PersonNode {
    private Person info;
    private PersonNode liga;
    public PersonNode(Person info){
        this.info = info;
        this.liga = null;
    }
    public Person getInfo() {
        return info;
    }
    public void setInfo(Person info) {
        this.info = info;
    }
    public PersonNode getLiga() {
        return liga;
    }
    public void setLiga(PersonNode liga) {
        this.liga = liga;
    }
}

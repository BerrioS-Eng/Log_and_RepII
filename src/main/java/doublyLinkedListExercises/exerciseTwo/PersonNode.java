package doublyLinkedListExercises.exerciseTwo;

public class PersonNode {
    private Person info;
    private PersonNode ligIzq, ligDer;

    public PersonNode() {
        info = null;
        ligIzq = ligDer = null;
    }

    public PersonNode(String id, String name, char gender, float height){
        info = new Person(id, name, gender, height);
        ligIzq = ligDer = null;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public PersonNode getLigIzq() {
        return ligIzq;
    }

    public void setLigIzq(PersonNode ligIzq) {
        this.ligIzq = ligIzq;
    }

    public PersonNode getLigDer() {
        return ligDer;
    }

    public void setLigDer(PersonNode ligDer) {
        this.ligDer = ligDer;
    }
}

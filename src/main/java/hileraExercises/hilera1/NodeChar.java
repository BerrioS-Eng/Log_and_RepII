package hileraExercises.hilera1;

public class NodeChar {
    private char info;
    private NodeChar liga;

    public NodeChar(char info) {
        this.info = info;
        this.liga = null;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public NodeChar getLiga() {
        return liga;
    }

    public void setLiga(NodeChar liga) {
        this.liga = liga;
    }
}

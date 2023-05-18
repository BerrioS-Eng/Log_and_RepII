package hileraExercises.hilera1;

public class LinkedList {
    private NodeChar head, tail, aux;

    public LinkedList() {
        head = new NodeChar('-');
        tail = aux = head;
    }

    public void addNode(char info){
        tail.setLiga(new NodeChar(info));
        tail = tail.getLiga();
    }

    public char getElement(){
        aux = aux.getLiga();
        if (aux == null){
            aux = head;
        }
        return aux.getInfo();
    }

    public void removeWhitespace(){
        NodeChar prev = aux.getLiga();
        NodeChar next = prev.getLiga();
        while (next != null){
            if (next.getInfo() == ' '){
                prev.setLiga(next.getLiga());
            }
            prev = next;
            next = next.getLiga();
        }
    }

    public void transformA(char info){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo() == 'a') aux.setInfo(info);

            aux = aux.getLiga();
        }
        aux = head;
    }

    public void addingByString(String phrase){
        for (int i = 0; i < phrase.length(); i++) {
            this.addNode(phrase.charAt(i));
        }
    }
}

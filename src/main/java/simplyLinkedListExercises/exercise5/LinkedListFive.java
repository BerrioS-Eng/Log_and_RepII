package simplyLinkedListExercises.exercise5;

public class LinkedListFive {
    private PersonNode head, tail, aux;
    public LinkedListFive(){
        head = new PersonNode(new Person("/*", "", "", ""));
        tail = aux = head;
    }
    public void addNode(Person info){
        tail.setLiga(new PersonNode(info));
        tail = tail.getLiga();
    }
    public Person showElements(){
        aux = aux.getLiga();
        if (aux == null){
            aux = head;
        }
        return aux.getInfo();
    }
    public Person ifExist(String id){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getId().equals(id)) return aux.getInfo();
            aux = aux.getLiga();
        }
        aux = head;
        return aux.getInfo();
    }
}

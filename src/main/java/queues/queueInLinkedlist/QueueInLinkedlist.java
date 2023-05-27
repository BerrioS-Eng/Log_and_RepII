package queues.queueInLinkedlist;

import doublyLinkedListExercises.exerciseTwo.Person;

public class QueueInLinkedlist {
    private NodeQueue head, tail, aux;
    public QueueInLinkedlist(){
        head = new NodeQueue(new Person("/*", null, ' ', 0.0f));
        tail = aux = head;
    }
    public boolean encolar(Person person){
        NodeQueue nodeQueue = new NodeQueue(person);
        tail.setLiga(nodeQueue);
        tail = tail.getLiga();
        return true;
    }
    public Person desencolar(){
        NodeQueue temp = aux.getLiga();
        head.setLiga(temp.getLiga());
        return temp.getInfo();
    }
    public Person mostrarCola(){
        aux = aux.getLiga();
        if(aux == null){
            aux = head;
        }
        return aux.getInfo();
    }
    public boolean ifEmptyQueue(){
        return (aux.getLiga() == null);
    }
}

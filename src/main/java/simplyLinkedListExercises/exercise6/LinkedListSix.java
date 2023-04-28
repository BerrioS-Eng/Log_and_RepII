package simplyLinkedListExercises.exercise6;

import simplyLinkedListExercises.practiceClass.Nodo;

import java.util.ArrayList;
import java.util.List;

public class LinkedListSix {
    private Nodo head, tail, aux;
    public LinkedListSix(){
       head = new Nodo(0);
       tail = aux = head;
    }
    public void addNode(int info){
        tail.setLiga(new Nodo(info));
        tail = tail.getLiga();
    }
    public int getElement(){
        aux = aux.getLiga();
        if (aux == null) aux = head;
        return aux.getInfo();
    }
    public int showOddOrEven(String option){
        aux = aux.getLiga();
        while (aux != null){
            if (option.equalsIgnoreCase("impar") && aux.getInfo()%2==1) return aux.getInfo();
            if (option.equalsIgnoreCase("par") && aux.getInfo()%2==0) return aux.getInfo();
            aux = aux.getLiga();
        }
        aux = head;
        return aux.getInfo();
    }
    public int searchMax(){
        int base = 0;
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo() > base) base = aux.getInfo();
            aux = aux.getLiga();
         }
        aux = head;
        return base;
    }
    public int searchMin(){
        int base = aux.getLiga().getInfo();
        aux = aux.getLiga().getLiga();
        while (aux != null){
            if(aux.getInfo() < base) base = aux.getInfo();
            aux = aux.getLiga();
        }
        aux = head;
        return base;
    }
    public void removeElement(String option){
        int numToRemove = (option.equalsIgnoreCase("max")) ? searchMax() : searchMin();
        Nodo previous = head.getLiga();
        Nodo next = previous.getLiga();
        while (next != null){
            if (next.getInfo() == numToRemove){
                previous.setLiga(next.getLiga());
            }
            previous = next;
            next = next.getLiga();
        }
    }

}

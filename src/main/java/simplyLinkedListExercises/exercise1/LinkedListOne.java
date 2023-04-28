package simplyLinkedListExercises.exercise1;

import simplyLinkedListExercises.practiceClass.Nodo;

public class LinkedListOne {
    private Nodo head, tail, aux;

    public LinkedListOne(){
        head = new Nodo(0);
        tail = aux = head;
    }

    public void addNode(int info) { //Ingresa un elemento a la colección
        tail.setLiga(new Nodo(info));
        tail = tail.getLiga();
    }

    public int display(){
        aux = aux.getLiga();
        if(aux == null){
            aux = head;
        }
        return aux.getInfo();
    }

    public int maxValue(){
        int infoMaxValue = aux.getInfo();
        aux = aux.getLiga();
        while (aux != null){
            infoMaxValue = Math.max(aux.getInfo(), infoMaxValue);
            aux = aux.getLiga();
        }
        aux = head;
        return infoMaxValue;
    }

    public float averagePar(){
        float accumulator;
        int counter, info;
        accumulator = counter = 0;
        aux = aux.getLiga();
        while (aux != null){
            info = aux.getInfo();
            if(info % 2 == 0){
                accumulator += info;
                counter++;
            }
            aux = aux.getLiga();
        }
        aux = head;
        return (accumulator / counter);
    }

    public int getCountMaxValueAverage(){
        int info;
        int countMaxValueAverage = 0;
        float average = averagePar();
        aux = aux.getLiga();
        while (aux != null){
            info = aux.getInfo();
            if(info%2 == 0 && info > average){
                countMaxValueAverage++;
            }
            aux = aux.getLiga();
        }
        return countMaxValueAverage;
    }
}

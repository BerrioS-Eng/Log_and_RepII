package simplyLinkedListExercises.exercise4;

import simplyLinkedListExercises.practiceClass.Nodo;

public class LinkedListFour {
    private Nodo head, tail, aux;
    public LinkedListFour(){
        head = new Nodo(0);
        tail = aux = head;
    }

    public void addNode(int info) {
        tail.setLiga(new Nodo(info));
        tail = tail.getLiga();
    }
    public int showElement() {
       aux = aux.getLiga();
       if (aux == null) {
           aux = head;
       }
       return aux.getInfo();
    }
    public void changeInfo(){
        int change = tail.getInfo();
        tail.setInfo(aux.getLiga().getInfo());
        aux.getLiga().setInfo(change);
    }
    public float countNegativeOrPositivo(char option){ //Definir entrada por parametro para contar positivos y negativos
        int count = 0;
        float acum = 0;
        aux = aux.getLiga();
        while (aux != null){
            if (option == '+' && aux.getInfo() > 0) {
                acum += aux.getInfo();
                count++;
            }
            if (option == '-' && aux.getInfo() < 0) {
                acum += aux.getInfo();
                count++;
            }
            aux = aux.getLiga();
        }
        aux = head;
        return (count == 0) ? 0 : (acum/count);
    }

    public LinkedListFour createNewPositive(){
        LinkedListFour objAux = new LinkedListFour();
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo() > 0) objAux.addNode(aux.getInfo());
            aux = aux.getLiga();
        }
        aux = head;
        return objAux;
    }

}

package simplyLinkedListExercises.exercise2;

import simplyLinkedListExercises.practiceClass.Nodo;

public class LinkedListTwo {
    private Nodo head, tail, aux;

    public LinkedListTwo(){
        head = new Nodo(0);
        tail = aux = head;
    }

    public void addNode(int info){
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

    public int maxOrMinInfo(String option){
        int data, auxInfo;
        data = aux.getInfo();
        aux = aux.getLiga();
        while (aux != null){
            auxInfo = aux.getInfo();
            data = (option.equalsIgnoreCase("Mayor")) ? Math.max(data, auxInfo) : Math.min(data, auxInfo);
            aux = aux.getLiga();
        }
        aux = head;
        return data;
    }

    public void convertToAbs(){
        int info;
        aux = aux.getLiga();
        while (aux != null){
            info = aux.getInfo();
            if(info < 0) aux.setInfo(Math.abs(info));
            aux = aux.getLiga();
        }
        aux = head;
    }

    public int countParOrImpares(String option){
        int result = 0;
        aux = aux.getLiga();
        while (aux != null) {
            if (option.equalsIgnoreCase("par") && aux.getInfo() % 2 == 0) result++;
            if (aux.getInfo() % 2 == 1 && option.equalsIgnoreCase("impar")) result++;
            aux = aux.getLiga();
        }
        aux = head;
        return result;
    }
}

package doublyLinkedListExercises.exerciseThree;

import doublyLinkedListExercises.exercisesOne.Article;

public class DoublyLinkedListThree {
    private IntegerNodeDouble head, tail, x, y;

    public DoublyLinkedListThree(){
        head = new IntegerNodeDouble();
        tail = x = head;
    }

    public void addElement(int info){
        IntegerNodeDouble aux = new IntegerNodeDouble(info);
        tail.setLigDer(aux);
        aux.setLigIzq(tail);
        tail = y = aux;
    }

    public int leftToRight(){
        x = x.getLigDer();
        if(x == null) x = head;
        return x.getInfo();
    }
    public int rightToLeft(){
        if (y == head){
            y = tail;
            return 0;
        }
        y = y.getLigIzq();
        return y.getLigDer().getInfo();
    }
    public void orderFromHighToLow(){
        x = head.getLigDer().getLigDer();
        int temp;
        boolean state;
        do{
            state = false;
            while (x != null){
                if (x.getInfo() > x.getLigIzq().getInfo()){
                    x = x.getLigDer();
                } else {
                    temp = x.getInfo();
                    x.setInfo(x.getLigIzq().getInfo());
                    x.getLigIzq().setInfo(temp);
                    state = true;
                }
            }
            x = head.getLigDer().getLigDer();
        }while (state);
        x = head;
    }
}

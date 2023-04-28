package doublyLinkedListExercises.exercisesOne;

public class DoublyLinkedListOne {
    private DoubleNode head, tail, x, y;
    public DoublyLinkedListOne(){
        head = new DoubleNode();
        tail = x = head;
    }
    public void addArticle(String code, String name, float costPrice, float salesPrice){
        DoubleNode temp = new DoubleNode(code, name, costPrice, salesPrice);
        tail.setLigDer(temp);
        temp.setLigIzq(tail);
        tail = y = temp;
    }
    public Article leftToRight(){
        x = x.getLigDer();
        if(x == null) x = head;
        return x.getInfo();
    }
    public Article rightToLeft(){
        if (y == head){
            y = tail;
            return null;
        }
        y = y.getLigIzq();
        return y.getLigDer().getInfo();
    }
    public void exchange(){
        Article temp;
        x = x.getLigDer();
        while(x != y){
            temp = x.getInfo();
            x.setInfo(y.getInfo());
            y.setInfo(temp);

            x = x.getLigDer();
            y = y.getLigIzq();
        }
        x = head;
        y = tail;
    }
}

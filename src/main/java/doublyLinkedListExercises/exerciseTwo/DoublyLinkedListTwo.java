package doublyLinkedListExercises.exerciseTwo;

public class DoublyLinkedListTwo {
    private PersonNode head, tail, x, y;

    public DoublyLinkedListTwo() {
        head = new PersonNode();
        tail = x = head;
    }

    public void addPerson(String id, String name, char gender, float height){
        PersonNode aux = new PersonNode(id, name, gender, height);
        tail.setLigDer(aux);
        aux.setLigIzq(tail);
        tail = y = aux;
    }

    public Person rightToLeft(){
        x = x.getLigDer();
        if (x == null) x = head;
        return x.getInfo();
    }

    public Person leftToRight(){
        if (y == head){
            y = tail;
            return null;
        }
        y = y.getLigIzq();
        return y.getLigDer().getInfo();
    }

    public void removeElement(String id){
        PersonNode temp = x.getLigDer();
        while (!temp.getInfo().getId().equals(id)) {
            temp = temp.getLigDer();
        }
        temp.getLigIzq().setLigDer(temp.getLigDer());
        temp.getLigDer().setLigIzq(temp.getLigIzq());
    }

    public float heightAverage(char gender){
        float average = 0f;
        int counter = 0;
        x = x.getLigDer();
        while (x != null){
            if (x.getInfo().getGender() == gender){
                average += x.getInfo().getHeight();
                counter += 1;
            }
            x = x.getLigDer();
        }
        x = head;
        return (average/counter);
    }

    public Person belowAverage(){
        x = x.getLigDer();
        while (x != null){
            if (x != tail && x.getInfo().getHeight() < x.getLigDer().getInfo().getHeight()){
                return x.getInfo();
            }
            if (x == tail && x.getLigIzq().getInfo().getHeight() > x.getInfo().getHeight()){
                return x.getInfo();
            }
            x = x.getLigDer();
        }
        x = head;
        return null;
    }

    public boolean ifExist(String id){
        x = x.getLigDer();
        while (x != null){
            if (x.getInfo().getId().equals(id)){
                x = head;
                return true;
            } else {
                x = x.getLigDer();
            }
        }
        return false;
    }
}

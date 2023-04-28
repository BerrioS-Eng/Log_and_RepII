package simplyLinkedListExercises.exercise3;

public class LinkedListThree {
    private Node head, tail, aux;

    public LinkedListThree(){
        head = new Node(new Employee("vació", "", ' ', 0));
        tail = aux = head;
    }

    public void addNode(Employee info){
        tail.setLiga(new Node(info));
        tail = tail.getLiga();
    }

    public Employee showElements(){
       aux = aux.getLiga();
       if (aux == null) aux = head;
       return aux.getInfo();
    }

    public boolean removeEmployee(String idEmployee){ //Desarrollar utilizando solo un objeto Node
        Node previous = head;
        Node next = head.getLiga();
        while (next != null){
            if (next.getInfo().getId().equals(idEmployee)){
                previous.setLiga(next.getLiga());
                return true;
            }
            previous = next;
            next = next.getLiga();
        }
        tail = previous;
        return false;
    }

    public float averageSalary(char gender){
        float average = 0;
        int count = 0;
        aux = aux.getLiga();
        while (aux != null){
            char auxGender = aux.getInfo().getGender();
            if (auxGender == gender) {
                average += aux.getInfo().getSalary();
                count++;
            }
            aux = aux.getLiga();
        }
        aux = head;
        return (average/count);
    }

    public boolean ifExist(String idEmployee){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getId().equalsIgnoreCase(idEmployee)){
                return true;
            } else {
                aux = aux.getLiga();
            }
        }
        aux = head;
        return false;
    }

    public Node searchNode(String idEmployee){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getId().equals(idEmployee)) return aux;
            aux = aux.getLiga();
        }
        aux = head;
        return null;
    }
}

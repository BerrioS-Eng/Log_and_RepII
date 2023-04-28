package simplyLinkedListExercises.practiceClass;

public class ListaLigada {
    private Nodo head, tail, aux;

    public ListaLigada() {
        head = new Nodo(0);
        tail = aux = head;
    }

    public void addNode(int info) { //Ingresa un elemento a la colección
        tail.setLiga(new Nodo(info));
        tail = tail.getLiga();
    }

    public void displayWithOut() { //Muestra los elementos de la colección
        Nodo current = head.getLiga();
        if (current != null) { //Valida que la colección no esté vacía
            while (current != null) {
                System.out.print(current.getInfo() + " ");
                current = current.getLiga();
            }
        } else
            System.out.println("This linked list is empty!!");
    }

    public int display(){
        aux = aux.getLiga();
        if(aux == null){
            aux = head;
        }
        return aux.getInfo();
    }

    public Nodo reverseList(Nodo current) {
        if (current.getLiga() == null) {
            System.out.println(current.getInfo());
            return current;
        }
        //Recursively calls the reverse function  
        reverseList(current.getLiga());
        System.out.println(current.getInfo());
        return current;
    }

    public int countImpares(){
        int result = 0;
        Nodo current = head.getLiga();
        while (current != null) {
            if (current.getInfo() % 2 == 1) result++;
            current = current.getLiga();
        }
        return result;
    }
}

package simplyLinkedListExercises.exercises7;

public class LinkedListSeven {
    private NodeEmployee head, tail, aux;
    public LinkedListSeven(){
        head = new NodeEmployee(new Employee());
        tail = aux = head;
    }
    public void addEmployee(String id, String name, int zone, float totalSales){
        NodeEmployee node = new NodeEmployee(new Employee(id, name, zone, totalSales));
        tail.setLiga(node);
        tail = tail.getLiga();
    }
    public Employee getElements(){
        aux = aux.getLiga();
        if (aux == null) aux = head;
        return aux.getInfo();
    }
    public float totalSalesByZone(int zone){
        float acumSales = 0;
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getZone() == zone) acumSales += aux.getInfo().getTotalSales();
            aux = aux.getLiga();
        }
        aux = head;
        return acumSales;
    }
    public Employee getElementByZone(int zone){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getZone() == zone) return aux.getInfo();
            aux = aux.getLiga();
        }
        aux = head;
        return aux.getInfo();
    }
    public boolean ifExist(String id){
        aux = aux.getLiga();
        while (aux != null){
            if (aux.getInfo().getId().equals(id)) return true;
            aux = aux.getLiga();
        }
        aux = head;
        return false;
    }
}

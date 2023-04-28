package simplyLinkedListExercises.exercises7;

public class Employee {
    private String id, name;
    private int zone;
    private float totalSales;

    public Employee() {
        id = null;
    }

    public Employee(String id, String name, int zone, float totalSales) {
        this.id = id;
        this.name = name;
        this.zone = zone;
        this.totalSales = totalSales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }

    public float calculateCommission(){
        float commission = (8/100f);
        return totalSales * commission;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", zone=" + zone +
                ", commission=" + calculateCommission() +
                '}';
    }
}

package doublyLinkedListExercises.exerciseTwo;

public class Person {
    private String id, name;
    private char gender;
    private float height;

    public Person(String id, String name, char gender, float height) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.height = height;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }
}

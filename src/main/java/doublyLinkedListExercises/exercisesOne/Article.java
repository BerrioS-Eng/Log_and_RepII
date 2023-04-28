package doublyLinkedListExercises.exercisesOne;

public class Article {
    private String code, name;
    private float costPrice, salesPrice;

    public Article(String code, String name, float costPrice, float salesPrice) {
        this.code = code;
        this.name = name;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(float costPrice) {
        this.costPrice = costPrice;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return "Article{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", costPrice=" + costPrice +
                ", salesPrice=" + salesPrice +
                '}';
    }
}

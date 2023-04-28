package doublyLinkedListExercises.exercisesOne;

public class DoubleNode {
    private Article info;
    private DoubleNode ligIzq, ligDer;

    public DoubleNode() {
        info = null;
        ligIzq = ligDer = null;
    }

    public DoubleNode(String code, String name, float costPrices, float salesPrice){
        info = new Article(code, name, costPrices, salesPrice);
        ligIzq = ligDer;
    }

    public Article getInfo() {
        return info;
    }

    public void setInfo(Article info) {
        this.info = info;
    }

    public DoubleNode getLigIzq() {
        return ligIzq;
    }

    public void setLigIzq(DoubleNode ligIzq) {
        this.ligIzq = ligIzq;
    }

    public DoubleNode getLigDer() {
        return ligDer;
    }

    public void setLigDer(DoubleNode ligDer) {
        this.ligDer = ligDer;
    }
}

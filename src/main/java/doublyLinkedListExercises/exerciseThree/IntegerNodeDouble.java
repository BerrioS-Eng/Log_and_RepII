package doublyLinkedListExercises.exerciseThree;

public class IntegerNodeDouble {
    private int info;
    private IntegerNodeDouble ligIzq, ligDer;

    public IntegerNodeDouble(){
        info = 0;
        ligIzq = ligDer = null;
    }

    public IntegerNodeDouble(int info){
        this.info = info;
        ligIzq = ligDer = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public IntegerNodeDouble getLigIzq() {
        return ligIzq;
    }

    public void setLigIzq(IntegerNodeDouble ligIzq) {
        this.ligIzq = ligIzq;
    }

    public IntegerNodeDouble getLigDer() {
        return ligDer;
    }

    public void setLigDer(IntegerNodeDouble ligDer) {
        this.ligDer = ligDer;
    }
}

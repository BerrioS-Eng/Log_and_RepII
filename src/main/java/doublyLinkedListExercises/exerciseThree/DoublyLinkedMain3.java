package doublyLinkedListExercises.exerciseThree;

public class DoublyLinkedMain3 {
    public static void main(String[] args) {
        DoublyLinkedListThree doublyLinkedListThree = new DoublyLinkedListThree();
        int element;

        doublyLinkedListThree.addElement(1);
        doublyLinkedListThree.addElement(11);
        doublyLinkedListThree.addElement(3);
        doublyLinkedListThree.addElement(7);
        doublyLinkedListThree.addElement(6);
        doublyLinkedListThree.addElement(5);
        doublyLinkedListThree.addElement(9);
        doublyLinkedListThree.addElement(10);
        doublyLinkedListThree.addElement(8);

        element = doublyLinkedListThree.leftToRight();
        while (element != 0){
            System.out.print(element + " ");
            element = doublyLinkedListThree.leftToRight();
        }

        doublyLinkedListThree.orderFromHighToLow();
        System.out.println();

        element = doublyLinkedListThree.leftToRight();
        while (element != 0){
            System.out.print(element + " ");
            element = doublyLinkedListThree.leftToRight();
        }
    }
}

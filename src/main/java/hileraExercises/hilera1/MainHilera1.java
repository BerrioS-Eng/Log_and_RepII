package hileraExercises.hilera1;

import javax.swing.*;

public class MainHilera1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        char element;
        String phrase;

        phrase = JOptionPane.showInputDialog("Ingresa una hilera:");
        linkedList.addingByString(phrase);

        element = linkedList.getElement();
        while (element != '-'){
            System.out.print(element);
            element = linkedList.getElement();
        }

        linkedList.removeWhitespace();
        linkedList.transformA('Z');
        System.out.println();

        element = linkedList.getElement();
        while (element != '-'){
            System.out.print(element);
            element = linkedList.getElement();
        }
    }
}

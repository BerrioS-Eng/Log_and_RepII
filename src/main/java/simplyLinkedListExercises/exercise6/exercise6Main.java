package simplyLinkedListExercises.exercise6;

import simplyLinkedListExercises.practiceClass.ExerciseNodos;

import java.io.IOException;

public class exercise6Main {
    public static void main(String[] args) {
        LinkedListSix linkedListSix = new LinkedListSix();
        int info = 999;
        try {
            info = ExerciseNodos.readInt("Ingresa el primer numero: ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        while (info != 999){
            linkedListSix.addNode(info);
            try {
                info = ExerciseNodos.readInt("Ingresa el siguiente numero: ");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        info = linkedListSix.getElement();
        while (info != 0){
            System.out.print(info + " - ");
            info = linkedListSix.getElement();
        }
        System.out.println();

        System.out.println((linkedListSix.searchMax()));
        System.out.println((linkedListSix.searchMin()));

        linkedListSix.removeElement("max");
        linkedListSix.removeElement("min");
        

        info = linkedListSix.getElement();
        while (info != 0){
            System.out.print(info + " - ");
            info = linkedListSix.getElement();
        }
        System.out.println();

        info = linkedListSix.showOddOrEven("impar");
        while(info != 0){
            System.out.print(info + " - ");
            info = linkedListSix.showOddOrEven("impar");
        }
        System.out.println();
        info = linkedListSix.showOddOrEven("par");
        while(info != 0){
            System.out.print(info + " - ");
            info = linkedListSix.showOddOrEven("par");
        }

    }
}

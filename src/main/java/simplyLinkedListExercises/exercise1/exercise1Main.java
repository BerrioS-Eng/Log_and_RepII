package simplyLinkedListExercises.exercise1;

import simplyLinkedListExercises.practiceClass.ExerciseNodos;

import java.io.IOException;

public class exercise1Main {
    public static void main(String[] args) {
        int flag = 999;
        LinkedListOne linkedlist = new LinkedListOne();
        try {
            flag = ExerciseNodos.readInt("El primer número es: ");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        while (flag != 999){
            linkedlist.addNode(flag);
            try {
                flag = ExerciseNodos.readInt("El siguiente número es: ");
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        flag = linkedlist.display();
        while (flag != 0){
            System.out.print(flag + " ");
            flag = linkedlist.display();
        }
        System.out.println();
        System.out.println("El mayor número de la colección es: " + linkedlist.maxValue());
        System.out.println("El promedio de pares es: " + linkedlist.averagePar());
        System.out.println("El número de pares mayor al promedio es: " + linkedlist.getCountMaxValueAverage());
    }
}

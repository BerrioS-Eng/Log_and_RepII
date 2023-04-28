package simplyLinkedListExercises.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4Main {
    private static BufferedReader STDIN = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int info;
        LinkedListFour linkedListFour = new LinkedListFour();

        info = readInt("Ingresa el primer número");
        while (info != 999) {
            linkedListFour.addNode(info);
            info = readInt("Ingresa el primer número");
        }

        info = linkedListFour.showElement();
        while (info != 0){
            System.out.print(info + " ");
            info = linkedListFour.showElement();
        }

        linkedListFour.changeInfo();
        System.out.println();

        info = linkedListFour.showElement();
        while (info != 0){
            System.out.print(info + " ");
            info = linkedListFour.showElement();
        }
        System.out.println();
        System.out.println("El promedio de positivos es: " + linkedListFour.countNegativeOrPositivo('+'));
        System.out.println("El promedio de negativos es: " + linkedListFour.countNegativeOrPositivo('-'));

        LinkedListFour objOther = linkedListFour.createNewPositive();
        System.out.print("La nueva lista ligada solo con los positivos: ");
        info = objOther.showElement();
        while (info != 0){
            System.out.print(info + " ");
            info = objOther.showElement();
        }

    }

    public static int readInt(String message) throws IOException {
        int num;
        System.out.print(message);
        num = Integer.parseInt(STDIN.readLine());
        return num;
    }
}

package simplyLinkedListExercises.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise2Main {
    private static BufferedReader stdin;
    private static LinkedListTwo linkedListTwo;
    public static void main(String[] args) {
        linkedListTwo = new LinkedListTwo();
        int flag = 999;
        addElementToLinkedList(flag);
        System.out.println("El mayor número de la colección es: " + linkedListTwo.maxOrMinInfo("mayor"));
        System.out.println("El mayor número de la colección es: " + linkedListTwo.maxOrMinInfo("menor"));
        linkedListTwo.convertToAbs();
        System.out.println("El número de elementos pares es: " + linkedListTwo.countParOrImpares("par"));
        System.out.println("El número de elementos impares es: " + linkedListTwo.countParOrImpares("impar"));
        showElements();
    }

    public static int readInt(String message) throws IOException{
        int num;
        stdin = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(message);
            num = Integer.parseInt(stdin.readLine());
            if (num == 0) System.out.println("El número debe ser diferente de CERO");
        }while (num == 0);
        return num;
    }

    public static void addElementToLinkedList(int flag){
        try {
            flag = readInt("Ingresa el primer número: ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        while (flag != 999){
            linkedListTwo.addNode(flag);
            try {
                flag = readInt("Ingresa el siguiente número: ");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void showElements(){
        int flag = linkedListTwo.display();
        while(flag != 0){
            System.out.print(flag + " ");
            flag = linkedListTwo.display();
        }
    }
}

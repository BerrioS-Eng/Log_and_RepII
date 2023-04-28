package simplyLinkedListExercises.exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5Main {
    private static final BufferedReader STDIN = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Person person;
        LinkedListFive linkedListFive = new LinkedListFive();
        person = readPerson("Ingresa la primera persona: ");
        while (!person.getId().equals("vació")){
            linkedListFive.addNode(person);
            person = readPerson("Ingresa la siguiente persona: ");
        }
        System.out.println();
        boolean flag = true;
        do {
            System.out.print("Ingresa una identification: ");
            person = linkedListFive.ifExist(STDIN.readLine());
            if (person.getId().equals("/*")){
                System.out.print("La persona no está registrada. Desea registrarla (S/N): ");
                if (STDIN.readLine().equals("S")) {
                    linkedListFive.addNode(readPerson("Ingresa los datos: "));
                    flag = false;
                }
            } else {
                System.out.println("La persona está registrada!!");
            }
        }while (flag);
        System.out.println();
        person = linkedListFive.showElements();
        while (!person.getId().equals("/*")){
            System.out.println(person);
            person = linkedListFive.showElements();
        }
    }
    public static Person readPerson(String message)throws IOException{
        System.out.print(message);
        String[] dataPerson = STDIN.readLine().split(" ");
        if (dataPerson[0].equals("/*")) return new Person("vació", "", "", "");
        return new Person(dataPerson[0], dataPerson[1], dataPerson[2], dataPerson[2]);
    }
}

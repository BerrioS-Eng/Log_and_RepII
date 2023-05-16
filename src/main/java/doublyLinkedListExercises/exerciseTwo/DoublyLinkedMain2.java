package doublyLinkedListExercises.exerciseTwo;

import java.util.Scanner;

public class DoublyLinkedMain2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DoublyLinkedListTwo doublyLinkedListTwo = new DoublyLinkedListTwo();
        Person person;
        String id, name;
        char gender;
        float height;

        doublyLinkedListTwo.addPerson("123", "person1", 'm', 1.78f);
        doublyLinkedListTwo.addPerson("456", "person2", 'f', 1.68f);
        doublyLinkedListTwo.addPerson("789", "person3", 'm', 1.98f);
        doublyLinkedListTwo.addPerson("741", "person4", 'f', 1.58f);
        doublyLinkedListTwo.addPerson("852", "person5", 'm', 1.88f);
        doublyLinkedListTwo.addPerson("963", "person6", 'f', 1.48f);

        char opcion = menuOption();
        do {
            switch (opcion) {
                case '1' -> {
                    id = readString("Ingrese un id: ");
                    if (!doublyLinkedListTwo.ifExist(id)) {
                        name = readString("Ingrese un nombre: ");
                        gender = readChar("Ingrese un género: ");
                        height = readFloat("Ingrese una estatura: ");
                        doublyLinkedListTwo.addPerson(id, name, gender, height);
                        scanner.nextLine();
                    } else {
                        System.out.println("La persona ya se encuentra registrada!!");
                    }
                }
                case '2' -> {
                    id = readString("Ingrese un id: ");
                    if (doublyLinkedListTwo.ifExist(id)) {
                        doublyLinkedListTwo.removeElement(id);
                    } else {
                        System.out.println("La persona no se encuentra registrada!!");
                    }
                }
                case '3' -> {
                    person = doublyLinkedListTwo.rightToLeft();
                    while (person != null) {
                        System.out.println(person);
                        person = doublyLinkedListTwo.rightToLeft();
                    }
                }
                case '4' -> {
                    person = doublyLinkedListTwo.leftToRight();
                    while (person != null) {
                        System.out.println(person);
                        person = doublyLinkedListTwo.leftToRight();
                    }
                }
                case '5' -> System.out.println("El promedio de estatura de las mujeres es: " +
                        doublyLinkedListTwo.heightAverage('f'));
                case '6' -> System.out.println("El promedio de estatura de las mujeres es: " +
                        doublyLinkedListTwo.heightAverage('m'));
                case '7' -> {
                    person = doublyLinkedListTwo.belowAverage();
                    while (person != null) {
                        System.out.println(person);
                        person = doublyLinkedListTwo.belowAverage();
                    }
                }
                case '8' -> System.out.println("Eligio salir!!");
                default -> System.out.println("Opción incorrecta!!");
            }
            opcion = menuOption();
        }while (opcion != '8');
    }
    private static char menuOption(){
        System.out.println(
                "\n\t\tExercise 2\n" +
                "\t1. Ingresa una nueva persona\n" +
                "\t2. Eliminar una persona (según id)\n" +
                "\t3. Mostrar lista al derecho\n" +
                "\t4. Mostrar lista al revés\n" +
                "\t5. Mostrar promedio de estatura mujeres\n" +
                "\t6. Mostrar promedio de estatura hombres\n" +
                "\t7. Mostrar listado con las personas de menor estatura\n" +
                "\t8. Salir\n"
        );
        System.out.print("Ingresa una opción: ");
        return scanner.nextLine().charAt(0);
    }
    public static String readString(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    public static char readChar(String message){
        System.out.print(message);
        return scanner.nextLine().charAt(0);
    }
    public static float readFloat(String message){
        System.out.print(message);
        return scanner.nextFloat();
    }
}

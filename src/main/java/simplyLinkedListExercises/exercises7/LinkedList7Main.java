package simplyLinkedListExercises.exercises7;

import java.util.Scanner;

public class LinkedList7Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedListSeven linkedListSeven = new LinkedListSeven();
        Employee employee;
        String id, name;
        int zone, option;
        float totalSales;

        id = readString("Ingrese el id: ");
        while (!id.equals("/*")){
            name = readString("Ingresa el nombre: ");
            do {
                zone = readInt("Ingresa la zona: ");
            }while (zone <= 0 || zone >= 4);
            totalSales = readFloat("Ingresa el total de ventas: ");
            linkedListSeven.addEmployee(id, name, zone, totalSales);
            scanner.nextLine();
            id = readString("Ingrese el id: ");
        }

        do {
            System.out.println(showMenu());
            option = readInt("Digita una opción: ");
            switch (option){
                case 1:
                    scanner.nextLine();
                    id = readString("Ingrese un id: ");
                    if (!linkedListSeven.ifExist(id)){
                        name = readString("Ingresa el nombre: ");
                        do {
                            zone = readInt("Ingresa la zona: ");
                        }while (zone <= 0 || zone >= 4);
                        totalSales = readFloat("Ingresa el total de ventas: ");
                        linkedListSeven.addEmployee(id, name, zone, totalSales);
                    } else{
                        System.out.println("El empleado ya existe!!");
                    }
                    break;
                case 2:
                    employee = linkedListSeven.getElements();
                    while (employee.getId() != null){
                        System.out.println(employee);
                        employee = linkedListSeven.getElements();
                    }
                    break;
                case 3:
                    zone = readInt("Digite la zona a consultar: ");
                    System.out.println(linkedListSeven.totalSalesByZone(zone));
                    break;
                case 4:
                    zone = readInt("Digite la zona a consultar: ");
                    employee = linkedListSeven.getElementByZone(zone);
                    while (employee.getId() != null){
                        System.out.println(employee);
                        employee = linkedListSeven.getElementByZone(zone);
                    }
                    break;
                case 5:
                    System.out.println("Eligió salir!!!");
                    break;
                default:
                    System.out.println("Opción incorrecta!!!");
            }
        }while (option != 5);

    }
    public static String readString(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    public static int readInt(String message){
        System.out.print(message);
        return scanner.nextInt();
    }
    public static float readFloat(String message){
        System.out.print(message);
        return scanner.nextFloat();
    }
    public static String showMenu(){
        return "\n\tExercise 7\n" +
                "1. Ingrese un nuevo empleado" + "\n" +
                "2. Mostrar todos los empleados (Nombre, zona, comisión)" + "\n" +
                "3. Consultar total de ventas por zona" + "\n" +
                "4. Consultar los vendedores según zona" + "\n" +
                "5. Salir" + "\n";
    }
}

package simplyLinkedListExercises.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3Main {
    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        char option;
        boolean exist;
        Employee emp;
        LinkedListThree linkedListThree = new LinkedListThree();

        emp = readEmployee("Ingresa el primer empleado: ");
        while (!emp.getId().equals("vació")){
            linkedListThree.addNode(emp);
            do {
                emp = readEmployee("Ingresa el siguiente empleado: ");
                exist = linkedListThree.ifExist(emp.getId());
                if (exist) System.out.println("El empleado ya existe!!");
            }while (exist);
        }

        do {
            option = menuOptions();
            switch (option){
                case '1':
                    System.out.println();
                    emp = readEmployee("Ingrese un nuevo empleado: ");
                    if (!linkedListThree.ifExist(emp.getId())){
                        linkedListThree.addNode(emp);
                    } else {
                        System.out.println("El empleado ya existe!!");
                    }
                    break;
                case '2':
                    System.out.println();
                    emp = linkedListThree.showElements();
                    while (!emp.getId().equals("vació")){
                        System.out.println(emp);
                        emp = linkedListThree.showElements();
                    }
                    break;
                case '3':
                    System.out.println();
                    System.out.println("El salario promedio de los hombres es: " + linkedListThree.averageSalary('M'));
                    break;
                case '4':
                    System.out.println();
                    System.out.println("El salario promedio de los hombres es: " + linkedListThree.averageSalary('F'));
                    break;
                case '5':
                    System.out.println();
                    System.out.println(linkedListThree.removeEmployee(readString("Ingrese el id del empleado: "))
                                        ? "Empleado borrado" : "No se puede borrar un empleado que no existe!!");
                    break;
                case '6':
                    System.out.println();
                    System.out.println("Eligió salir!!");
                    break;
            }
        }while (option != '6');

    }

    public static Employee readEmployee(String message) throws IOException {
        System.out.print(message);
        String[] dataFull = stdin.readLine().split(" ");
        if(dataFull[0].equalsIgnoreCase("/*")) return new Employee("vació", "", ' ', 0);
        return new Employee(dataFull[0], dataFull[1], dataFull[2].charAt(0), Float.parseFloat(dataFull[3]));
    }

    public static String readString(String message) throws IOException{
        System.out.print(message);
        return stdin.readLine();
    }

    public static char menuOptions() throws IOException{
        char option;
        System.out.println();
        System.out.println("\t\tEjercicio #3");
        System.out.println("1 => Ingresar un empleado");
        System.out.println("2 => Mostrar datos");
        System.out.println("3 => Salario promedio hombres");
        System.out.println("4 => Salario promedio mujeres");
        System.out.println("5 => Eliminar un empleado");
        System.out.println("6 => salir");
        do {
            System.out.print("\tIngrese una opción:");
            option = stdin.readLine().charAt(0);
            if (option < '1' || option > '6') System.out.println("Opción no válida");
        }while (option < '1' || option > '6');
        return option;
    }
}

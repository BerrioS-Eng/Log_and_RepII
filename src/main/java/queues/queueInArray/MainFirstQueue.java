package queues.queueInArray;

import doublyLinkedListExercises.exerciseTwo.Person;

import javax.swing.*;

public class MainFirstQueue {
    public static void main(String[] args) {
        QueueInArray queueInArray = new QueueInArray(5);
        Person person;
        char opc;
        boolean truhty;
        String menu = "\tMenú Options:\n" +
                "1. Encolar\n" +
                "2. Desencolar\n" +
                "3. Mostrar Cola\n" +
                "4. Salir\n" +
                "\tIngrese una opción";

        do {
            opc = toChart(
                    JOptionPane.showInputDialog(null,
                            menu,
                            "Cola en array",
                            JOptionPane.INFORMATION_MESSAGE)
            );
            switch (
                    opc
            ) {
                case '1':
                    if (!queueInArray.ifFullQueue()){
                        truhty = queueInArray.encolar(
                                toPerson(
                                        JOptionPane.showInputDialog(null,
                                                "Ingresa los siguientes datos con el formato indicado\n" +
                                                        "Identificación-nombre-género-estatura",
                                                "Cola en array",
                                                JOptionPane.INFORMATION_MESSAGE)
                                )
                        );
                        System.out.println(
                                truhty ? "Ingresado" : "No ingresado"
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "Cola llena");
                    }
                    break;
                case '2':
                    if (!queueInArray.ifEmptyQueue()){
                        person = queueInArray.desencolar();
                        System.out.println(person);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cola vaciá");
                    }
                    break;
                case '3':
                    person = queueInArray.showQueue();
                    while (person != null){
                        System.out.println(person);
                        person = queueInArray.showQueue();
                    }
                    break;
                case '4':
                    System.out.println("Eligió salir!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada no es correcta");
            }
        } while (opc != '4');
    }

    public static Person toPerson(String input){
        String[] data = input.replaceAll("\\s","").split("-");
        return new Person(data[0], data[1], data[2].charAt(0), Float.parseFloat(data[3]));
    }

    public static char toChart(String input){
        return input.charAt(0);
    }
}

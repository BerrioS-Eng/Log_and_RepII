package queues.queueInLinkedlist;

import doublyLinkedListExercises.exerciseTwo.Person;

import javax.swing.*;

public class MainSecondQueue {
    public static void main(String[] args) {
        QueueInLinkedlist queue = new QueueInLinkedlist();
        Person person;
        char opc;
        String menu = "\tMenú Options:\n" +
                "1. Encolar\n" +
                "2. Desencolar\n" +
                "3. Mostrar Cola\n" +
                "4. Salir\n" +
                "\tIngrese una opción";
        do {
            opc = toChart(JOptionPane.showInputDialog(
                    null,
                    menu,
                    "Cola en lista ligada",
                    JOptionPane.QUESTION_MESSAGE));
            switch (
                    opc
            ) {
                case '1':
                    System.out.println(
                            queue.encolar(
                                    toPerson(
                                            JOptionPane.showInputDialog(
                                                    null,
                                                    "\tIngresa los datos\nEj. id-nombre-género-estatura")
                                    )
                            ) ? "Ingresado" : "No ingresado"
                    );
                    break;
                case '2':
                    if (queue.ifEmptyQueue()) {
                        System.out.println("------> Cola vacía");
                    } else {
                        System.out.println("-----> " + queue.desencolar());
                    }
                    break;
                case '3':
                    person = queue.mostrarCola();
                    while (!person.getId().equals("/*")) {
                        System.out.println(person);
                        person = queue.mostrarCola();
                    }
                    break;
                case '4':
                    System.out.println("Eligió salir!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta!!!");
            }
        } while (opc != '4');
    }

    public static Person toPerson(String input) {
        String[] data = input.replaceAll("\\s", "").split("-");
        return new Person(data[0], data[1], data[2].charAt(0), Float.parseFloat(data[3]));
    }

    public static char toChart(String input) {
        return input.charAt(0);
    }
}


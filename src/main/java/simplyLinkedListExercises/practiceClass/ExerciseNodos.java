package simplyLinkedListExercises.practiceClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Práctica de clase para el tema de manejo dinámico de memoria
 * * @author USUARIO
 * */
public class ExerciseNodos {
    private static final BufferedReader STDIN = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int info = 999; //Inicialización debido a los bloques try-catch
        ListaLigada linked = new ListaLigada();
        //Scanner scanner = new Scanner(System.in);

        System.out.println("!Bienvenido!");
        System.out.println("==> Ingrese un número, por favor // 9999 para salir");
        //System.out.print("El primer número es: ");
        //info = scanner.nextInt();
        try {
            info = readInt("El primer número es: ");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        while(info != 999){
            linked.addNode(info);
            //System.out.print("El siguiente número es: ");
            //info = scanner.nextInt();
            try {
                info = readInt("El siguiente número es: ");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        //linked.displayWithOut();
        info = linked.display();
        while (info != 0){
            System.out.print(info + " ");
            info = linked.display();
        }
        System.out.println();
        System.out.println("El número de impares es: " + linked.countImpares());
    }

    public static int readInt(String message) throws IOException {
        int num;
        do { //Validación para números mayores a cero
            System.out.print(message);
            num = Integer.parseInt(STDIN.readLine());
            if (num <= 0) System.out.println("El número debe ser mayor a CERO");
        }while (num <= 0);
        return num;
    }
}

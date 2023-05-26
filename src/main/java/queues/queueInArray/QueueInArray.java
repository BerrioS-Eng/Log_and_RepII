package queues.queueInArray;

import doublyLinkedListExercises.exerciseTwo.Person;

public class QueueInArray {
    private Person[] arrayPerson;
    private int maximo, primero, ultimo, x;

    public QueueInArray(int maximo) {
        this.maximo = maximo;
        arrayPerson = new Person[maximo];
        primero = x = 0;
        ultimo = -1;
    }

    public boolean encolar(Person person){
        ++ultimo;
        arrayPerson[ultimo] = person;
        return true;
    }

    public Person desencolar(){
        Person elementToDesencolar = arrayPerson[primero];
        ++primero;
        x = primero;
        return elementToDesencolar;
    }

    public boolean ifEmptyQueue(){
        if(primero > ultimo){
            primero = x = 0;
            ultimo = -1;
            return true;
        }
        return false;
    }

    public boolean ifFullQueue(){
        if(primero == 0 && ultimo == (maximo-1)){
            return true;
        } else {
            if(ultimo == (maximo-1)){
                int k=0;
                for (int p = primero; p < ultimo; p++){
                    arrayPerson[k] = arrayPerson[p];
                    ++k;
                }
                primero = x = 0;
                ultimo = (maximo-1) - primero;
            }
            return false;
        }
    }

    public Person showQueue(){
        if(x <= ultimo){
            return arrayPerson[x++];
        } else {
            x = primero;
            return null;
        }
    }
}

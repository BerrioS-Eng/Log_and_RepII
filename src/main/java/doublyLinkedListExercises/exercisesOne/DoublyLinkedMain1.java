package doublyLinkedListExercises.exercisesOne;
/*
1) Un almacén quiere disponer de una aplicación que cree una lista doblemente ligada
con los datos: código, nombre, precio costo y precio venta de sus artículos y luego
permita intercambiar los INFO (objeto artículo) así: primero con último, segundo con
penúltimo, tercero con antepenúltimo, y así sucesivamente, además, mostrar la lista
antes y después de los intercambios.
 */
public class DoublyLinkedMain1 {
    public static void main(String[] args) {
        Article article;
        DoublyLinkedListOne doublyLinkedListOne = new DoublyLinkedListOne();

        doublyLinkedListOne.addArticle("123", "Jabón Rey", 1000f, 2000f);
        doublyLinkedListOne.addArticle("456", "Cepillo Colgate", 1500f, 2500f);
        doublyLinkedListOne.addArticle("852", "Cerveza Heineken", 1500f, 3000f);
        doublyLinkedListOne.addArticle("789", "Shampoo h&s", 2000f, 3500f);
        doublyLinkedListOne.addArticle("741", "Chocolatina Jumbo", 800f, 1500);

        article = doublyLinkedListOne.leftToRight();
        while (article != null) {
            System.out.println(article);
            article = doublyLinkedListOne.leftToRight();
        }

        System.out.println();
        doublyLinkedListOne.exchange();

        /*article = doublyLinkedListOne.rightToLeft();
        while (article != null) {
            System.out.println(article);
            article = doublyLinkedListOne.rightToLeft();*/

        article = doublyLinkedListOne.leftToRight();
        while (article != null) {
            System.out.println(article);
            article = doublyLinkedListOne.leftToRight();
        }
    }
}


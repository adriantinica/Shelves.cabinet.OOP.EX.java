/*
*  https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/oop/inheritance/shelves.cabinet.STEP1.ro.md
*/
import skeleton.Thing;
import skeleton.Cabinet;
import things.Book;
import things.Phone;
import things.Tablet;

public class CabinetApp {
    public static void main(String[] args) {
        
        Thing Phone1 = new Phone("Nokia 6300");
        Thing Phone2 = new Phone("Nokia 6303 classic");

        Thing Book1 = new Book("Learn Java in 1 Day");
        Thing Tablet1 = new Tablet("Samsung Galaxy Tab A7 Lite");
        //Thing [] ColectiaDeAur ={
        //    new Book("Learn Java in 1 Day"),
        //    new Book("Learn Java in 1 Day"),
        //    new Book("Learn Java in 1 Day"),
        
        //};

        Cabinet Biblioteca = new Cabinet();

        Biblioteca.put("middleShelf", Phone1);
        Biblioteca.put("middleShelf", Phone2);
        Biblioteca.put("topShelf", Book1);
        Biblioteca.put("bottomShelf", Tablet1 );
        //Biblioteca.put("middleShelf", ColectiaDeAur);
        System.out.println(Biblioteca);
        System.out.println("\n");

        Biblioteca.take("middleShelf" );
        System.out.println(Biblioteca);
        System.out.println("\n");

        



    }

    
}

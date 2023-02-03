import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 3. Ассоциативные массивы и карты");

        Car car = new Car("Tayota");
        Car car2 = new Car("Tayota");

        Mechanic mechanic = new Mechanic( "Иван");
        Mechanic mechanic1 = new Mechanic( "Иван");


        Map<Car, Mechanic> list = new HashMap<>();
        list.put(car, mechanic);
        list.put(car2,  mechanic1);
        System.out.println(list);
    }
}
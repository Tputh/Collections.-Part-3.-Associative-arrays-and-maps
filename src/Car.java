import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
private String stamp;
private Set<Car> cars = new HashSet<>();

    public Car(String stamp) {
        this.stamp = stamp;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(stamp, car.stamp) && Objects.equals(cars, car.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stamp, cars);
    }

    public void printCar(Car car) {
        Set<Car> carSet = new HashSet<>();
        carSet.add(car);
        cars.add(this);
    }

    @Override
    public String toString() {
        return "Автомобиль "  + stamp;
    }
}

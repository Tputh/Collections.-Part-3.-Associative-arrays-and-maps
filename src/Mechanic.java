import java.util.*;


public class Mechanic {
    private String fio;
    private Set<Mechanic> mechanics = new HashSet<>();

    public Mechanic(String fio) {
        this.fio = fio;
    }



    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fio, mechanic.fio) && Objects.equals(mechanics, mechanic.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, mechanics);
    }

    public void printCar(Mechanic mechanic) {
        Set<Mechanic> mechanicSet = new HashSet<>();
        mechanicSet.add(mechanic);
        mechanics.add(this);
    }

    @Override
    public String toString() {
        return " Водитель "  + fio;
    }

}

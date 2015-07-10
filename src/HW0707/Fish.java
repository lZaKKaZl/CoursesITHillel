package HW0707;

/**
 * Created by ITHILLEL5 on 10.07.2015.
 */
public class Fish extends Domestic {
    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Fish() {
    }

    public String phrase() {
        return "....";
    }
}

package HW0707;

/**
 * Created by ITHILLEL5 on 10.07.2015.
 */
public class Dog extends Domestic {
    public Dog(int id, int age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public Dog() {
    }

    public String phrase(){
        String result = super.phrase();
        result += " Woof!";
        return result;
    }
}

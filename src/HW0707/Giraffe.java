package HW0707;

/**
 * Created by ITHILLEL5 on 10.07.2015.
 */
public class Giraffe extends Wild {
    public Giraffe(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    public Giraffe() {
    }

    public String toString(){
        String result = "";
        result += "Id: " + getId();
        result += " Age: " + getAge();
        result += " Is Predator: " + phrase();

        return result;
    }
}

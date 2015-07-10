package HW0707;

/**
 * Created by ITHILLEL5 on 10.07.2015.
 */
    public class Cat extends Domestic {
        public Cat(int id, int age, double weight, String color, String name, boolean isVaccinated) {
            super(id, age, weight, color, name, isVaccinated);
        }

        public Cat() {
        }
        @Override
        public String phrase(){
            String result = super.phrase();
            for(int i=0; i<5; i++){
                result += " Meow!";
            }
            return result;
        }
}

package HW0707;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NewClass2 on 04.08.2015.
 */
public class ZOO {
    List animals;
    public ZOO(){
        animals = new ArrayList();
    }
    public void add(Animal animal){
        animals.add(animal);
    }
    public Animal  get(int index){
        return (Animal)animals.get(index);
    }
    public Animal remove(int index){
        return (Animal)animals.remove(index);
    }
}

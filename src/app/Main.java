package app;

import com.zoo_second.animals.Animal;
import com.zoo_second.animals.Tiger;
import com.zoo_second.animals.rare.SiberianTiger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Tiger myTiger = new Tiger();
        //Integer hungerLevel = myTiger.getHungerLevel();
        //System.out.println(hungerLevel);


        //Tiger myTiger = new Tiger();
        // Animal myTiger = new Tiger ("wolollo",78);
        Animal myTiger = new SiberianTiger ("wolollo",78);
        System.out.println("name:" + myTiger.getName() + " hunger: " + myTiger.getHungerLevel());

        myTiger.move();
        ((Tiger)myTiger).move();
        //myTiger.makeSound();
        //myTiger.feed();

        // TO TO SAMO!!!! przykład
        //((Animal)myTiger).move();
        //((Tiger)myTiger).makeSound();
        //Tiger tig = (Tiger)myTiger);
        //tig.feed();

    }
}

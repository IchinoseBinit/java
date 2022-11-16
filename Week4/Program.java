package Week4;

import java.util.ArrayList;

import Week1.Hello;

public class Program {
    public static void main(String[] args) {
        Bat bat = new Bat("Chamera", 2, 2.5, "grey", 2);
        bat.display();

        ArrayList<String> humanSkill = new ArrayList<>();
        humanSkill.add("Hard Worker");
        humanSkill.add("Communication");
        humanSkill.add("Patience");

        Human human = new Human("Manxe", 22, 80, "Black", "Pokhara", humanSkill);
        // human.display();
        Human kanxo = new Human("Manxe", 22, 80, "Black", "Pokhara", humanSkill);
        // human.display();
        System.out.println(human.hashCode());
        System.out.println(kanxo.hashCode());

        Hello hello =  new Hello();
        // hello.display();

        Dog dog = new Dog("Kukur",6, 10, "Light Blue", "German Shephard");
        dog.display();
    }
}

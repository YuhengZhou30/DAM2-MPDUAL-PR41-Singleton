import java.lang.reflect.Constructor;

public class PR430Main {

    public static void main(String[] args) {

        System.out.println(".. .iniciant 0 ...");
        PR430Objecte instance1 = PR430Objecte.getInstance("pepe","manolo",65);
        

        System.out.println(".. .iniciant 1 ...");
        PR430Objecte instance2 = PR430Objecte.getInstance("Jose","cejas",23);
        

        System.out.println(".. .iniciant 2 ...");
        PR430Objecte instance3 = PR430Objecte.getInstance("Juan","Lopez",43);
        
        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());
    }

}
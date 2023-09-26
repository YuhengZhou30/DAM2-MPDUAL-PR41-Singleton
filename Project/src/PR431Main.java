public class PR431Main {

    public static void main(String[] args) {

        System.out.println(".. .iniciant 0 ...");
        PR431Objecte instance1 = PR431Objecte.getInstance("pepe","manolo",65);
        

        System.out.println(".. .iniciant 1 ...");
        PR431Objecte instance2 = PR431Objecte.getNewDestroyedInstance("Jose","cejas",23);
        

        System.out.println(".. .iniciant 2 ...");
        PR431Objecte instance3 = PR431Objecte.getNewDestroyedInstance("Juan","Lopez",43);
        
        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());
    }

}
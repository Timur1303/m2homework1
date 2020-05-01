public class Main {

    public static void main(String[] args) {
        Laptop lA  = new Laptop(512, 15);
        Smartphone sA = new Smartphone(15, Brands.SAMSUNG, new Gadget(450, "Black"));
        Smartphone sB = new Smartphone(12, Brands.APPLE, new Gadget(350,"White"));

        System.out.println(sA.aboutSmarthone());
        System.out.println(sB.aboutSmarthone());
        System.out.println(lA.laptopSpecs());



    }
}

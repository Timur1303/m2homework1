public class Smartphone extends Laptop {
    private int cameraPixel;
    private Brands brand;
    private Gadget gadget;



    public Smartphone(int cameraPixel, Brands brand, Gadget gadget){
        this.cameraPixel = cameraPixel;
        this.brand = brand;
        this.gadget = gadget;

    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public Brands getBrand(){
        return brand;
    }

    public Gadget getGadget(){
        return gadget;
    }

    @Override
    public void choiceLaptop(int memory, String name){
        for (int i = 0; i < memory ; i++) {
            System.out.println(name);

        }
    }

    public String aboutSmarthone(){
        return "Specs of smartphone: pixels of camera "+cameraPixel +" brand is "+ brand +
                " price $"+ gadget.getPrice() + ", color " +gadget.getColor();
    }
}

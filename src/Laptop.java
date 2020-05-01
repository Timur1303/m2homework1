public class Laptop extends Gadget {
    private int memory;
    private int displaySize;

    public Laptop(){}

    public Laptop(int memory, int displaySize){
        this.memory = memory;
        this.displaySize = displaySize;
    }

    public int getMemory(){
        return memory;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public final void choiceLaptop(String name, int memory){
        for (int i = 0; i < memory ; i++) {
            System.out.println(name);

        }
    }

    public void choiceLaptop(int memory, String name){
        for (int i = 0; i < memory ; i++) {
            System.out.println(name);

        }
    }

    public String laptopSpecs(){
        return "Laptop specs are memory is " + memory + " GB, and display size " + displaySize;
    }
}

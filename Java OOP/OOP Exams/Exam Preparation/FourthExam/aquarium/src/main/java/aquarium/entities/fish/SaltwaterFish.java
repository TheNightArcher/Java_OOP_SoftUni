package aquarium.entities.fish;

public class SaltwaterFish extends BaseFish{
    private static final int SIZE = 5;

    public SaltwaterFish(String name, String species, double price) {
        super(name, species, price);
    }

    @Override
    public void setSize(int size) {
        super.setSize(SIZE);
    }

    @Override
    public void eat() {
        super.setSize(super.getSize() + 2);
    }
}

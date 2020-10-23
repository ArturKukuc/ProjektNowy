import java.util.ArrayList;

public class Tablet {
    private int ID;
    private String brand;
    private ArrayList<MobilePhone> phones;

    public Tablet(String brand){
        this.ID = Integer.hashCode(6);
        this.brand = "Samsung";
        this.phones = new ArrayList<>();
    }
}

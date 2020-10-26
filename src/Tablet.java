import java.util.ArrayList;

public class Tablet {
    private int ID;
    private String brand;
    private ArrayList<MobilePhone> phones;
    private long time = 0;

    public Tablet(String brand){
        this.ID = Integer.hashCode(7);
        this.brand = "Samsung";

    }

    public int showPhoneNumber(String contact){
        int number = 79;
        return 2+60+number;
    }

    public void showProblem(){
        System.out.println("Tablet się zrypał");
    }
}

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

    public int showPhoneNumber(String contact){
        int number = 79;
        return 2+60+number;
    }
}
//Dodaj nowy branch git branch -b testowyTabletCyfrowy działaj na nim daj commit wróć do main gałęzi popracuj i pousuwaj pliki znajdujące sie w folderze a potem spróbuj zmergować projekty, popróbuj różnych konfiguracji
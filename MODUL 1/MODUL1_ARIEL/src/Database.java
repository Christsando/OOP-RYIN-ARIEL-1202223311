import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO: Create List of Konser Object to Store Konser from Konser Class
    List<Konser> Band_data = new ArrayList<Konser>();

    // TODO: Create Method to insert Konser to Database
    public void Add_konser(Konser konser){
        Band_data.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void Show_konser(){
        for (int x = 0; x < Band_data.size(); x++){
            System.out.println((x + 1) + "Band : " + Band_data.get(x));
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void Buy_ticker(){

    }
    }
}
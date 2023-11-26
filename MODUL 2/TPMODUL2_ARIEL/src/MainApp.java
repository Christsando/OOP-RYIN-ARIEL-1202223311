public class MainApp {
    public static void main (String[] args){
        // FILL VARIABLE FROM OTHER CLASS
        // MOBIL
        Mobil mobil1 = new Mobil("A 121 EL",120.2, 4, 4);
        Mobil mobil2 = new Mobil("L 411 RA",80.0, 6,4);

        //BUS
        Bus bus1 = new Bus("A 7 KA", 100.0, 20, 3);
        Bus bus2 = new Bus("A 131 D", 90.0, 25, 4);

        System.out.println(mobil1.toString());
        System.out.println(mobil2.toString());
        System.out.println("");
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
    }
}

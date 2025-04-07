package inhoud;

public class mainOVchipkaart {
    public static void main(String[] args) {
        OVchipkaart kaart = new OVchipkaart("123456", 10.00);
        OVpaal paal = new OVpaal("Station Amsterdam");

        paal.verwerkCheckIn(kaart);     // Inchecken
        paal.verwerkCheckOut(kaart);    // Uitchecken

    }
}

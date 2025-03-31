package inhoud;

public class mainOVchipkaart {
    public static void main(String[] args) {
        OVchipkaart mijnKaart = new OVchipkaart("1234567890", 10.00); // Een nieuwe OVChipkaart met saldo
        OVpaal paal = new OVpaal(); // Nieuwe OVpaal om in te checken

        // Inchecken en uitchecken
        paal.checkIn(mijnKaart);  
        paal.checkOut(mijnKaart);
    }
}

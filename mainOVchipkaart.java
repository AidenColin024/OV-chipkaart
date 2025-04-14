package inhoud;

public class mainOVchipkaart {
    public static void main(String[] args) {
        OVchipkaart kaart = new OVchipkaart("123456", 1.50);
        OVpaal paal = new OVpaal("Station Utrecht");
        Bank bank = new Bank();

        paal.verwerkCheckIn(kaart);      // Mislukt: te weinig saldo
        bank.stortSaldo(kaart, 10.00);   // Saldo verhogen via Bank
        paal.verwerkCheckIn(kaart);      // Nu lukt het
        paal.verwerkCheckOut(kaart);     // Uitchecken
    }
}


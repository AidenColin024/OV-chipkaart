package inhoud;

public class Bank 
{
    public void stortSaldo(OVchipkaart kaart, double bedrag) {
        if (bedrag <= 0) {
            System.out.println("Bedrag moet positief zijn.");
            return;
        }

        System.out.println("Saldo wordt verhoogd via de bank...");
        kaart.verhoogSaldo(bedrag);
    }
}


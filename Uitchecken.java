package inhoud;

public class Uitchecken extends mainOVchipkaart
{

        private static final double BASIS_TARIEF = 3.50;

	    public boolean checkOut(OVchipkaart kaart) {
	        if (!kaart.isIngecheckt()) {
	            System.out.println("Kaart is niet ingecheckt!");
	            return false;
	        }
	        if (kaart.getSaldo() < BASIS_TARIEF) {
	            System.out.println("Niet genoeg saldo om uit te checken.");
	            return false;
	        }
	        kaart.uitchecken(BASIS_TARIEF);
	        System.out.println("Succesvol uitgecheckt!");
	        return true;    
	}
}
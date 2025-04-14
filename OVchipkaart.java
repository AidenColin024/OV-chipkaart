package inhoud;

public class OVchipkaart {
    private String kaartNummer;
    private double saldo;
    private boolean ingecheckt;

    private static final double MINIMUM_SALDO = 2.00;
    private static final double BASIS_TARIEF = 3.50;

    public OVchipkaart(String kaartNummer, double saldo) {
        this.kaartNummer = kaartNummer;
        this.saldo = saldo;
        this.ingecheckt = false;
    }

    public boolean checkIn() {
        if (ingecheckt) {
            System.out.println("Kaart is al ingecheckt!");
            return false;
        }
        if (saldo < MINIMUM_SALDO) {
            System.out.println("Niet genoeg saldo om in te checken.");
            return false;
        }
        this.ingecheckt = true;
        System.out.println("Succesvol ingecheckt!");
        return true;
    }

    public boolean checkOut() {
        if (!ingecheckt) {
            System.out.println("Kaart is niet ingecheckt!");
            return false;
        }
        if (saldo < BASIS_TARIEF) {
            System.out.println("Niet genoeg saldo om uit te checken.");
            return false;
        }
        saldo -= BASIS_TARIEF;
        ingecheckt = false;
        System.out.println("Succesvol uitgecheckt! Nieuw saldo: " + saldo);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }
    public void verhoogSaldo(double bedrag) {
	    if (bedrag > 0) {
	        saldo += bedrag;
	        System.out.println("Saldo verhoogd met " + bedrag + ". Nieuw saldo: " + saldo);
	    } else {
	        System.out.println("Ongeldig bedrag.");
	    }
	}

}




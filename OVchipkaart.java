package inhoud;

public class OVchipkaart extends mainOVchipkaart
{
    private String kaartNummer;
    private double saldo;
    private boolean ingecheckt;

    public OVchipkaart(String kaartNummer, double saldo) {
        this.kaartNummer = kaartNummer;
        this.saldo = saldo;
        this.ingecheckt = false;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public double getSaldo() {
        return saldo;
    }

    public void inchecken() {
        this.ingecheckt = true;
    }
    public void uitchecken(double ritKosten) {
        if (!ingecheckt) {
            System.out.println("Kaart is niet ingecheckt!");
            return;
        }
        if (saldo < ritKosten) {
            System.out.println("Niet genoeg saldo om uit te checken.");
            return;
        }
        saldo -= ritKosten;
        ingecheckt = false;
        System.out.println("Succesvol uitgecheckt! Nieuw saldo: " + saldo);
    }
}




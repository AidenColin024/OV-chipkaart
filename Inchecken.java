package inhoud;

public class Inchecken extends mainOVchipkaart{
    
private static final double MINIMUM_SALDO = 2.00;

public boolean checkIn(OVchipkaart kaart) {
    if (kaart.isIngecheckt()) {
        System.out.println("Kaart is al ingecheckt!");
        return false;
    }
    if (kaart.getSaldo() < MINIMUM_SALDO) {
        System.out.println("Niet genoeg saldo om in te checken.");
        return false;
    }
    kaart.inchecken();
    System.out.println("Succesvol ingecheckt!");
    return true;
}
}


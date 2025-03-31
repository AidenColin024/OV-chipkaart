package inhoud;

public class OVpaal extends Inchecken
{
    private Inchecken inchecken = new Inchecken();
    private Uitchecken uitchecken = new Uitchecken();

    public boolean checkIn(OVchipkaart kaart) {
        return inchecken.checkIn(kaart);
    }
    
    public boolean checkOut(OVchipkaart kaart) {
        return uitchecken.checkOut(kaart);
    }
}



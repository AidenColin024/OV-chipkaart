package inhoud;

public class OVpaal{
    private String station;
    
    public OVpaal(String station) {
        this.station = station;
    }

    public void verwerkCheckIn(OVchipkaart kaart) {
        System.out.println("Inchecken bij: " + station);
        kaart.checkIn();
    }

    public void verwerkCheckOut(OVchipkaart kaart) {
        System.out.println("Uitchecken bij: " + station);
        kaart.checkOut();
    }
}



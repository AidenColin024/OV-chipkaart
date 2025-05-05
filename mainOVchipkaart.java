package inhoud;

import java.util.Scanner;

public class mainOVchipkaart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer kaartnummer in:");
        String kaartNummer = scanner.nextLine();

        System.out.println("Voer startsaldo in:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // buffer clear

        OVchipkaart kaart = new OVchipkaart(kaartNummer, saldo);
        OVpaal paal = new OVpaal("Station Utrecht");
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nKies een optie:");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Saldo storten");
            System.out.println("4. Toon saldo");
            System.out.println("5. Stoppen");
            System.out.print("Uw keuze: ");

            int keuze = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            switch (keuze) {
                case 1:
                    paal.verwerkCheckIn(kaart);
                    break;
                case 2:
                    paal.verwerkCheckOut(kaart);
                    break;
                case 3:
                    System.out.print("Voer bedrag in om te storten: ");
                    double bedrag = scanner.nextDouble();
                    bank.stortSaldo(kaart, bedrag);
                    break;
                case 4:
                    System.out.println("Huidig saldo: " + kaart.getSaldo());
                    break;
                case 5:
                    System.out.println("Programma beëindigd.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ongeldige keuze.");
            }
        }
    }
}

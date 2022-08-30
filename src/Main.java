import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String sc = scanner.nextLine().toUpperCase();
            switch (sc){
                case "DUISHOMBU":
                        System.out.println("DUISHOMBU: " + DayOfWeek.DUISHOMBU.getName());
                    break;
                case "SHEISHEMBI":
                    System.out.println("SHEISHEMBI: " + DayOfWeek.SHEISHEMBI.getName());
                    break;
                case "SHARSHEMBI":
                    System.out.println("SHARSHEMBI: " + DayOfWeek.SHARSHEMBI.getName());
                    break;
                case "BEISHENBI":
                    System.out.println("BEISHENBI: " + DayOfWeek.BEISHENBI.getName());
                    break;
                case "JUMA":
                    System.out.println("JUMA: " + DayOfWeek.JUMA.getName());
                    break;
                case "ISHEMBI":
                    System.out.println("ISHEMBI: " + DayOfWeek.ISHEMBI.getName());
                    break;
                case "JEKSHEMBI":
                    System.out.println("JEKSHEMBI: " + DayOfWeek.JEKSHEMBI.getName());
                    break;
                default:
                    System.out.println("Мындай кун жок");
            }
        }

    }
}
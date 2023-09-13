import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a){
            case "monday":
                System.out.println(nedelya.MONDAY);
            break;
            case "tuesday":
                System.out.println(nedelya.TUESDAY);
                break;
            case "wednesday":
                System.out.println(nedelya.WEDNESDAY);
                break;
            case "thursday":
                System.out.println(nedelya.THURSDAY);
                break;
            case "friday":
                System.out.println(nedelya.FRIDAY);
                break;
            case "saturday":
                System.out.println(nedelya.SATURDAY);
                break;
            case "sunday":
                System.out.println(nedelya.SUNDAY);
                break;
            default:
        }
    }
}
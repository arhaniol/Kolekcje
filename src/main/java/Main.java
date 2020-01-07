import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1:");
        task1();
        System.out.println("Task2:");
        task2();
    }

    private static void task2() {
        Scanner input = new Scanner(System.in);
        String line;
        int pos;
        List<String> firstName = new ArrayList<String>();
        List<String> secondName = new ArrayList<String>();
        boolean theMinus;

        do {
            System.out.print("Wprwadz imiona oddzielone spacją lub tabulatorem albo \"-\" aby zakończyć wprowadzanie: ");
            line = input.nextLine();
            theMinus = line.equals("-");
            if (!theMinus) {
                pos = line.indexOf('\t');
                if (pos < 2) {
                    pos = line.indexOf(' ');
                    if (pos < 2) {
                        continue;
                    }
                }
                System.out.println("1. " + line.substring(0, pos) + " 2. " + line.substring(pos + 1));
                firstName.add(line.substring(0, pos));
                secondName.add(line.substring(pos + 1));
            }
        } while (!theMinus);
        System.out.print("Podaj imię: ");
        line = input.next();
        pos = firstName.indexOf(line);
        if (pos < 0) {
            pos = secondName.indexOf(line);
            if (pos < 0) {
                System.out.println("Nie znaleziono pary do tego imienia!");
            } else {
                System.out.println("Jego para to: " + firstName.get(pos));
            }
        } else {
            System.out.println("Jego para to: " + secondName.get(pos));
        }
    }

    private static void task1() {
        Scanner input = new Scanner(System.in);
        String name;
        Set<String> names = new HashSet<String>();
        int cout = 0;
        boolean theMinus;
        do {
            System.out.print("Wprwadz imię lub \"-\" aby zakończyć wprowadzanie: ");
            name = input.nextLine();
            theMinus = name.equals("-");
            if (!theMinus) {
                cout++;
                names.add(name);
            }
        } while (!theMinus);
        System.out.println("Wprowadzono " + names.size() + " unikalnych imion z " + cout + " wprowadzonych.");
    }
}

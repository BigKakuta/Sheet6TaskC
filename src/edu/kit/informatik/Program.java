package edu.kit.informatik;

/**
 * @author Daniel Meyer
 * @version 1.0
 */
public class Program {
    public static void main(String[] args) {
        double delta = 0;
        if (args.length != 2) {
            Terminal.printLine("Error, invalid amount of command line arguments: " + args.length + ", 2 were expected");
            return;
        }
        try {
            delta = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            Terminal.printLine("Error, first command line argument wasn't an floating-point number");
        }
        if (delta < 0 || delta > 1) {
            Terminal.printLine("Error, given floating-point number is not between 0 and 1");
            return;
        }
        Terminal.printLine("Alles Klar, bis jetzt");
    }
}

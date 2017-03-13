package DummyExample;

public class Main {

    public static void main(String[] args) {
        Printer printer=new CanonPrinter(new Configuration("W15", "10.0.14.3", "ink", 150));
        printer.print();
    }
}

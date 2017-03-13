package DummyExample;

public class CanonPrinter implements Printer{

    private final String PRODUCER="CANON";
    private String model;
    private String ip;
    private String type;
    private Integer pageWeight;

    public CanonPrinter(Configuration configuration) {
        model = configuration.getModel();
        ip=configuration.getIp();
        type=configuration.getType();
        pageWeight=configuration.getPageWidth();
    }

    public String getPRODUCER() {
        return PRODUCER;
    }


    public void print() {
        throw new RuntimeException("Not implemented yet");
        //Tu byłaby wykożystana ta konfiguracja
    }
}

package DummyExample;


public class Configuration {

    private String model;
    private String ip;
    private String type;
    private Integer pageWidth;

    public Configuration(String model, String ip, String type, Integer pageWidth) {
        this.model = model;
        this.ip = ip;
        this.type = type;
        this.pageWidth = pageWidth;
    }

    public String getModel() {
        return model;
    }

    public String getIp() {
        return ip;
    }

    public String getType() {
        return type;
    }

    public Integer getPageWidth() {
        return pageWidth;
    }
}

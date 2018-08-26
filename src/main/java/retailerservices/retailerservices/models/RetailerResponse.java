package retailerservices.retailerservices.models;

public class RetailerResponse {
    private String message;
    private long Id;
    private String Name;
    private String Type;
    private String GstIn;

    public String getGstIn() {
        return GstIn;
    }

    public void setGstIn(String gstIn) {
        GstIn = gstIn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

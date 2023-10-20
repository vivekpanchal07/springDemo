package AutoWireAnnotationWithXML;

public class AutoWireAnnotationWithXML {
    private int id, pincode;
    private String name, contact;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AutoWireAnnotationWithXML{" +
                "id=" + id +
                ", pincode=" + pincode +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

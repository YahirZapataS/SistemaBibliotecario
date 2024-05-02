public class User {
    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String id;

    
    public User(String name, String lastName, String address, String phone, String id) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    
}

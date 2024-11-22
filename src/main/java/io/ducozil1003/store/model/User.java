package io.ducozil1003.store.model;

public class User {
    private long id;
    private String fullName;
    private String password;
    private String email;
    private String phone;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setIdId(long id){
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public long getIdId() {
        return id;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email +", password=" + password +", fullName=" + fullName + ", address=" + address + ", phone=" + phone + "]";
    }
}

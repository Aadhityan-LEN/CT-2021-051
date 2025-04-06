class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "";
    }
    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}

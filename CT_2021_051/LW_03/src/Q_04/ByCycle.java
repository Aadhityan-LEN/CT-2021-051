class Bicycle {
    // Data Member
    private Owner owner;

    // Constructor: Initializes with default owner
    public Bicycle() {
        this.owner = new Owner();
    }

    // Constructor: Initializes with specific owner details
    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    // Returns the name of this bicycle's owner
    public String getOwnerName() {
        return owner.getOwnerName();
    }

    // Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    // Assigns the phone number of this bicycle's owner
    public void setPhoneNo(String num) {
        owner.setPhoneNo(num);
    }

    // Additional methods to get/set the entire Owner object if needed
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
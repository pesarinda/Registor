public class student {
    String name;
    String school;
    String registrationStatus;
    String examCentre;
    static {
        System.out.println("[Student static block] Student class loaded (runs once)");
    }
    {
        System.out.println("[Student instance block] Setting default values...");
        registrationStatus = "Pending";
        examCentre = "Not assigned";
    }
    student(String name, String school) {
        System.out.println("[Student constructor] Registering " + name + "...");
        this.name = name;
        this.school = school;
    }

    void display() {
        System.out.println("   Name: " + name + "  School: " + school
                + "  Status: " + registrationStatus
                + "  Centre: " + examCentre
                + "  Fee: " + uneb.registrationFee);
    }

}

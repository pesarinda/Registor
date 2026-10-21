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

}

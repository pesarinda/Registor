public class uneb {
    static int examYear;
    static int registrationFee;
    String name;
    String registrationStatus;
    String examCentre;

    static {
        System.out.println("[Static block] Loading exam settings...");
        examYear = 2026;
        registrationFee = 50000;
    }

    {
        System.out.println("[Instance block] Setting default values...");
        registrationStatus = "Pending";
        examCentre = "Not assigned";
    }

    public uneb(String name) {
        System.out.println("[Constructor] Registering " + name + "...");
        this.name = name;
    }

    public void show() {
        System.out.println("Name:   " + name + "  Year: " + examYear + "  Fee: " + registrationFee
                + " Status: " + registrationStatus + "  Centre: " + examCentre);
    }

}

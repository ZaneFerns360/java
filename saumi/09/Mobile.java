class Device {
    String vendorName;
    int ramSize;
    String OSversion;

    public Device(String vendorName, int ramSize, String OSversion) {
        this.vendorName = vendorName;
        this.ramSize = ramSize;
        this.OSversion = OSversion;
    }
}

interface Loader {
    void loadOS();
}

class Mobile extends Device implements Loader {
    Mobile(String vendorName, int ramSize, String OSversion) {
        super(vendorName, ramSize, OSversion);
    }

    public void loadOS() {
        System.out.println("Device Details:");
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("OS Version: " + OSversion);
    }
}

class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Google", 8, "Android 14");
        mobile.loadOS();
    }
}

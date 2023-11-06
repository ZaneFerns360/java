interface Loader {
    void loadOS(String str);
}

class Device implements Loader {
    @Override
    public void loadOS(String str) {
        System.out.println("Your OS version is: " + str);
    }
}

public class Mobile extends Device {
    public Mobile() {
        super.loadOS("Android");
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.loadOS("iOS");
    }
}


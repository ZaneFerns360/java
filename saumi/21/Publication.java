import java.util.Scanner;

class Publication {
    private String title;
    private float price;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title: ");
        title = scanner.nextLine();
        System.out.print("Enter the price: Rs. ");
        price = scanner.nextFloat();
    }

    public void putData() {
        System.out.println("Title: " + title);
        System.out.println("Price: Rs. " + price);
    }
}

class Book extends Publication {
    private int pageCount;

    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the page count: ");
        pageCount = scanner.nextInt();
    }

    public void putData() {
        super.putData();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication {
    private float playingTime;

    public void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the playing time (in minutes): ");
        playingTime = scanner.nextFloat();
    }

    public void putData() {
        super.putData();
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
}

class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Tape tape = new Tape();

        System.out.println("Enter book details:");
        book.getData();
        System.out.println("\nEnter tape details:");
        tape.getData();

        System.out.println("\nBook Details:");
        book.putData();
        System.out.println("\nTape Details:");
        tape.putData();
    }
}

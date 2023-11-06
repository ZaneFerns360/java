import java.util.Scanner;

class Publication {
    String title;
    float price;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title:");
        title = sc.nextLine();
        System.out.println("Enter price:");
        price = sc.nextFloat();
    }

    void putData() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Book extends Publication {
    int pageCount;

    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter page count:");
        pageCount = sc.nextInt();
    }

    void putData() {
        super.putData();
        System.out.println("Page count: " + pageCount);
    }
}

class Tape extends Publication {
    float playTime;

    void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter play time:");
        playTime = sc.nextFloat();
    }

    void putData() {
        super.putData();
        System.out.println("Play time: " + playTime);
    }
}

public class Book {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Enter book details:");
        book.getData();
        System.out.println("Book details:");
        book.putData();

        Tape tape = new Tape();
        System.out.println("Enter tape details:");
        tape.getData();
        System.out.println("Tape details:");
        tape.putData();
    }
}


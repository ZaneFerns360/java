class Student {
    int internal;
    int external;

    public static void input(int in, int ex) throws LessMarks {
        if(in > 40){
            throw new LessMarks("You have more internal marks than allowed");
        }
        else if(ex > 60){
            throw new LessMarks("You have more external marks than allowed");
        }
        else{
            System.out.println("Your total Marks: " + (in + ex));
        }
    }
}

class LessMarks extends Exception {
    public LessMarks(String message) {
        super(message);
    }
}

public class marks {
    public static void main(String[] args) {
        try {
            Student.input(35, 55);
        } catch (LessMarks e) {
            System.out.println(e.getMessage());
        }
    }
}


import Utility.UtoL;
import Utility.Array;

public class Packages {
    public static void main(String[] args) {
        UtoL utoL = new UtoL();
        System.out.println(utoL.toLowerCase("HELLO"));

        Array array = new Array();
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(array.isSymmetric(arr));
    }
}

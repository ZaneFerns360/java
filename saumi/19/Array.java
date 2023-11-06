package Utility;
import java.util.*;
public class Array
{
    public static boolean Symmetry(int a[])
    {
        int i=0,j=a.length-1;
        for(;i<a.length/2;i++,j--)
        {
            if(a[i]!=a[j])
            {
                return false;
            }
        }
        return true;
    }
}
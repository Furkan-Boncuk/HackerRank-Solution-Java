import java.io.*;
import java.util.*;

class Print{
    public static <T1,T2> void printArray(T1[] array1, T2[] array2){
        for(T1 ride : array1){
            System.out.println(ride);
        }
        for(T2 ride : array2){
            System.out.println(ride);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"Hello","World"};
        Print print = new Print();
        print.printArray(a,b);
    }
}

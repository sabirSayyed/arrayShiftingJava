package com.nesCorp.chatApp;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.*;

public class Main {

    private static int[] solveLeft(int n, int[] array, int p, int[] result, int temp) {
        for (int i = p; i < n; i++) {
            result[temp] = array[i];
            temp++;
        }
        for (int i = 0; i < p; i++) {
            result[temp] = array[i];
            temp = temp +1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        return result;
    }




    private static void reverse(int array[], int length)
    {
        int[] reverse = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            reverse[j - 1] = array[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < length; k++) {
            System.out.println(reverse[k]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of  the array :");
        int n = input.nextInt();
        System.out.println("Enter the values of  the array :");
        int array[] = new int[n];
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter The Position :");
        int p = input.nextInt();
        int d = 0;
        System.out.println("Enter the value of D - MUST BE 0 || 1 :");
        d = input.nextInt();

        int result[] = new int[n];
        int temp = 0;
        if(d==0){
            solveLeft(n, array, p, result, temp);
        }
        else{
            reverse(solveLeft(n,array, p,result,temp),n);
        }

    }


}

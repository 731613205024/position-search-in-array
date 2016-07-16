/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=s.nextInt();
        }
        int c=s.nextInt();
         for(int i=0;i<n;i++)
        {
            if(b[i]==c)
            {
                System.out.println("number in the position:"+i);
                flag=1;
                break;
            }
        }
       if(flag==0)
            System.out.println("number is not present in array");
        
    }
}

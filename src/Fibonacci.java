/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chri8160
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The 12th Fibonacci number is " + Fib(12));
    }
    
    public static int Fib(int n){
        if(n<=2) return 1;
        else
            return Fib(n-1) + Fib(n-2);
    }
    public static int Fib2(int n){
        if(n<=2) return 1;
        int n1=1, n2=1, counter=3;
        while(true){
            int fibnum = n1+n2;
            counter++;
            if(counter==n) return fibnum;
            n1=n2;
            n2=fibnum;
            
        }
    }
}

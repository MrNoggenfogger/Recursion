/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chri8160
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Fact(7);
        System.out.println("7! = " + x);
    }
    
    public static int Fact(int n){
        if(n==1||n==0)
            return 1;
        else{
            System.out.println("Calling Factorial for number " + (n-1));
            return n*Fact(n-1);
        }
    }
}

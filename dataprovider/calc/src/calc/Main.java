/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calc;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here

        MyMath my = new MyMath();
        System.out.println("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        double  x1 = sc.nextDouble();
        System.out.println("Операция: +, -, *, / ");
        String  op = sc.next();
        System.out.println("Введите второе число: ");
        double  x2 = sc.nextDouble();
        my.Init(x1, x2);
        sc.close();
        try{
        if(op.contentEquals("*")){
            System.out.print(my.multiply());
        }
        else  if(op.contentEquals("/")){
            System.out.print(my.div());
        }
        else if(op.contentEquals("+")){
            System.out.print(my.plus());
        }
        else  if(op.contentEquals("-")){
            System.out.print(my.minus());
        }
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        
    }

}

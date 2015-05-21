package calc;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MyMath extends ArithmeticException {
 public double x1 = 0;
 public double x2 = 0;

 public void Init(double x1, double x2){
     this.x1 = x1;
     this.x2 = x2;
 }
public double minus(){
    return x1-x2;
}
public double multiply(){
    return x1*x2;
}
public double div(){
    if(x2==0) throw new ArithmeticException("infinity");
    return x1/x2;
}
public double plus(){
    return x1+x2;
}
}
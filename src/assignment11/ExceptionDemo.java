/* here we are showing the exception which occurs when we try to implement multiple methods */
package assignment11; //here it is the package assignment11

public class ExceptionDemo { //here i have taken the class as ExceptionDemo
 
	public static void main(String[]args){    //here it the main method
		
             void  doSomething(){       //in the main method i have taken another method doSomething
            	 
            	 int firstNum =12,secondNum = 20;    //which prints something in it
            	 int sum = firstNum + secondNum;
            	            System.out.println("sum :"+sum);
             
            	   void doMore(){           //in this method i try to take one more method doMore
            		   
            		   int dividend =20,divisor = 0;                //in this I'm showing dividing the integer number with zero
            		   int divide = dividend /divisor;
            		   System.out.println("the output is :" +divide); //now it shows an error in the line 8 which is e
            		   
            	   }
             }
               
	}

}

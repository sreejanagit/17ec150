import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        String str="";
        
        int array[] = new int [20];
        
        int x;
        int y;
        int len =0;     
        for (int i = 0; i <= 100; i++) {
            
            if (i>9){
                x=i%10;
                y=i/10;
                if(y> 9){
                x=y%10;
                y=y/10;
                }
                if(x==1){
                    len++;
                }
                if (y==1){
                    len++;
                }
            }
            if(i==1){
                len++;
            }
        }
     
         System.out.println("Totol no of  one'sin 100 is : "+len);
     }
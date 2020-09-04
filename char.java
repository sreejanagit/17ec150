import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        String str="";
        
        int len = 0;
        Scanner in = new Scanner(System.in);
        
        str = "hello everyone";
        System.out.println(str);
        char[] ch = new char[str.length()]; 
  
        for (int i = 0; i < str.length(); i++) { 
            if (str.charAt(i) != ' ' ){
            ch[i] = str.charAt(i);
            len++;
                
            }
        }
     
         System.out.println("Totol no of  string length is : "+len);
     }
     
}
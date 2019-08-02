package encryption;

import java.util.Arrays;
import java.util.Scanner;


public class Encryption {

   public static String doEncryption(String plainText,String Key)
   {
       String ch="";
       
       String array[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       int add,mod;
       char p1,k1;
       for(int i=0;i<plainText.length();i++)
       {
           for(int j=i;j<=i;j++)
           { 
              p1=plainText.charAt(i);
              k1=Key.charAt(j);
              int a= (int)p1;
              a=a-65;
             
              int b=(int)k1;
              b=b-65;
             
              add=a+b;
             
              mod= add % 25;
           
              for(int k=0; k<array.length; k++)
            {
                if(k==mod)
                {
                 System.out.println("cipher text after encrypted");
                 System.out.println(array[k]);
                 ch=ch+""+array[k];
                 }
            }   
           }      
       }     
             return ch;    
        }
    public static String doDecryption(String ch,String Key)
   {
     
       String c="";
      String array1[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      int sub,mod1 = 0;
      char p1,k1;
       for(int i=0;i<ch.length();i++)
       {
           for(int j=i;j<=i;j++)
           {
               p1=ch.charAt(i);
            
              k1=Key.charAt(j);
              int a= (int)p1;
              a=a-65;
            
              int b=(int)k1;
               b=b-65;
              
               sub=a-b;
               if(sub<0)
               {
                 mod1=sub+25;
              
               }
               else
               {
              mod1= sub % 25;
             
               }
              
              for(int k=0; k<array1.length; k++)
            {
                if(k==mod1)
                {
                   
                  System.out.println("Decrypted letter");
                  System.out.println(array1[k]);
                  c=c+""+array1[k];
                  
                }     
            }
           }
   }
       
   return c;    
        
  }
    public static void main(String[] args) {
        String Key,plainText;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter yout text");
        plainText=sc.next();
        System.out.println("enter your key");
        Key=sc.next(); 
        System.out.println(Encryption.doEncryption(plainText,Key));
        System.out.println("ENTER YOUR CIPHER TEXT");
        String ch=sc.next();
        System.out.println("ENTER YOUR KEY ");
        Key=sc.next();
        System.out.println(Encryption.doDecryption(ch,Key));
    }
}

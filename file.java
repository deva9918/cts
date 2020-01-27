package com;
import java.io.FileOutputStream;
import java.util.*;
public class file { 
//public class FileOutputStreamExample {  
    public static void main(String args[]){    
          /* try{    
        	  
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}*/
           try{    
               FileOutputStream fout=new FileOutputStream("E:\\p3.txt");    
              // String s="Welcome to javaTpoint.";  
               Scanner p=new Scanner(System.in);
               String s=p.nextLine();
               byte b[]=s.getBytes();//converting string into byte array    
               fout.write(b);    
               fout.close();    
               System.out.println("success...");    
              }catch(Exception e){System.out.println(e);}    

      }    
}  
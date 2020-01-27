package com;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.lang.String;
public class file2 {
	public static void main(String args[]){    
         try{    
        	 int count=0;
        	 BufferedReader br = new BufferedReader(new FileReader("E:\\p3.txt"));
        	    StringBuilder sb = new StringBuilder();

        	    String line = br.readLine();
        	   // System.out.println(br);
        	    while (line != null) {
        	      sb.append(line).append("\n");
        	      count++;
        	      line = br.readLine();
        	    }

        	    String fileAsString = sb.toString();
        	    String words[]=fileAsString.split("\\s+");
        	    System.out.println("strings"+words.length);
        	    System.out.println("length="+count);
  System.out.println(fileAsString);
             /*  byte b[]=s.getBytes();//converting string into byte array    
               fout.write(b);    
               fout.close();   */     
           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}

}
}

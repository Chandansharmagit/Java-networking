package io;
import java.io.InputStream;
import java.net.*;
public class url2 {
    public static void main(String[] args) {
       try {

        URL u = new URL("https://www.w3schools.com/");

        URLConnection newuConnection = u.openConnection();

        InputStream is = newuConnection.getInputStream();

        int i ;

        while ((i = is.read()) != -1) {
            System.out.print((char)i);
        }

        
        
       } catch (Exception e) {
       System.out.println(e);
       } 
    }
}

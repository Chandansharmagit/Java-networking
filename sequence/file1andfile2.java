package sequence;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class file1andfile2 {
    public static void main(String[] args) {
        try {
        FileInputStream s = new FileInputStream("D:\\sendmssage\\client.java");

        FileInputStream m = new FileInputStream("D:\\sendmssage\\server.java");

        FileInputStream a = new FileInputStream("D:\\sendmssage\\hello.java");

        FileInputStream b = new FileInputStream("D:\\sendmssage\\mai.java");

        

        //using the sequncce type

        //making the vector

        Vector v = new Vector();

        v.add(s);
        v.add(m);
        v.add(a);
        v.add(b);

        //creating the enumerations by calling the elements method

        Enumeration e = v.elements();

        //making the sequemce

        SequenceInputStream h = new SequenceInputStream(e);



        int j;

        while ((j = h.read()) != -1) {
            System.out.print((char)j);
            Thread.sleep(10);
        }

        h.close();
        


       
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}



import java.io.DataInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args)throws Exception {

        try {
           ServerSocket ss = new ServerSocket(9999);
           Socket s = ss.accept();

           DataInputStream din = new DataInputStream(s.getInputStream());
           String str = din.readUTF();
           System.out.println(str);
            

        } catch (Exception e) {
            System.out.println(e);
        }
        


    }

}

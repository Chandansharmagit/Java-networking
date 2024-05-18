

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args)throws IOException {
        try {

            String str = "localhost";
            Socket s = new Socket(str,9999);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("chandan sharma chandan sharma classs 12 ");
            dout.flush();

            s.close();
            
        } catch (Exception e) {
           System.out.println(e);
        }
    }//this web token data are called the valid of the into the form of the cyclone in the universe 
    
}

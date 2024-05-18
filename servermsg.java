
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class servermsg {
    public static void main(String[] args) throws IOException {

        String makes = "";
        try {

            JFrame newFrame = new JFrame();

            // making the text area with the name and the data fie into the class and the
            // method

            JTextArea newtArea = new JTextArea();

            JTextField f = new JTextField();

            // setting the buttton with the clickable moment

            JButton newbButton = new JButton();
            newbButton.setBounds(350, 280, 200, 40);
            newbButton.setText("send");
            f.setBounds(30, 280, 300, 40);

            newtArea.setSize(300, 300);

            newtArea.setBounds(30, 100, 520, 150);

            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFrame.setTitle("server massage...");

            newFrame.setSize(500, 500);

            newFrame.setVisible(true);
            newFrame.setLayout(null);
            newFrame.add(newtArea);
            newFrame.add(f);
            newFrame.add(newbButton);

            // making the connection with the server

            ServerSocket ss = new ServerSocket(1201);
            Socket s = ss.accept();

            // reading the file

            DataInputStream din = new DataInputStream(s.getInputStream());
            // writing the data
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            // making the action listner to send the massage

            newbButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent a) {
                    try {
                        String sts = "";
                        sts = f.getText().trim();
                        dout.writeUTF(sts);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            });

            //making the while condition

            while (!makes.equals("exit")) {
                makes = din.readUTF().trim();
                newtArea.setText(newtArea.getText() +"\n client : " + makes);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.awt.event.ActionEvent;

import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class clientmsg {
    public static void main(String[] args) throws IOException {

        String masgin = "";
        try {

            // making the framrwork

            JFrame newFrame = new JFrame();

            // making the text area with the name and the data fie into the class and the
            // method

            JTextArea newtArea = new JTextArea();

            JTextField f = new JTextField();
           

            // setting the buttton with the clickable moment

            JButton newbButton = new JButton();
            newbButton.setBounds(350, 280, 200, 40);

            f.setBounds(30, 280, 300, 40);
            newbButton.setText("send");
            newtArea.setSize(300, 300);

            newtArea.setBounds(30, 100, 520, 150);

            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFrame.setTitle("client massage...");

            newFrame.setSize(500, 500);

            newFrame.setVisible(true);
            newFrame.setLayout(null);
            newFrame.add(newtArea);
            newFrame.add(f);
            newFrame.add(newbButton);

            // and making the connection with socket to get connection with the other sercer
            // that connected with the main data in the file

            String str = "localhost";

            Socket s = new Socket(str, 1201);// that ip address the linked with the another server that

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            // making the action listener while clicling the button

            newbButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ee) {
                    try {
                        String masout = "";
                        masout = f.getText().trim();
                        dout.writeUTF(masout);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            });

            // making the while condition

            while (!masgin.equals("exit")) {
                masgin = din.readUTF();
                newtArea.setText(newtArea.getText().trim() + "\n server: " + masgin);

            }

            // making the action liestener

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

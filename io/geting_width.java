package io;

import java.awt.*;
import java.awt.event.*;  

public class geting_width {
    public static void main(String[] args) {
        try {

            // Toolkit t = Toolkit.getDefaultToolkit();

            // System.out.println(t.getScreenResolution());

            // Dimension d = t.getScreenSize();
            // System.out.println(d.getWidth());
            // System.out.println(d.getHeight());

            Frame f = new Frame("ToolkitExample");
            Button b = new Button("beep");
            b.setBounds(50, 100, 60, 30);
            f.add(b);
            f.setSize(300, 300);
            f.setLayout(null);
            f.setVisible(true);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Toolkit.getDefaultToolkit().beep();
                }
            });

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

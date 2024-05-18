package io;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.*;

import javax.swing.JFrame;

class mouselistenre implements MouseListener {
    public static void main(String[] args) {
        try {

            Frame f = new Frame();

            f.setTitle("title");
           // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(500, 500);

            f.setLayout(null);
            f.setVisible(true);

            @Override
            public void mousePressed(MouseEvent e){
                
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
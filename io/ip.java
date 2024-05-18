package io;

import java.net.InetAddress;

public class ip {
    public static void main(String[] args) {
        try {

            //finding the ip addresss of the any host name

            InetAddress ip = InetAddress.getByName("https://www.google.com/");
           System.out.println(ip.getHostAddress());
           System.out.println(ip.getAddress());
           System.out.println(ip.getLocalHost());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

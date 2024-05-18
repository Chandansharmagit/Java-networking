package io;

import java.net.URI;
import java.net.URL;

class url {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.w3schools.com/java-tutorial");

            System.out.println(u.getHost());
            System.out.println(u.getPort());
            System.out.println(u.getFile());
            System.out.println(u.getProtocol());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
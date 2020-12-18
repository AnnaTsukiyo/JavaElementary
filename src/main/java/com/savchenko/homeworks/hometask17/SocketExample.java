package com.savchenko.homeworks.hometask17;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Using a Socket get users from the website https://jsonplaceholder.typicode.com
 * Create a validator object to make sure that the parentheses in "[] {}" are valid.
 * Write Happy and notHappy tests for the validator
 **/

public class SocketExample {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("jsonplaceholder.typicode.com", 80);
        socket.setSoLinger(true, 0);
        final OutputStream outputStream = socket.getOutputStream();
        socket.getKeepAlive();

        InputStream inputStream = socket.getInputStream();
        String s = "GET /users HTTP/1.1\n" +
                "Host: jsonplaceholder.typicode.com\n" +
                "\n" +
                "\n";

        outputStream.write(s.getBytes());
        int ch;
        outputStream.write(s.getBytes());

        while ((ch = inputStream.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
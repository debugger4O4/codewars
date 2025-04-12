// https://www.codewars.com/kata/639107e0df52b9cb82720575/train/java

package kyu_7.simple_socket_client.java;

import java.io.*;
import java.net.*;

public class Solution {
    public static boolean isRegularServer() {
        String packet = "Hello", host = "localhost";
        int port = 1111, timeout = 1000;
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), timeout);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            writer.println(packet);
            return packet.equals(reader.readLine());
        } catch (IOException e) {
            return false;
        }
    }
}

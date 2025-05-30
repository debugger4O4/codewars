package kyu_7.simple_socket_client.java;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        for (boolean expected : new boolean[]{true, false, true, false, false, true, true, true, true, false}) {
            Thread server = new Thread(createServer(expected));
            AtomicBoolean actual = new AtomicBoolean();
            Thread client = new Thread(() -> actual.set(Solution.isRegularServer()));
            server.start();
            client.start();
            try {
                server.join();
                client.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            assertEquals(expected, actual.get());
        }
    }

    private static Runnable createServer(boolean isRegular) {
        return () -> {
            try (ServerSocket server = new ServerSocket(1111)) {
                Socket socket = server.accept();
                byte[] buffer = new byte[1024];
                int length = socket.getInputStream().read(buffer);
                OutputStream outputStream = socket.getOutputStream();
                StringBuilder response = new StringBuilder(new String(buffer, 0, length));
                outputStream.write((isRegular ? response : response.reverse()).toString().getBytes());
                outputStream.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}


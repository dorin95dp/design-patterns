import com.structural.proxy.SocketInterface;
import com.structural.proxy.SocketProxy;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ProxyTest {
    private SocketInterface server;

    @Test
    public void testProxy() {
        new Thread(() -> server = new SocketProxy("127.0.0.1", 8080, true)).start();

        SocketInterface client = new SocketProxy("127.0.0.1", 8080, false);

        String messageFromServer = "jora";
        server.writeLine(messageFromServer);

        String messageAtClient = client.readLine();

        assertNotNull(messageAtClient);
        assertEquals(messageAtClient, messageFromServer);

        client.dispose();
        server.dispose();
    }
}

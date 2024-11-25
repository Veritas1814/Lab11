package ucu.edu;
import ucu.edu.task3.Image;
import ucu.edu.task3.ProxyImage;
import ucu.edu.task3.RealImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {
    @Test
    void testLazyLoading() {
        Image proxyImage = new ProxyImage("test.jpg");

        // No loading should happen initially
        assertFalse(proxyImage instanceof RealImage);

        // Trigger loading by calling display
        proxyImage.display();
        assertTrue(proxyImage instanceof ProxyImage);
    }

    @Test
    void testDisplay() {
        Image proxyImage = new ProxyImage("image.jpg");

        proxyImage.display();
        proxyImage.display();

    }
}

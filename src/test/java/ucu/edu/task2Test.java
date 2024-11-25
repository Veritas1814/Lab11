package ucu.edu;
import ucu.edu.task2.Client;
import ucu.edu.task2.MailInfo;
import ucu.edu.task2.BirthdayMailCode;
import ucu.edu.task2.MailSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class task2Test {
    @Test
    public void testMailInfo() {
        Client client = Client.builder()
                .name("Test User")
                .email("test@user.com")
                .age(25)
                .build();

        MailInfo mailInfo = new MailInfo(client, c -> "Happy Birthday!");

        assertEquals(client, mailInfo.getClient());
        assertEquals("Happy Birthday!", mailInfo.generate());
    }

    @Test
    public void testMailSender() {
        Client client = Client.builder()
                .name("Test User")
                .email("test@user.com")
                .age(25)
                .build();

        MailInfo mailInfo = new MailInfo(client, c -> "Test email content");
        MailSender mailSender = new MailSender();

        assertDoesNotThrow(() -> mailSender.sendMail(mailInfo));
    }

    @Test
    public void testBirthdayMailCode() {
        Client client = Client.builder()
                .name("Alice")
                .email("alice@example.com")
                .age(30)
                .build();

        BirthdayMailCode birthdayMailCode = new BirthdayMailCode();
        assertEquals("Dear Alice! Happy 30 birthday!", birthdayMailCode.generate(client));
    }
}

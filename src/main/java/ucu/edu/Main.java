package ucu.edu;

import ucu.edu.task2.BirthdayMailCode;
import ucu.edu.task2.Client;
import ucu.edu.task2.MailInfo;
import ucu.edu.task2.MailSender;
import ucu.edu.task2.MailCode;

public class Main {
    public static void main(String[] args) {
        

        Client client = Client.builder()
            .name("Client Name")
            .age(100)
            .email("test@client.mail")
            .build();

        MailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, client1 ->"It is juct random mail!");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}

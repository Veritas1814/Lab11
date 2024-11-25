package ucu.edu.task2;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Sending email to " + mailInfo.getClient().getName() + " with mail code: " + mailInfo.getMailCode());
    }
}
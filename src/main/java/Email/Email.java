package Email;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {
    private final String username = "mail@gmail.com";
    private final String password = "password";
    private final String host = "krfnz.gmail.com";
    private final String port = "587";

    public void sendErrorEmail(String subject, String messageBody) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mail@gmail.com"));
            message.setSubject(subject);
            message.setText(messageBody);

            Transport.send(message);
            System.out.println("Пошта не існує");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}


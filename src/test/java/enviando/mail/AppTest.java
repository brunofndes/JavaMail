package enviando.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AppTest {
	private String userName = "contatoveritasdev@gmail.com";
	private String senha = "hlhv ngyr mcax rycp ";
	
	@org.junit.Test
	public void testeEmail(){

	
		
		try {
			
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "true");/*Autorização*/
			properties.put("mail.smtp.starttls", "true");/*Autenticação*/
			properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail*/
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					
					return new PasswordAuthentication(userName, senha);
				}
			});
			
			Address[] toUser = InternetAddress.parse("brunof900@gmail.com, contatoveritasdev@gmail.com");
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName));
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Segundo email ");
			message.setText("comprovação do teste agora");
			
			Transport.send(message);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

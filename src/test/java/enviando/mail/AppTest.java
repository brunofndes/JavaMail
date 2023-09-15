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

import enviando.email.ObjetoEnviaEmail;

public class AppTest {
		
	@org.junit.Test
	public void testeEmail() throws Exception{	
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("brunof900@gmail.com",
															"Bruno Fernandes",
															"Email Refatorado",
															"Corpo do email refatorado");
		
		enviaEmail.enviarEmail();
		
		
	}
}

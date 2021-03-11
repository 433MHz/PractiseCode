package pl.krystian;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailApi {

	SendMail mail;

	@Autowired
	public MailApi(SendMail sendMail) {
		this.mail = sendMail;
	}
	
	@PostMapping("/send")
	public boolean send(@RequestBody MailFrame mailFrame) throws MessagingException {
		
		mail.sendMail(mailFrame.getTo(), mailFrame.getTitle(), mailFrame.getText(), mailFrame.isHttpActive());
		return true;
	}
}

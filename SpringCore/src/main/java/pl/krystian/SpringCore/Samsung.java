package pl.krystian.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Samsung implements Phone {

	String phoneName = "Samsung";
	
	@Autowired
	MobileCPU cpu;
	
	public String getPhone() {
		return phoneName + " is my name and i have " + cpu.getProcessor() + " processor";
	}

}

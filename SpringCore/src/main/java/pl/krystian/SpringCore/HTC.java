package pl.krystian.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HTC implements Phone{

	private String phoneName = "HTC";
	
	@Autowired
	MobileCPU cpu;
	
	public String getPhone() {
		return phoneName + " is my name and i have " + cpu.getProcessor() + " cpu";
	}

}

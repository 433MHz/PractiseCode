package pl.krystian.SpringCore;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileCPU {

	private String cpuName = "Snapdragon";
	
	public String getProcessor() {
		return cpuName;
	}

}

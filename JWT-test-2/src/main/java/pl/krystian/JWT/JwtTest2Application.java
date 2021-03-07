package pl.krystian.JWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(JwtTest2Application.class, args);
	}

	
	@Bean
	FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new ApiFilter());
		filterRegistrationBean.addUrlPatterns("/getInfo/*");
		return filterRegistrationBean;
	}
}

package ie.atu.week3_recap_partb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@SpringBootApplication
public class Week3RecapPartbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3RecapPartbApplication.class, args);
	}

}

package pl.com.mnemonic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServerApplication {
    public static void main(String[] args) {
        // Will configure using accountsserver.yml
        //System.setProperty("spring.config.name", "account-microservice"); //?
        SpringApplication.run(AccountServerApplication.class, args);
    }
}

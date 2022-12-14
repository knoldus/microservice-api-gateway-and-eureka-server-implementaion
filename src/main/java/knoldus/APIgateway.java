package knoldus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The type Ap igateway.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class APIgateway {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(APIgateway.class, args);
    }

}

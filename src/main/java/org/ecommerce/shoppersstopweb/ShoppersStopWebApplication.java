package org.ecommerce.shoppersstopweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.ecommerce")
@EnableJpaRepositories("org.ecommerce.repository")
@EntityScan(basePackages = "org.ecommerce.model")
public class ShoppersStopWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppersStopWebApplication.class, args);
    }

}

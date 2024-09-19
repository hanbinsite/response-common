package site.hanbin.response.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationPropertiesScan(basePackages = { "site.hanbin.**" })
@EnableConfigurationProperties()
@SpringBootApplication
public class ResponseCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResponseCommonApplication.class, args);
    }

}

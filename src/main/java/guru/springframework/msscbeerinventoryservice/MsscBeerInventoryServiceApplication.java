package guru.springframework.msscbeerinventoryservice;

import net.bytebuddy.build.ToStringPlugin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication()
//@Configuration
//@ComponentScan(basePackages = {"guru.springframework.msscbeerinventoryservice","guru.springframework" })
public class MsscBeerInventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerInventoryServiceApplication.class, args);
    }

}

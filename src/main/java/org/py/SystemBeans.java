package org.py;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemBeans {
    @Bean
    public Login login() {
        return new Login();
    }
}

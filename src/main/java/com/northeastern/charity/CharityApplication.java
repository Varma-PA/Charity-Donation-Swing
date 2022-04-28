package com.northeastern.charity;

import com.northeastern.charity.gui.MainJForm;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class CharityApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CharityApplication.class, args);
        ConfigurableApplicationContext configurableApplicationContext = new SpringApplicationBuilder(CharityApplication.class).headless(false).run(args);
        EventQueue.invokeLater(() -> {
            MainJForm ex = configurableApplicationContext.getBean(MainJForm.class);
            ex.setVisible(true);
        });
    }

}

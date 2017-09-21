package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by che on 2017/9/21.
 */
@SpringBootApplication
public class App {

    private App() {
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

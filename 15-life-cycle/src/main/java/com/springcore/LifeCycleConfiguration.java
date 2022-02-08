package com.springcore;

import com.springcore.data.Connection;
import com.springcore.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // bean server
    // sebutkan nama method untuk initMethod dan destroyMethod
    // atau kita pilih menggunakan annotation di method start dan stop di class Server
//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}

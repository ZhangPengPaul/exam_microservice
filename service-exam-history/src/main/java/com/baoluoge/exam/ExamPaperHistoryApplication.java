package com.baoluoge.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by PaulZhang on 2016/10/25.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableCircuitBreaker
@MapperScan("com.baoluoge.exam.dao.*")
public class ExamPaperHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamPaperHistoryApplication.class, args);
    }
}

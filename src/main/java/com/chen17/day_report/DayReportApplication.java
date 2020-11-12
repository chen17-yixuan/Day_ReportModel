package com.chen17.day_report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Xuan Yi
 */

@SpringBootApplication(scanBasePackages = {"com.chen17.day_report"} ,exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.chen17.day_report.mapper")
public class DayReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayReportApplication.class, args);
    }

}

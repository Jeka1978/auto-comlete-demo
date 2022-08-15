package com.epam.jeka.autocomletedemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties(prefix = "db")
public class DbProps {
    private String dataSource1username;
    private String dataSource1password;
    private String dataSource2username;
    private String dataSource2password;
}

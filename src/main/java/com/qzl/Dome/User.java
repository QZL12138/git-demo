package com.qzl.Dome;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ConfigurationProperties("users")
public class User {
    private String name;
    private Integer age;
}

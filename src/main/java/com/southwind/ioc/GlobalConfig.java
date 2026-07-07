package com.southwind.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalConfig {
    @Value("8080")
    private int port;
    @Value("/")
    private String path;
    @Autowired//通过类型进行注入
    //@Qualifier 通过名字去找
    private DataConfig dataConfig;

}

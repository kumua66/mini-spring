package com.southwind.ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataConfig {
    private String url;
    private String driverName;
    private String username;
    private String password;
}

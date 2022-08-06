package com.CSE201;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    private String applicationName;

    private String description;

    private String organization;

    private String platforms;

    private String versions;

    private String externalStore;

    private Integer price;

    private String userName;
}
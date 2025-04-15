package com.ghs.cabco.ms.commons.domain.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company {
    private String identification;
    private String socialName;
    private String displayName;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private String mainAddress;
    private String phone;
    private String email;
    private String createdAt;
    private String isEnabled;
}

package com.arkson.keycloakdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
}

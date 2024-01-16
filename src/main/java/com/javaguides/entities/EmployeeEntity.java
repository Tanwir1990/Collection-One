package com.javaguides.entities;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEntity {

    private Long id;
    private String name;
    private String email;
}

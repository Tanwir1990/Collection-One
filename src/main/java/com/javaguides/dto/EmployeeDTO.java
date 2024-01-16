package com.javaguides.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmployeeDTO {

    private Long id;
    private String name;
    private String email;
}

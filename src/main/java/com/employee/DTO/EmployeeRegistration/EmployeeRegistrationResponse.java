package com.employee.DTO.EmployeeRegistration;

import com.employee.DTO.Navigation;
import lombok.*;

@Data
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegistrationResponse {
    private String userName;
    private String status;
    private Navigation navigation;
    private boolean isRegistrationSuccessful;
}

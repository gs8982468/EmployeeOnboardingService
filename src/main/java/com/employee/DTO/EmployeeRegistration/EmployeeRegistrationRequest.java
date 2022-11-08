package com.employee.DTO.EmployeeRegistration;

import lombok.*;

@Data
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegistrationRequest {
	private String firstName;
	private String lastName;
	private String emailId;
	private String countryCode;
	private String mobileNumber;
	private String offerCode;

}

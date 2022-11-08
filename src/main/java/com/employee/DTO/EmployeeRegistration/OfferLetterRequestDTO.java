package com.employee.DTO.EmployeeRegistration;

import lombok.*;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfferLetterRequestDTO {
	private String emailId;
	private String firstName;
	private String lastName;
	private String offeredGrade;
}

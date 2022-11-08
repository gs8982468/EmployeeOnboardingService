package com.employee.DTO.EmployeeRegistration;

import lombok.*;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OfferLetterResponseDTO {
	private String emailId;
	private String firstName;
	private String lastName;
	private String offeredGrade;
	private String offerCode;
	private boolean isOnboardingRegistrationCompleted;
	private String registrationDate;
	private String offerDate;
	private String offerExpirationDate;
	private int numberOfReminder;
	private String isMailSent;
}

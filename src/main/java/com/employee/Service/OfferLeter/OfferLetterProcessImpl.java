package com.employee.Service.OfferLeter;

import com.employee.DTO.EmployeeRegistration.OfferLetterRequestDTO;
import com.employee.DTO.EmployeeRegistration.OfferLetterResponseDTO;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Service
public class OfferLetterProcessImpl implements OfferLetterProcessIf{

    /**
     * this method is used send offer letter to the candidate
     * @param offerLetterRequestDTO to get all the offerletter related task
     * @return the data of processed offerletter
     */
    @Override
    public OfferLetterResponseDTO processOfferLetter(OfferLetterRequestDTO offerLetterRequestDTO) {
        String offerCode = UUID.randomUUID().toString();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String offerDate = dtf.format(now);
        Calendar c = Calendar.getInstance();
        Date currentDate = new Date();
//        dtf.format(currentDate);
        c.setTime(currentDate);
        c.add(Calendar.DATE, 7);
        Date currentDatePlusSeven = c.getTime();
        String offerExpireDate= dtf.format(currentDatePlusSeven.toInstant());
        OfferLetterResponseDTO offerLetterResponseInfo = OfferLetterResponseDTO.builder()
                .offerCode(offerCode)
                .offerDate(offerDate)
                .offerExpirationDate(offerExpireDate)
                .firstName(offerLetterRequestDTO.getFirstName())
                .lastName(offerLetterRequestDTO.getLastName())
                .isMailSent("No")
                .isOnboardingRegistrationCompleted(false)
                .numberOfReminder(0)
                .build();
        return offerLetterResponseInfo;
    }
}

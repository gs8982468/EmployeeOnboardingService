package com.employee.DTO;

import lombok.*;

@Data
@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Navigation {
  private String previoudPage;
  private String nextPage;
  private String moveToSpecialPage;
}

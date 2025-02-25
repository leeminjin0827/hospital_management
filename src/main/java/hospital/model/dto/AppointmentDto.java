package hospital.model.dto;

import lombok.*;

@Setter @Getter @ToString @Builder
@NoArgsConstructor @AllArgsConstructor
public class AppointmentDto {

    // 예약번호 PK
    private int appointmentid ;
    // 환자번호 FK
    private int patientid ;
    // 의사번호 FK
    private int doctorid ;
    // 예약일
    private String appointmentdate ;
    // 예약시간
    private String appointmenttime ;
    // 예약여부(취소여부)
    private int status;
    // 예약신청한날짜
    private String createdat;

} // c end

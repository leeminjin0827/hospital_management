package hospital.model.dto;

import lombok.*;

@Setter @Getter @ToString @Builder
@NoArgsConstructor @AllArgsConstructor
public class PatientDto {

    // 환자번호 PK
    private int patientid;
    // 환자이름
    private String name;
    // 환자생년월일
    private String birthdate;
    // 환자전화번호
    private String phone;
    // 환자주소
    private String address;
    // 환자입원일
    private String createdat;

}

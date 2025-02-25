package hospital.model.dto;

import lombok.*;

@Setter @Getter @ToString @Builder
@NoArgsConstructor @AllArgsConstructor
public class DoctorDto {

    // 의사번호 PK
    private int doctorid;
    // 의사이름
    private String name;
    // 담당과
    private String specialty;
    // 의사전화번호
    private String phone;
    // 의사입사일
    private String createdat;

} // c end

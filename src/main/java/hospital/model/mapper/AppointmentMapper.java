package hospital.model.mapper;

import hospital.model.dto.AppointmentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppointmentMapper {

    // 예약등록 SQL 매퍼
    boolean aWrite(AppointmentDto appointmentDto );

    // 예약 전체 조회 SQL 매퍼
    List<AppointmentDto> aList();

    // 환자별 예약 조회 SQL 매퍼
    List<AppointmentDto> aView1( int patientid );

    // 의사별 예약 조회 SQL 매퍼
    List<AppointmentDto> aView2( int doctorid );

    // 예약 수정 SQL 매퍼
    boolean aUpdate( AppointmentDto appointmentDto );

    // 예약 변경 SQL 매퍼
    boolean aChange( int appointmentid );

} // i end

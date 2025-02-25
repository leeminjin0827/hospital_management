package hospital.service;

import hospital.model.dto.AppointmentDto;
import hospital.model.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired private AppointmentMapper appointmentMapper;

    // 예약등록
    public boolean aWrite(AppointmentDto appointmentDto ){
        return appointmentMapper.aWrite( appointmentDto );
    } //f end

    // 예약전체조회
    public List<AppointmentDto> aList(){
        return appointmentMapper.aList();
    } // f end

    // 환자별 예약조회
    public List<AppointmentDto> aView1( int patientid ){
        return appointmentMapper.aView1( patientid );
    } // f end

    // 의사별 예약조회
    public List<AppointmentDto> aView2( int doctorid ){
        return appointmentMapper.aView2( doctorid );
    } // f end

    // 예약수정
    public boolean aUpdate( AppointmentDto appointmentDto ){
         return appointmentMapper.aUpdate( appointmentDto );
    } // f end

    // 예약변경
    public boolean aChange( int appointmentid ){
        return appointmentMapper.aChange( appointmentid );
    } // f end

} // c end

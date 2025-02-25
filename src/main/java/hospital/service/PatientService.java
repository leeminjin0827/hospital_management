package hospital.service;

import hospital.model.dto.PatientDto;
import hospital.model.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired private PatientMapper patientMapper;

    // 환자등록
    public boolean pWrite(PatientDto patientDto ){
        System.out.println("PatientService.pWrite");
        System.out.println("patientDto = " + patientDto);
        return patientMapper.pWrite( patientDto );
    } // f end

    // 환자전체조회
    public List<PatientDto> pList(){
        System.out.println("PatientService.pList");
        return patientMapper.pList();
    } // f end

    // 환자살세조회
    public PatientDto pView( int patientid ){
        System.out.println("PatientService.pView");
        System.out.println("patientid = " + patientid);
        return patientMapper.pView( patientid );
    } // f end

    // 환자수정
    public boolean pUpdate( PatientDto patientDto ){
        System.out.println("PatientService.pUpdate");
        System.out.println("patientDto = " + patientDto);
        return patientMapper.pUpdate( patientDto );
    } // f end

    // 환자삭제
    public boolean pDelete( int patientid ){
        System.out.println("PatientService.pDelete");
        System.out.println("patientid = " + patientid);
        return patientMapper.pDelete( patientid );
    } // f end

} // c end

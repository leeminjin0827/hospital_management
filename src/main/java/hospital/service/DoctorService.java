package hospital.service;

import hospital.model.dto.DoctorDto;
import hospital.model.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired private DoctorMapper doctorMapper;

    // 의사등록
    public boolean dWrite(DoctorDto doctorDto ){
        return doctorMapper.dWrite( doctorDto );
    } // f end

    // 의사 전체조회
    public List<DoctorDto> dList(){
        return doctorMapper.dList();
    } // f end

    // 의사 상세조회
    public DoctorDto dView( int doctorid ){
        return doctorMapper.dView( doctorid );
    } // f end

    // 의사 수정
    public boolean dUpdate( DoctorDto doctorDto ){
        return doctorMapper.dUpdate( doctorDto );
    } // f end

    // 의사 삭제
    public boolean dDelete( int doctorid ){
        return doctorMapper.dDelete( doctorid );
    } // f end

} // c end

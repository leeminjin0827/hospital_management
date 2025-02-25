package hospital.model.mapper;

import hospital.model.dto.PatientDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    
    // 환자등록 SQL 매퍼
    boolean pWrite( PatientDto patientDto );

    // 환자전체조회 SQL 매퍼
    List<PatientDto> pList();

    // 환자개별조회 SQL 매퍼
    PatientDto pView( int patient );

    // 환자수정 SQL 매퍼
    boolean pUpdate( PatientDto patientDto );

    // 환자삭제 SQL 매퍼
    boolean pDelete( int patient );


} // i end

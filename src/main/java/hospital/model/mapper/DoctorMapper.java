package hospital.model.mapper;

import hospital.model.dto.DoctorDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorMapper {

    // 의사등록 SQL 매퍼
    boolean dWrite(DoctorDto doctorDto );

    // 의사전체조회 SQL 매퍼
    List<DoctorDto> dList();

    // 의사상세조회 SQL 매퍼
    DoctorDto dView( int doctorid );

    // 의사수정 SQL 매퍼
    boolean dUpdate( DoctorDto doctorDto );

    // 의사삭제 SQL 매퍼
    boolean dDelete( int doctorid );


} // f end

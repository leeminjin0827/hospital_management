package hospital.controller;

import hospital.model.dto.PatientDto;
import hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/patient") // http://localhost:8080/patient
public class PatientController {

    @Autowired private PatientService patientService;

    // 환자등록
    @PostMapping("")
    public boolean pWrite(@RequestBody PatientDto patientDto ){
        System.out.println("PatientController.pWrite");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientService.pWrite( patientDto );
        return result;
    } // f end

    // 환자 전체조회
    @GetMapping("")
    public List<PatientDto> pList(){
        System.out.println("PatientController.pList");
        List<PatientDto> result = patientService.pList();
        return result;
    } // f end

    // 환자 상세조회
    @GetMapping("/view") // http://localhost:8080/patient/view
    public PatientDto pView( @RequestParam("patientid") int patientid ){
        System.out.println("PatientController.pView");
        System.out.println("patientid = " + patientid);
        PatientDto result = patientService.pView( patientid );
        return result;
    } // f end

    // 환자 수정
    @PutMapping("")
    public boolean pUpdate( @RequestBody PatientDto patientDto ){
        System.out.println("PatientController.pUpdate");
        System.out.println("patientDto = " + patientDto);
        boolean result = patientService.pUpdate( patientDto );
        return result;
    } // f end

    // 환자 삭제
    @DeleteMapping("")
    public boolean pDelete( @RequestParam("patientid") int patientid ){
        System.out.println("PatientController.pDelete");
        System.out.println("patientid = " + patientid);
        boolean result = patientService.pDelete( patientid );
        return result;
    } // f end

}

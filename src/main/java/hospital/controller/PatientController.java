package hospital.controller;

import hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired private PatientService patientService;

    // 환자등록
    @PostMapping("")
    public void pWrite(){
        System.out.println("PatientController.pWrite");
    } // f end

    // 환자 전체조회
    @GetMapping("")
    public void pList(){
        System.out.println("PatientController.pList");
    } // f end

    // 환자 상세조회
    @GetMapping("/view")
    public void pView(){
        System.out.println("PatientController.pView");
    } // f end

    // 환자 수정
    @PutMapping("")
    public void pUpdate(){
        System.out.println("PatientController.pUpdate");
    } // f end

    // 환자 삭제
    @DeleteMapping("")
    public void pDelete(){
        System.out.println("PatientController.pDelete");
    } // f end

}

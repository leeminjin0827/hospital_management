package hospital.controller;

import hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired AppointmentService appointmentService;

    // 환자등록
    @PostMapping("")
    public void pWrite(){
        System.out.println("AppointmentController.pWrite");
    } // f end

    // 환자 전체조회
    @GetMapping("")
    public void pList(){
        System.out.println("AppointmentController.pList");
    } // f end

    // 환자 상세조회
    @GetMapping("/view")
    public void pView(){
        System.out.println("AppointmentController.pView");
    } // f end

    // 환자 수정
    @PutMapping("")
    public void pUpdate(){
        System.out.println("AppointmentController.pUpdate");
    } // f end

    // 환자 삭제
    @DeleteMapping("")
    public void pDelete(){
        System.out.println("AppointmentController.pDelete");
    } // f end

} // c end

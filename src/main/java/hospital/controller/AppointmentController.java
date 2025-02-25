package hospital.controller;

import hospital.model.dto.AppointmentDto;
import hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment") // http://localhost:8080/appointment
public class AppointmentController {

    @Autowired AppointmentService appointmentService;

    // 예약등록
    @PostMapping("")
    public boolean aWrite(@RequestBody AppointmentDto appointmentDto ){
        System.out.println("AppointmentController.pWrite");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentService.aWrite( appointmentDto );
        return result;
    } // f end

    // 예약 전체조회
    @GetMapping("")
    public List<AppointmentDto> aList(){
        System.out.println("AppointmentController.pList");
        List<AppointmentDto> result = appointmentService.aList();
        return result;
    } // f end

    // 환자별 예약 상세조회
    @GetMapping("/view1") // // http://localhost:8080/appointment/view
    public List<AppointmentDto> aView1( @RequestParam("patientid") int patientid ){
        System.out.println("AppointmentController.pView");
        System.out.println("patientid = " + patientid);
        List<AppointmentDto> result = appointmentService.aView1( patientid );
        return result;
    } // f end

    // 의사별 예약 상세조회
    @GetMapping("/view2") // // http://localhost:8080/appointment/view
    public List<AppointmentDto> aView2( @RequestParam("doctorid") int doctorid ){
        System.out.println("AppointmentController.pView");
        System.out.println("doctorid = " + doctorid);
        List<AppointmentDto> result = appointmentService.aView2( doctorid );
        return result;
    } // f end

    // 예약 수정
    @PutMapping("")
    public boolean aUpdate( @RequestBody AppointmentDto appointmentDto ){
        System.out.println("AppointmentController.pUpdate");
        System.out.println("appointmentDto = " + appointmentDto);
        boolean result = appointmentService.aUpdate( appointmentDto );
        return result;
    } // f end

    // 예약 상태변경
    @PutMapping("/change")
    public boolean aChange( @RequestParam("appointmentid") int appointmentid ){
        System.out.println("AppointmentController.aChange");
        System.out.println("appointmentid = " + appointmentid);
        boolean result = appointmentService.aChange( appointmentid );
        return result;
    } // f end

} // c end

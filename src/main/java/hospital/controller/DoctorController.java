package hospital.controller;

import hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired private DoctorService doctorService;

    // 의사 등록
    @PostMapping("")
    public boolean dWrite(){
        System.out.println("DoctorController.dWrite");
        return true;
    } // f end

    // 의사 전체조회
    @GetMapping("")
    public void dList(){
        System.out.println("DoctorController.dList");
    } // f end

    // 의사 상세조회
    @GetMapping("/view")
    public void dView(){
        System.out.println("DoctorController.dView");

    } // f end

    @PutMapping("")
    public boolean dUpdate(){
        System.out.println("DoctorController.dUpdate");
        return true;
    } // f end

    @DeleteMapping("")
    public boolean dDelete(){
        System.out.println("DoctorController.dDelete");
        return true;
    } // f end




} // c end

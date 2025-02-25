package hospital.controller;

import hospital.model.dto.DoctorDto;
import hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doctor") //  http://localhost:8080/doctor
public class DoctorController {

    @Autowired private DoctorService doctorService;

    // 의사 등록
    @PostMapping("")
    public boolean dWrite(@RequestBody DoctorDto doctorDto ){
        System.out.println("DoctorController.dWrite");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorService.dWrite( doctorDto );
        return result;
    } // f end

    // 의사 전체조회
    @GetMapping("")
    public List<DoctorDto> dList(){
        System.out.println("DoctorController.dList");
        List<DoctorDto> result = doctorService.dList();
        return result;
    } // f end

    // 의사 상세조회
    @GetMapping("/view") //  http://localhost:8080/doctor/view
    public DoctorDto dView( @RequestParam("doctorid")int doctorid ){
        System.out.println("DoctorController.dView");
        System.out.println("doctorid = " + doctorid);
        DoctorDto result = doctorService.dView( doctorid );
        return result;
    } // f end

    @PutMapping("")
    public boolean dUpdate( @RequestBody DoctorDto doctorDto ){
        System.out.println("DoctorController.dUpdate");
        System.out.println("doctorDto = " + doctorDto);
        boolean result = doctorService.dUpdate( doctorDto );
        return result;
    } // f end

    @DeleteMapping("")
    public boolean dDelete( @RequestParam("doctorid") int doctorid ){
        System.out.println("DoctorController.dDelete");
        System.out.println("doctorid = " + doctorid);
        boolean result = doctorService.dDelete( doctorid );
        return result;
    } // f end




} // c end

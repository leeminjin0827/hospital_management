package hospital.service;

import hospital.model.mapper.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired AppointmentMapper appointmentMapper;

}

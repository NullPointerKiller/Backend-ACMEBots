package main.java.com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acmebots")
public class RoboController {

    @GetMapping("/listarobos")
    public List<Robo> listarRobos() {
        return RoboMock.getRobos();
    }
}

package pro.sky.java.course2.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateServiceImpl calculateService;
    public CalculateController(CalculateServiceImpl calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping ()
    public String welcome() {
        return calculateService.welcome();
    }

    @GetMapping("/plus")
    public int plus(@RequestParam ("num1") int num1, @RequestParam ("num2") int num2) {
        return calculateService.plus(num1, num2);
    }

}

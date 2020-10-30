import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "bye bye from Mario Fusco";
    }
    
    @RequestMapping("/alfonso")
    String alfonso() {
        return "<h1 style=\"color:blue;text-align: center;\">Alfonso sta' comm 'nu can' !!!</h1>";
    }
    
    @RequestMapping("/alfonso/fedeladecensi")
    String fedeladecensi() {
        return "<h1 style=\"color:blue;text-align: center;\">la Fede...sta' comm 'nà cana oh !!!</h1>";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}

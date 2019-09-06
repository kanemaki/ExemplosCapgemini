package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Olá, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Alexandre") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
	@GetMapping("/api/login1")
	public String login1(@RequestParam("login") String login, @RequestParam("senha") String senha ) {
		return "Login " + login + ", senha " + senha;
	}
    
    @PostMapping("/api/login2")
	public String login2(@RequestParam("login") String login, @RequestParam("senha") String senha ) {
		return "Login " + login + ", senha " + senha;
	}
    
    
}

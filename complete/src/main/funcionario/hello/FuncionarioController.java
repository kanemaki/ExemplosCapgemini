package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 *  @author Alexandre Florentino 
 *  @since 06/09/2019
 *  @version 1.0
 */
@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
	FuncionarioService service = new FuncionarioService();
  
    @GetMapping()
	public List<Funcionario> get(){
		return service.getFuncionario();
	}
    
    
}

package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/**
 *  @author Alexandre Florentino 
 *  @since 06/09/2019
 *  @version 1.0
 */
public class FuncionarioService {
	public List<Funcionario> getFuncionario(){
	final AtomicLong counter = new AtomicLong();
		
	List<Funcionario> func = new ArrayList<>();
		
	func.add(new Funcionario(counter.incrementAndGet(), "Alexandre"	));
	func.add(new Funcionario(counter.incrementAndGet(), "Tadeu"		));
	func.add(new Funcionario(counter.incrementAndGet(), "Gustavo"  	));
	func.add(new Funcionario(counter.incrementAndGet(), "Samuel"   	));
	func.add(new Funcionario(counter.incrementAndGet(), "Vanessa"  	));
	func.add(new Funcionario(counter.incrementAndGet(), "Antônio"  	));
		
	return func;
	}
}

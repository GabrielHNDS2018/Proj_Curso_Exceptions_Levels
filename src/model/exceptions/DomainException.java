package model.exceptions;

public class DomainException extends RuntimeException{
	
	//DomainException é uma classe cujo objetivo é inserir erros personalizados e também
	//Realizar a boa prática de reaproveitamento de código com uma simples implementação
	
	//Utilizado o *** extends RuntimeException *** para ignorar e retirar os trows das validações
	//nos métodos, normalmente é utilizada somente Exception
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}

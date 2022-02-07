package model.exceptions;

public class DomainException extends RuntimeException{
	
	//DomainException � uma classe cujo objetivo � inserir erros personalizados e tamb�m
	//Realizar a boa pr�tica de reaproveitamento de c�digo com uma simples implementa��o
	
	//Utilizado o *** extends RuntimeException *** para ignorar e retirar os trows das valida��es
	//nos m�todos, normalmente � utilizada somente Exception
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}

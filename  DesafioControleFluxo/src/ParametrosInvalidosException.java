public class ParametrosInvalidosException extends Exception{

	private int num1;
	private int num2;

	public ParametrosInvalidosException(int num1, int num2){
		super();
		this.num1 = num1;
		this.num2 = num2;

	}

	public String toString(){
		String mensagem = String.format( "O segundo parâmetro %d deve ser maior que o primeiro %d",num2,num1);
		return mensagem;
	}
    
}

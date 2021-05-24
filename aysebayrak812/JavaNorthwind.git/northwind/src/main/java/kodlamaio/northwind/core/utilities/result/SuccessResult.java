package kodlamaio.northwind.core.utilities.result;

public class SuccessResult  extends Result{
	 
	
	public SuccessResult() { //mesaj kullanmadan 
		super(true) ;
	}
	public SuccessResult(String message) {//mesaj istersem 
		super(true,message) ;
	}

}

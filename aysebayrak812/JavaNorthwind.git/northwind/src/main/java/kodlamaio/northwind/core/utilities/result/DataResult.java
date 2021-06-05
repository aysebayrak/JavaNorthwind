package kodlamaio.northwind.core.utilities.result;

public class DataResult<T>  extends Result{

	
	private T data;//her türde olabilir
	public DataResult(T data,boolean success, String message) {
		super(success, message);         //super base sınıfın construvtrerlerini calıştırır
		this.data=data;
		
	}
	public DataResult(T data,boolean success) {  //mesaj geçmek istemes isem 
		super(success);
		this.data=data;
		
	}
	public T getData() { //datayı okumak için 
		return this.data;
	}



}

package co.dev;

public class ConstructorMessage {
	private String message=null;
		public ConstructorMessage(String message) {
			this.message=message;
		}
		public void setMessage(String message){
			this.message=message;
		}
		public String getMessage(){
			return message;
		}
}

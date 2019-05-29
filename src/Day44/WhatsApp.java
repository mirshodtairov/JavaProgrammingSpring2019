package Day44;

public class WhatsApp {

	private String toNumsber;
	private String message;
	private boolean delivered;
	
	
	

	public WhatsApp() {
	
		System.out.println("no args const");
	}

	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("2 Args constractor");
		this.message = message;
		this.toNumsber = toNumsber;

	}

	public WhatsApp(String toNumsber) {

		this(toNumsber, "[]");

		System.out.println("1 Arg message");
	}
	
	
	
	
	
	
	

	public String getToNumsber() {
		return toNumsber;
	}

	public void setToNumsber(String toNumsber) {
		this.toNumsber = toNumsber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	@Override
	public String toString() {
		return "WhatsApp [toNumsber=" + toNumsber + ", message=" + message + ", delivered=" + delivered + "]";
	}

}

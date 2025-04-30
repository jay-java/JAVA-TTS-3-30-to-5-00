package reference;

public class Address {
	private int hno;
	private String localarea;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLocalarea() {
		return localarea;
	}
	public void setLocalarea(String localarea) {
		this.localarea = localarea;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", localarea=" + localarea + "]";
	}
	
}

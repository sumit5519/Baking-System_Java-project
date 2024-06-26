package epl;

public class Account {
    private int accno;
    private static int saccno=1000;
    private String name;
    private String city;
    private int bal;
    
	public Account(String name, String city, int bal) {
	
		this.name = name;
		this.city = city;
		this.bal = bal;
		this.accno=saccno++;
	
		
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public static int getSaccno() {
		return saccno;
	}

	public static void setSaccno(int saccno) {
		Account.saccno = saccno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "[accno=" + accno + ", name=" + name + ", city=" + city + ", bal=" + bal + "]";
	}
	
	
    
    
}
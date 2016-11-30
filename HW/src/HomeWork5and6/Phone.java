package HomeWork5and6;

public class Phone {

	private int id;

	private String name;
	private String secondName;
	private String sername;
	private String adress;

	private long idCard;
	private double debet;
	private double kredit;

	private int timeCityCall;
	private int timeCityOutCall;

	public Phone(int id, String name, String secondName, String sername, String adress, long idCard, double debet,
			double kredit, int timeCityCall, int timeCityOutCall) {
		this.id = id;
		this.name = name;
		this.secondName = secondName;
		this.sername = sername;
		this.adress = adress;
		this.idCard = idCard;
		this.debet = debet;
		this.kredit = kredit;
		this.timeCityCall = timeCityCall;
		this.timeCityOutCall = timeCityOutCall;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getSername() {
		return sername;
	}

	public void setSername(String sername) {
		this.sername = sername;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getIdCard() {
		return idCard;
	}

	public void setIdCard(long idCard) {
		this.idCard = idCard;
	}

	public double getDebet() {
		return debet;
	}

	public void setDebet(double debet) {
		this.debet = debet;
	}

	public double getKredit() {
		return kredit;
	}

	public void setKredit(double kredit) {
		this.kredit = kredit;
	}

	public int getTimeCityCall() {
		return timeCityCall;
	}

	public void setTimeCityCall(int timeCityCall) {
		this.timeCityCall = timeCityCall;
	}

	public int getTimeCityOutCall() {
		return timeCityOutCall;
	}

	public void setTimeCityOutCall(int timeCityOutCall) {
		this.timeCityOutCall = timeCityOutCall;
	}

	@Override
	public String toString() {
		return (getId() + " | " + getName() + " | " + getSecondName() + " | " + getSername() + " | " + getAdress() + " | "
				+ getIdCard() + " | " + getDebet() + " | " + getKredit() + " | " + getTimeCityCall()
				+ " | " + getTimeCityOutCall());
	}
}

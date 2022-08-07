
public class Certificate {

	public String getCertifacatename() {
		return certifacatename;
	}

	public void setCertifacatename(String certifacatename) {
		this.certifacatename = certifacatename;
	}

	public int getCertifacatescore() {
		return certifacatescore;
	}

	public void setCertifacatescore(int certifacatescore) {
		this.certifacatescore = certifacatescore;
	}

	private String certifacatename;
	private int certifacatescore;
	
	public Certificate(String certifacatename, int certifacatescore) {
		this.certifacatename = certifacatename;
		this.certifacatescore = certifacatescore;
	}
	
	
	
}

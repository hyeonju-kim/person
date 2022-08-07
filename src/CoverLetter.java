
public class CoverLetter {

	public String getCoverletter() {
		return coverletter;
	}
	public void setCoverletter(String coverletter) {
		this.coverletter = coverletter;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	
	private String coverletter;
	private String career;
	
	public CoverLetter(String coverletter, String career) {
		this.coverletter = coverletter;
		this.career = career;
	}
	
	

}

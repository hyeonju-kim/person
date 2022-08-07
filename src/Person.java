
public class Person {
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public Certificate getCert() {
		return cert;
	}


	public void setCert(Certificate cert) {
		this.cert = cert;
	}


	public CoverLetter getCl() {
		return cl;
	}


	public void setCl(CoverLetter cl) {
		this.cl = cl;
	}


	private String name;
	private int age;
	private Address add;
	private Certificate cert;
	private CoverLetter cl;
	
	
	public Person(String name, int age, Address add, Certificate cert, CoverLetter c1) {
		this.name = name;
		this.age = age;
		this.add = add;
		this.cert = cert;
		this.cl = c1;
	}
	
	
	
	
}

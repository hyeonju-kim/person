
public class StudentExample {
	/**
	 * 이름, 나이
	 * 주소 -  1.우편번호, 2(큰거) 3(작은거) 4(세부주소)
	 * 자격증 - 자격증 이름, 자격증 점 - 여려개 가지고 있을 수 있음 =
	 * 자기소개서 - 1. 자기소개(Str) 2.경력(Str)
	 */
	public static void main(String[] args) {
		Address a1 = new Address("12345", "경기도", "시흥시", "대야동");
		Certificate c1 = new Certificate("정처기", 80);
		CoverLetter co1 = new CoverLetter("자소서", "경력사항");
		Person p1 = new Person("현주", 20, a1, c1, co1);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAdd().toString());
		System.out.println(p1.getCert());
		System.out.println(p1.getCl());
		
	}

}

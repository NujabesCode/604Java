package ch06;

public class Exercise6_3 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name= "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}

}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2() {} //기본 생성자 추가
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() { //추가 
		return kor+eng+math;
	}
	
	float getAverage() { //추가 
		return(Math.round(getTotal()/3f *10)/10f);
	}
	
	
}	


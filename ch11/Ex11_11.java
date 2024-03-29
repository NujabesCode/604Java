package ch11;

import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet(); //해쉬셋 생성
		set.add("abc"); //abc 저장
		set.add("abc"); //abc 중복이라 저장 안됨.
		set.add(new Person("David",10)); //equals와 hashcode가 없어서 중복 제거 안됨.
		set.add(new Person("David",10)); //두 객체가 서로 다른 메모리 주소를 가짐.
										 //그렇기 때문에 직접 오버라이딩 해 줘야 됨.
		
		System.out.println(set);

	}
}
	class Person {
		@Override
		public int hashCode() {
			return Objects.hash(age, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			return age == other.age && Objects.equals(name, other.name);
		}

		String name;
		int age;
		
		Person(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public String toString() {return name+":" + age;}
	}



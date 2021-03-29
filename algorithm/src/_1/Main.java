package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//학생 인스턴스를 4개 생성
		Student student1 = new Student("손오공","1682");
		Student student2 = new Student("사오정","1683");
		Student student3 = new Student("저팔계","1684");
		Student student4 = new Student("손오반","1685");
		
		
		ArrayList<Student> ar = new ArrayList<Student>();
		//add
		ar.add(student1);
		ar.add(student2);
		ar.add(student3);
		ar.add(student4);
		
		
		//for each 문 처음부터 끝까지 돌린다면 쓰는게 좋다.
		for(Student stu: ar) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 입력하고싶으면 y, 종료하고싶으면 n");
			String input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name= scan.next();
				boolean flag = false;
				
				for(Student stu: ar) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은"+stu.getNo());
						//이름이 있었더라면 트루로 변환
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}
			
			else if(input.equals("n")) {
				break;
			}
			else {
				System.out.println("y나 n으로 입력해 주세요. 잘못된 입력입니다.");
			}
		}
		
		System.out.println("종료되었습니다.");

	}

}

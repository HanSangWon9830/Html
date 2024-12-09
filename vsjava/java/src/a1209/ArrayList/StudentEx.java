package a1209.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import a1203.singleton.student;


public class StudentEx {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();

        // //1번방법
        // Student s1 = new Student("Alice", 20, "S001");
        // Student s2 = new Student("Bob", 22, "S002");
        // Student s3 = new Student("Charlie", 19, "S003");
        // //2번 방법
        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        //Adding dummy data
        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 19, "S003"));
    
        //student에 객체만 생성한거
        Student s4 = new Student();
        s4.setName("Tom");
        s4.setAge(22);
        s4.setStudentid("S004");
        students.add(s4); //List에 넣어줌
        boolean run = true;

        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("학생관리프로그램");
            System.out.println("1.학생추가하기");
            System.out.println("2.학생리스트 보기");
            System.out.println("3.학생수정");
            System.out.println("4.학생삭제");
            System.out.println("선택해주세요>>");
            int choice = scanner.nextInt();
            scanner.nextLine(); //Consume newline

            switch (choice) {
                //학생을 입력받아 넣고 리스트에 추가하는 내용
                //학생추가하기
                case 1:
                    System.out.print("이름을 넣으세요>>");
                    String n = scanner.nextLine();
                    System.out.print("나이를 입력하세요>>");
                    int a = scanner.nextInt(); //숫자 입력할때 20 \n(개행문자)
                    scanner.nextLine(); // next()나 nextInt() 같은 메서드가 입력버러페 남긴 \n제거
                    //
                    System.out.print("아이디을 입력하세요>>");
                    String id = scanner.nextLine();
                    

                    students.add(new Student(n,a,id));
                    System.out.println("학생이 추가되었습니다");

                    //위 방법이 더 좋긴한데 이걸 안쓰겟다하면 밑에방법

                    // Student s5 = new Student(); //객체생성
                    // System.out.print("이름을 넣으세요>>");
                    // s5.setName(scanner.nextLine()); //새객체를 만들어서 넣음
                    // System.out.print("나이를 입력하세요>>");
                    // s5.setAge(scanner.nextInt());
                    // System.out.print("아이디를 입력하세요>>");
                    // s5.setStudentid(scanner.nextLine());
                    // students.add(s5);
                    // System.out.println("학생추가성공");
                    break;
                case 2:
                    //학생리스트보여주기
                    if (students.isEmpty()) { //학생리스트가 없으면
                        System.out.println("보여줄 학생 리스트 없음");
                    }else{
                        for(Student student: students){
                            System.out.println(student);
                        }
                    }
                    break; //현재의 반복문만 빠져나간다.
                case 3:
                    System.out.println("업데이트할 학생 ID를 입력해주세요");
                    String updateId = scanner.nextLine();
                    boolean found = false;
                    for(Student student: students){
                        if (student.getStudentid().equalsIgnoreCase(updateId)) {
                            System.out.println("새로운 이름:");
                            student.setName(scanner.nextLine());
                            System.out.println("새로운 나이: ");
                            student.setAge(scanner.nextInt());
                            scanner.nextLine(); //Consume newline
                            System.out.println("학생 수정 성공");
                            found =true;
                            break;
                        }
                    }
                    
                    if(!found){
                        System.out.println("찾는 학생이 없습니다.");
                    }
                 
                case 4:
                    //학생삭제
                    System.out.println("삭제할 학생 id를 입력해주세요");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for(Student student: students){
                        if (student.getStudentid().equalsIgnoreCase(deleteId)) {
                            students.remove(student); //리스트에서 학생한줄 삭제
                            System.out.println("학생을 삭제했습니다.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생이 없습니다.");
                    }
                case 5:
                    //Exit
                    System.out.println("프로그램을 끝냅니다.");
                    scanner.close();
                    //System.exit(0);
                    // return; //현재 메서드 (main) 전체를 종료, 호출된 곳으로 제어를 반환
                    run = false;
                    break;
                default:
                    System.out.println("잘못입력하셧습니다.");
                    break;
            }

            
        }

    
    
    }
}

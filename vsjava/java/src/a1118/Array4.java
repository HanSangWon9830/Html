package a1118;

public class Array4 {
    public static void main(String[] args) {
        //배열 변수 선언과 배열생성
        String[] season = {"Spring","Summer","Fall","Winter"};
        //배열의 항목값 읽기
        System.out.println("season[0] :" + season[0]);
        System.out.println("season[1] :" + season[1]);
        System.out.println("season[2] :" + season[2]);
        System.out.println("season[3] :" + season[3]);

        //인덱스1 항목의 값의 변경
        season[1] = "여름";
        System.out.println("season[1] : "+ season[1]);
        System.out.println();

        //배열 변수 선언과 배열 생성
        int[] scores = {83, 90, 87};
        //총합과 평균 구하기
        int sum = 0;
        for(int i=0; i<scores.length;i++){
            sum = sum + scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double)sum / scores.length;
        System.out.printf("평균 : %.1f\n" , avg); //소수점 첫째자리까지 [/n 줄바꿈]
        // System.out.println("평균 : " + avg); 소수점이 계속나옴
        //소수점 자리 정하고 싶으면 printf 아니면 println
    }
}

package a1118;

public class Marray1 {
    public static void main(String[] args) {
        //각반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathSocres = new int[2][3];
        for(int i=0; i < mathSocres.length; i++){ //반의 수만큼 반복
            for(int k =0; k<mathSocres[i].length; k++){ //해당 반의 학생수 만큼 반복
                System.out.println("mathScores["+i+"] ["+k+"]: " + mathSocres[i][k]);
            }
        }
        System.out.println();
        //배열의 항복 값 변경
        mathSocres[0][0] = 80;
        mathSocres[0][1] = 83;
        mathSocres[0][2] = 85;
        mathSocres[1][0] = 86;
        mathSocres[1][1] = 90;
        mathSocres[1][2] = 92;
        for(int i=0; i< mathSocres.length; i++){ //반의 수반큼 반복
            for(int k=0; k<mathSocres[i].length; k++){ //해당 반의 학생수만큼 반복
                System.out.println("mathScores["+i+"]["+k+"]: " +mathSocres[i][k]);
            }
        }
        //전체 학생의 수학 합계 구하기
        int totalMathSum = 0;
        int totalStudent = 0;
        // int t = 0;
        for(int i=0; i< mathSocres.length; i++){ //반의 수반큼 반복
            totalStudent = totalStudent + mathSocres[i].length;
            for(int k=0; k<mathSocres[i].length; k++){ //해당 반의 학생수만큼 반복
                totalMathSum = totalMathSum + mathSocres[i][k];
                // t++;
            }
        }
        System.out.println("전체 학생의 수학합계" + totalMathSum);
        System.out.println("전체 학생의 수 : " + totalStudent);
        double totalMathAvg = (double)totalMathSum / totalStudent;
        System.out.println("수학 전체 평균 : " + totalMathAvg);
    }
}

package a1201.filewrite;


import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite4 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter ("c:/abc/out3.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.";
            pw.println(data);  // println이라는 메서드를 사용할 수 있다.
        }
        pw.close();
    }
}
//File Writer를 이용하영 byte 배열 대신 문자열 사용


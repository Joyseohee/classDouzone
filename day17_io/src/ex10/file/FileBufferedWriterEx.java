package ex10.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class FileBufferedWriterEx {

	public static void main(String[] args) throws Exception {
		String str, file;
		Date date = new Date();

		str = "파일 생성 시간\n" + date + "\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일 이름을 입력하세요.");
		file = br.readLine();
		System.out.println("저장할 문자열을 입력하세요.");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);	// 파일명 정하고 파일 생성
		BufferedWriter bw = new BufferedWriter(fw);	// fw 파일에 글을 쓰기 위해 객체 생성
		
		bw.write(str);	// 생성한 객체에 write함수로 str을 쓴다.
		bw.close();	// 종료
		System.out.println(file + "파일을 성공적으로 저장했습니다.");
	}

}

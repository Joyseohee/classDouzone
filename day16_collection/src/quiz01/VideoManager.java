package quiz01;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;


class Key<K1, K2> {
    public K1 title;
    public K2 lend;
 
    public Key(K1 title, K2 lend)
    {
        this.title = title;
        this.lend = lend;
    }
}

public class VideoManager extends Video {
    
	HashMap<Key, Key> Controller = new HashMap();
	Key k1 = new Key(title, category);
	Key k2 = new Key(lendName, lendDate);
	Controller.put(k1, );
	
	
//	Key k1 = new Key(title, lend);
//	
//	Controlloer.put(k1, category);
	
	// title, category, lend	
	// title, lendName, lendDate	
	
	// constructor
	public VideoManager() {
	}
	public VideoManager(String title, String category, String lendName, LocalDate lendDate, boolean lend) {
		super(title, category, lendName, lendDate, lend);
		// TODO Auto-generated constructor stub
	}

	// add(비디오 추가)


	public void addNew(String title) {
		if (!VideoManage.containsKey(title)) {
			System.out.println("영화의 장르를 입력하세요.");
			category = new Scanner(System.in).nextLine();
			System.out.println("영화가 대여 중입니까? true/false로 입력해주세요.");
			lend = new Scanner(System.in).nextBoolean();
			System.out.println("대여하는 고객의 이름을 입력하세요.");
			lendName = new Scanner(System.in).nextLine();
			System.out.println("대여일을 입력하세요.");
			lendName = new Scanner(System.in).nextLine();
			
			CostomerList.put(lendName, CostomerManage.put(lend, lendDate));
			VideoManage.put(title, VideoList.put(category, CostomerList));
		}
	}
	
	// remove(삭제)
	public void removeVideo(String title) {
		if (!VideoManage.containsKey(title)) {
			VideoManage.remove(title, VideoList.remove(category, CostomerList.remove(lendName, CostomerManage)));
			System.out.println("삭제돼었습니다.");
		}
	}
	// print(비디오 리스트 출력)
	
	// set(수정)
	public void setVideo(String title, String category, boolean lend, String lendName, String lendDate) {
		Video v = new Video(title, category, lend, lendName, lendDate);
		VideoManage.entrySet(i, v);
		System.out.println("수정이 완료됐습니다.");
	}
	// exit(종료)
	
}

package JoinView;

public class MainProcess {
	MainPage joinView;
	TestFrm testFrm;

	public static void main(String[] args) {

		// 메인클래스 실행
		MainProcess main = new MainProcess();
		main.joinView = new MainPage(); // 로그인창 보이기
		main.joinView.setMain(main); // 로그인창에게 메인 클래스보내기
	}

	// 테스트프레임창
	public void showFrameTest() {
		joinView.dispose(); // 로그인창닫기
		this.testFrm = new TestFrm(); // 테스트프레임 오픈
	}

}

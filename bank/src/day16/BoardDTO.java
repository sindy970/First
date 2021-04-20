package day16;

public class BoardDTO {
	//게시판 관리를 위한 정보 관리 클래스
	
	//private 필드선언
	private int bNumber;
	private String bTitle, password, bWriter, contents;
	
	//기본 생성자 선언
	public BoardDTO() {
		// TODO Auto-generated constructor stub
	}

	public BoardDTO(int bNumber, String bTitle, String password, String bWriter, String contents) {
		super();
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.password = password;
		this.bWriter = bWriter;
		this.contents = contents;
	}

	public int getbNumber() {
		return bNumber;
	}

	public void setbNumber(int bNumber) {
		this.bNumber = bNumber;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "BoardDTO [bNumber=" + bNumber + ", bTitle=" + bTitle + ", password=" + password + ", bWriter=" + bWriter
				+ ", contents=" + contents + "]";
	}
	
	
	
}

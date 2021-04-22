package product;

public class ProductDTO {
	//상품관리 관련 정보 관리
	
	//필드선언
	private String pName;
	private int pNumber, pPrice, pStock;
	
	//기본 생성자
	ProductDTO(){
		
	}

	//모든 필드를 매개변수로 하는 생성자
	public ProductDTO(String pName, int pNumber, int pPrice, int pStock) {
		super();
		this.pName = pName;
		this.pNumber = pNumber;
		this.pPrice = pPrice;
		this.pStock = pStock;
	}

	// Getter/Setter 선언
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	@Override
	public String toString() {
		return "ProductDTO [pName=" + pName + ", pNumber=" + pNumber + ", pPrice=" + pPrice + ", pStock=" + pStock
				+ "]";
	}
	
}

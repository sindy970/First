package product;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		//상품관리 프로그램
		
		//필요한 변수 선언
		int cho; // 선택을 위한 변수
		boolean run = true; // while문 제어를 위한 변수
		Scanner sc = new Scanner(System.in);
		
		//ArrayList선언
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		//ProductService객체 선언
		ProductService ps = new ProductService();
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.상품등록 | 2.전체상품조회 | 3.상품정보수정 | 4.상품삭제 |5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			cho = sc.nextInt();
			
			switch(cho) {
			case 1:
				
				//상품등록 : 상품명,상품가격,재고량 입력 & 상품번호는 자동
				//객체 선언
				ProductDTO product = new ProductDTO();
				
				int count = productList.size() + 1;
				System.out.print("상품명 : ");
				product.setpName(sc.next());
				System.out.print("상품가격 : ");
				product.setpPrice(sc.nextInt());
				System.out.print("재고량 : ");
				product.setpStock(sc.nextInt());
				
				product.setpNumber(count);
				
				productList.add(product);
				break;
				
			case 2:
				
				//전체 상품조회 : 전체 상품 출력
				ps.productList(productList);
				break;
				
			case 3:
				
				//상품정보 수정 : 상품가격,재고량 수정
				productList = ps.productUpdate(productList);
				break;
				
			case 4:
				
				//상품삭제 : 상품번호를 입력 후 해당 상품 삭제
				productList = ps.productDelete(productList);
				break;
				
			case 5:
				
				//종료
				run = false;
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		
		

	}

}

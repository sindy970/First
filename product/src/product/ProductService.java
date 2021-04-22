package product;

import java.util.*;

public class ProductService {

	Scanner sc = new Scanner(System.in);
	
	//전체 상품 조회 메소드
	void productList(List<ProductDTO> productList) {
		for(int i=0; i<productList.size(); i++) {
			System.out.println(productList.get(i));
		} //for
	}//productList
	
	//상품가격, 재고량 수정 메소드
	List<ProductDTO> productUpdate(List<ProductDTO> productUpdate){
		
		int sw = 0; //상품번호가 존재 하지 않을 경우를 위한 변수
		System.out.print("수정할 상품 번호 : ");
		int pNumber = sc.nextInt();
		
		for(int i=0; i<productUpdate.size(); i++) {
			if(pNumber == productUpdate.get(i).getpNumber()) {
				System.out.print("상품가격 : ");
				productUpdate.get(i).setpPrice(sc.nextInt());
				System.out.print("재고량 : ");
				productUpdate.get(i).setpStock(sc.nextInt());
				sw = 1;
				System.out.println("수정 되었습니다.");
			} //if
		} //for
		
		if(sw == 0) {
			System.out.println("상품번호가 존재하지 않습니다.");
			sw = 0;
		} //if
		
		return productUpdate;
	}//productUpdate
	
	//상품삭제 메소드
	List<ProductDTO> productDelete(List<ProductDTO> productDelete){
		int sw = 0; //상품번호가 존재 하지 않을 경우를 위한 변수
		System.out.print("삭제할 상품 번호 : ");
		int pNumber = sc.nextInt();
		
		for(int i=0; i<productDelete.size(); i++) {
			if(pNumber == productDelete.get(i).getpNumber()) {
				productDelete.remove(i);
				System.out.println("삭제 되었습니다.");
				sw = 1;
			} //if
		} //for
		
		if(sw == 0) {
			System.out.println("상품번호가 존재하지 않습니다.");
			sw = 0;
		} //if
		return productDelete;
	}//productDelete
	
}

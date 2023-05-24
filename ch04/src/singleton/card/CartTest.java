package singleton.card;

public class CartTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card hyeonDai = company.createCard();
		Card nongHyeop = company.createCard();
		Card kb = company.createCard();
		
		System.out.println("카드넘버: "  + hyeonDai.getCardNum());
		System.out.println("카드넘버: "  + nongHyeop.getCardNum());
		System.out.println("카드넘버: "  + kb.getCardNum());
	}
}

package if_else_assignment_0;

public class Ifelse_demo7 {

	public static void main(String[] args) {
		//calculate the profit or loss by taking the cost price and selling price
		
		int s_price=900;
		int c_price=900;
		
		if(s_price>c_price) {
			System.out.println("profit of "+ (s_price-c_price));
		}
		else if(c_price>s_price) {
			System.out.println("loss of "+ (c_price-s_price));
		}                           
		else {
			System.out.println("neigther profit nor loss");
		}
	}

}

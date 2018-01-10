
public class Test {
	public static void main(String[] args) {
		Card c1 = new Card(4,1);
		Card c2 = new Card(5,1);
		Card c3 = new Card(1,1);
		Card c4 = new Card(2,0);
		Card c5 = new Card(3,1);
		Hand h1 = new Hand();
		h1.addCard(c1);
		h1.addCard(c2);
		h1.addCard(c3);
		h1.addCard(c4);
		h1.addCard(c5);
		h1.sortBySuit();
		h1.sortByValue();
		h1.printHand();
		
		Card cc1 = new Card(6,1);
		Card cc2 = new Card(5,1);
		Card cc3 = new Card(4,1);
		Card cc4 = new Card(3,0);
		Card cc5 = new Card(2,1);
		Hand h2 = new Hand();
		h2.addCard(cc1);
		h2.addCard(cc2);
		h2.addCard(cc3);
		h2.addCard(cc4);
		h2.addCard(cc5);
		//System.out.println(h2.compareTo(h1));
		//System.out.println(h1.hasTriplet());
		System.out.println();
		
		
	}

}

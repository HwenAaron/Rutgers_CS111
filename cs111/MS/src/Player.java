public class Player{

	//declare your fields here
	private Hand h;
	private double balance;
	//initialize your fields in the constructor
	public Player(double balance){
		this.balance = balance;
		h = new Hand();
	}

	public void deal(Card c){
		h.addCard(c);
	}

	//Returns an array of Cards that the Player wishes to discard.
	//The game engine will call deal() on this player for each card
	//that exists in the return value. MS2 Instructions: Print the hand to
	//the terminal using System.out.println and ask the user which cards 
	//they would like to discard. The user will first the number of cards they
    //wish to discard, followed by the indices, one at a time, of
	//the card(s) they would like to discard, 
	//Return an array with the appropriate Card objects
	//that have been discarded, and remove the Card objects from this
	//player's hand. Use IO.readInt() for all inputs. In cases of error
	//re-ask the user for input.
	//
	// Example call to discard():
	//
	// This is your hand:
	// 0: Ace of Hearts
	// 1: 2 of Diamonds
	// 2: 5 of Hearts
	// 3: Jack of Spades
	// 4: Ace of Clubs
	// How many cards would you like to discard?
	// 2
	// 1
	// 2
	//
	// The resultant array will contain the 2 of Diamonds and the 5 of hearts in that order
	// This player's hand will now only have 3 cards
	
	public Card[] discard(){
		h.printHand();
		Card[] c = new Card[5];
		if (h.hasFlush()==false || h.hasFourOfAKind()==false
				|| h.hasFullHouse()==false || h.hasStraight()==false
				|| h.hasStraight()==false) {
			for(int i =0; i<5; i++) {
				c[i]=h.getCard(i);
				h.removeCard(i);
			}
			return c; 
		}
		else {
			for(int i =0; i<5; i++) {
				c[i]=h.getCard(i);
			}
			return c;
		}
	}
	
	/*
	public Card[] discard(){
		h.printHand();
		int x;
		
		//find x
		do {
			System.out.println("How many Card do you want to discard");
			x = IO.readInt();
		} while (x<0 || x>5);
		Card[] c = new Card[x];
		if (x == 0) {
			for(int i =0; i<5; i++) {
				c[i]=h.getCard(i);
			}
			return c;
		}
		
	
		for(int i =0; i<x; i++) {
			System.out.print("Enter Index: ");
			int j = IO.readInt();
			while (h.getCard(j)==null) {
				System.out.print("Enter Index: ");
				j = IO.readInt();
			}
			c[i]=h.getCard(j);
			h.removeCard(j);
		}
		return c;
	}
	*/

	//Returns the amount that this player would like to wager, returns
	//-1.0 to fold hand. Any non zero wager should immediately be deducted
	//from this player's balance. This player's balance can never be below
	// 0 at any time. This player's wager must be >= to the parameter min
	// MS2 Instructions: Show the user the minimum bet via the terminal 
	//(System.out.println), and ask the user for their wager. Use
	//IO.readDouble() for input. In cases of error re-ask the user for 
	//input.
	// 
	// Example call to wager()
	//
	// How much do you want to wager?
	// 200
	//
	// This will result in this player's balance reduced by 200
	
	public double wager(double min){	
		System.out.println("Minimum bet is: "+min);
		
		/*
		if (h.hasFlush()==false || h.hasFourOfAKind()==false || 
				h.hasFullHouse()==false || h.hasFullHouse()==false 
				|| h.hasStraight()==true) {
			wager = -1;
			return wager;
		}
		*/
		double wager;
		if (balance < min) {
			wager = -1;
		} else {
			wager = (balance + min)/2;
		}
		balance = balance - wager;
		return wager;
	}
	
	/*
    public double wager(double min){
        
        System.out.println("Minimum bet is: "+min);
        double wager;
        do {
            System.out.println("Enter your wager");
            wager = IO.readDouble();
            if (wager == -1) {
                return -1;
            }
            
        } while (wager<min || wager>balance);
        
        balance -= wager;
        return wager;
    }
	*/
	

	//Returns this player's hand
	public Hand showHand(){
		return h;
	}

	//Returns this player's current balance
	public double getBalance(){
		return balance;
	}

	//Increase player's balance by the amount specified in the parameter,
	//then reset player's hand in preparation for next round. Amount will
	//be 0 if player has lost hand
	public void winnings(double amount){
		balance += amount;
		h.clear();
	}

}
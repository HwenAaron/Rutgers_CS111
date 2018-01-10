
/**
 * An object of type Hand represents a hand of cards.  The
 * cards belong to the class Card.  A hand is empty when it
 * is created, and any number of cards can be added to it.
 */

public class Hand {

   private Card[] hand;   // The cards in the hand.
   private int count; 
   
   /**
    * Create a hand that is initially empty.
    */
   public Hand() {
      hand = new Card[5];
	  count = 0;
   }
   
   /**
    * Remove all cards from the hand, leaving it empty.
    */
   public void clear() {
      for(int i=0 ; i<hand.length; i++){ hand[i] = null; }
	  count = 0;
   }
   
   /**
    * Add a card to the hand.  It is added at the end of the current hand.
    * @param c the non-null card to be added.
    * @throws NullPointerException if the parameter c is null.
    */
   public void addCard(Card c) {
      
	  for(int i=0 ; i<hand.length; i++){ 
		if (hand[i] == null){
			hand[i] = c;
			count = count + 1;
			break;
		}
	 }

	  
   }
   /**
    * Remove a card from the hand, if present.
    * @param c the card to be removed.  If c is null or if the card is not in 
    * the hand, then nothing is done.
    */
   public void removeCard(Card c) {

  for(int i=0 ; i<hand.length; i++){ 
    if (hand[i]!=null && hand[i].equals(c)){
      hand[i] = null;
      count = count-1;
    }
  }

   }
   
   /**
    * Remove the card in a specified position from the hand.
    * @param position the position of the card that is to be removed, where
    * positions are starting from zero.
    * @throws IllegalArgumentException if the position does not exist in
    * the hand, that is if the position is less than 0 or greater than
    * or equal to the number of cards in the hand.
    */
   public void removeCard(int position) {
      if (position < 0 || position >= hand.length)
         throw new IllegalArgumentException("Position does not exist in hand: "
               + position);
      hand[position] = null;
      count --;
   }   public int getCardCount() {
      return count;
   }
   
   /**
    * Gets the card in a specified position in the hand.  (Note that this card
    * is not removed from the hand!)
    * @param position the position of the card that is to be returned
    * @throws IllegalArgumentException if position does not exist in the hand
    */
   public Card getCard(int position) {
      if (position < 0 || position >= hand.length)
         throw new IllegalArgumentException("Position does not exist in hand: "
               + position);
       return hand[position];
   }
   
   /**
    * Sorts the cards in the hand so that cards of the same suit are
    * grouped together, and within a suit the cards are sorted by value.
    * Note that aces are considered to have the lowest value, 1.
    */
   public void sortBySuit() {
	  int size = count;
	  int nonnull = 0;
	  int index = 0;
	  
      Card[] newHand = new Card[5];
      while (size > 0) {
		 if (hand[nonnull] == null) { nonnull = nonnull+1; continue;}
         int pos = nonnull;  // Position of minimal card.
         Card c = hand[nonnull];  // Minimal card.
		 
         for (int i = nonnull+1; i < hand.length; i++) {
            Card c1 = hand[i];
			if (c1 != null){
				if ( c1.getSuit() < c.getSuit() ||
						(c1.getSuit() == c.getSuit() 
						&& c1.getValue() < c.getValue()) ) {
					pos = i;
					c = c1;
				}
			}
         }
         hand[pos] = null;
		 size = size - 1;
         newHand[index++] = c;
		 nonnull = 0;
      }
      hand = newHand;
   }
   
   /**
    * Sorts the cards in the hand so that cards of the same value are
    * grouped together.  Cards with the same value are sorted by suit.
    * Note that aces are considered to have the lowest value, 1.
    */
   public void sortByValue() {
	  int size = count;
	  int nonnull = 0;
	  int index = 0;
	  
      Card[] newHand = new Card[5];
      while (size > 0) {
		 if (hand[nonnull] == null) { nonnull = nonnull+1; continue;}
         int pos = nonnull;  // Position of minimal card.
         Card c = hand[nonnull];  // Minimal card.
		 
         for (int i = nonnull+1; i < hand.length; i++) {
            
			Card c1 = hand[i];
            if (c1 != null){
				if ( c1.getValue() < c.getValue() ||
						(c1.getValue() == c.getValue() 
						&& c1.getSuit() < c.getSuit()) ) {
					pos = i;
					c = c1;
				}
			}
         }
         hand[pos] = null;
		 size = size - 1;
         newHand[index++] = c;
		 nonnull = 0;
      }
      hand = newHand;
   }
   
   public void printHand(){
	   
	   for(int i=0; i<hand.length; i++){
		   if (hand[i] != null){
			   System.out.println(hand[i]);
		   }
	   }
	   System.out.println();
   }
   
   //Answers Starts here
   
 //Returns the number of pairs this hand contains
   public int numPairs() {
	   this.sortByValue();
	   int pair=0;
	   int a=0;
	   for (int i =0 ;i<hand.length-1;i++) {
		   if (hand[i].getValue()==hand[i+1].getValue()) {
			   pair++;
		   }
	   }
	   if (pair == 1 || pair == 2) {
		   a = 1;
	   } 
	   else if (pair == 3||pair==4) {
		   a = 2;
	   }
	   return a;
   }
   
 //Returns true if this hand has 3 cards that are of the same value
   public boolean hasTriplet(){
	   this.sortByValue();
	   for (int i = 0; i<hand.length-2; i++) {
		   if (hand[i].getValue() == hand[i+1].getValue() &&
				   hand[i+1].getValue()==hand[i+2].getValue()) {
			   return true;
		   }
	   }
	   return false;
   }      
 //Returns true if this hand has all cards that are of the same suit
   public boolean hasFlush() {
	   for (int i = 1; i<hand.length; i++) {
		   if (hand[0].getSuit() != hand[i].getSuit()) {
			   return false;
		   }
		   
	   }
	   return true;
	   
   }
 //Returns true if this hand has 5 consecutive cards of any suit
   public boolean hasStraight() {
	   boolean bool = false;
	   this.sortByValue();
	   if ((hand[4].getValue()==hand[3].getValue()+1)&&
			   (hand[3].getValue()==hand[2].getValue()+1)
			   &&(hand[2].getValue()==hand[1].getValue()+1)
			   &&(hand[1].getValue()==hand[0].getValue()+1)) {
		   bool = true;
		   
	   }
	   return bool;
   }
   
   public boolean hasFullHouse() {
	   boolean bool = false;
	   if (this.hasTriplet()==false) {
		   bool = false;
	   }
	   else if (this.hasTriplet()==true) {
		   if (this.numPairs()==2) {
			   bool = true;
		   }
	   }
	   return bool;
   }
   
   public boolean hasFourOfAKind() {
	   this.sortByValue();
	   boolean bool = false;
	   int val = hand[2].getValue();
	   int count = 0;
	   for (int i =0; i<hand.length; i++) {
		   if (val == hand[i].getValue()) {
			   count=count+1;
		   }
	   }
	   if (count >= 4) {
		   bool = true;
	   } else {
		   bool = false;
	   }
	   return bool;
   }

 //Returns the card with the highest value in the hand. When there is
 //more than one highest value card, you may return any one of them
   public Card highestValue() {
	   this.sortByValue();
	   Card c = null;
	   if (hand[0].getValue()==1) {
		   c = hand[0];
	   } else {
		   c = hand[4];
	   }
	   return c;
   }
 //Returns the highest valued Card of any pair or triplet found, null if
// none. When values are equal, you may return either
   public Card highestDuplicate() {
	   Card c= null;
	   this.sortByValue();
	   if (hand[0].getValue()==1&&hand[1].getValue()==1) {
		   return hand[0];
	   }
	   else {
		   for (int i = hand.length-1; i>0; i--) {
			   if (hand[i].getValue()==hand[i-1].getValue()) {
				   c = hand[i];
			   }
		   }
	   }
	   return c;
   }
   public Card Duplicate() {
	   Card c = null;
	   this.sortByValue();
	   if (this.numPairs()==1 && this.hasTriplet()==false) {
		   for (int i = 0; i<hand.length-1;i++) {
			   if (hand[i].getValue()==hand[i+1].getValue()) {
				   c = hand[i];
			   }
		   }
	   }
	   else if (this.numPairs()==1 && this.hasTriplet()==true) {
		   c = hand[2];
	   }
	   else if (this.numPairs()==2 && this.hasFourOfAKind()==false) {
		   c = hand[3];
	   }

	   return c; 
   }
   
   
 //Returns -1 if the instance hand loses to the parameter hand, 0 if 
   //the hands are equal, and +1 if the instance hand wins over the 
   //parameter hand. Hint: you might want to use some of the methods 
   //above
   public int compareTo(Hand h) {
	   //straight Flush
	   if (this.hasFlush()==true && this.hasStraight()==true 
			   && h.hasFlush()==false && h.hasStraight()==false) {
		   return +1;
	   }
	   else if (this.hasFlush()==false && this.hasStraight()== false 
			   && h.hasFlush()==true && h.hasStraight()==true) {
		   return -1;
	   }
	   if (this.hasFlush()==true && this.hasStraight()==true && h.hasFlush()==true 
			   && h.hasStraight()==true) {
		   if (this.highestValue().getValue()>h.highestValue().getValue() ){
			   return +1;
		   }
		   if (this.highestValue().getValue()<h.highestValue().getValue() ){
			   return -1;
		   }
		   
		   else if (this.highestValue().getValue()==h.highestValue().getValue()) {
			 if (this.highestValue().getSuit()>h.highestValue().getSuit()) {
				 return +1;
			 }
			 else if (this.highestValue().getSuit()<h.highestValue().getSuit()) {
				 return -1;
			 }
			 else if (this.highestValue().getSuit()==h.highestValue().getSuit()) {
				 return 0;
			 }
		  }
	   }
	   // FourOfAKind
	   if (this.hasFourOfAKind()==true&&h.hasFourOfAKind()==false) {
		   return +1;
	   }
	   else if (this.hasFourOfAKind()==false&&h.hasFourOfAKind()==true) {
		   return -1;
	   }
	   else if (this.hasFourOfAKind()==true&&h.hasFourOfAKind()==true) {
		   if (this.Duplicate().getValue()>h.Duplicate().getValue()) {
			   return +1;
		   }
		   else if(this.Duplicate().getValue()<h.Duplicate().getValue()) {
			   return -1;
		   }
		   else if(this.Duplicate().getValue()==h.Duplicate().getValue()) {
			   if(this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
				   return +1;
			   }
			   else if(this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
				   return -1;
			   }
			   else if(this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   

	   //Full House
	   if (this.hasFullHouse()==true&&h.hasFullHouse()==false) {
		   return +1;
	   }
	   else if (this.hasFullHouse()==false&&h.hasFullHouse()==true) {
		   return -1;
	   }
	   else if (this.hasFullHouse()==true&&h.hasFullHouse()==true) {
		   if (this.Duplicate().getValue()>h.Duplicate().getValue()) {
			   return +1;
		   }
		   else if (this.Duplicate().getValue()<h.Duplicate().getValue()) {
			   return -1;
		   }
		   else if (this.Duplicate().getValue()==h.Duplicate().getValue()) {
			   if (this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
				   return +1;
			   }
			   else if (this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
				   return -1;
			   }
			   else if (this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   
	   //Flush
	   if (this.hasFlush()==true&&h.hasFlush()==false) {
		   return +1;
	   }
	   else if (this.hasFlush()==false&&h.hasFlush()==true) {
		   return -1;
	   }
	   else if (this.hasFlush()==true&&h.hasFlush()==true) {
		   if (this.highestValue().getValue()>h.highestValue().getValue()) {
			   return +1;
		   }
		   else if (this.highestValue().getValue()<h.highestValue().getValue()) {
			   return -1;
		   }
		   else if (this.highestValue().getValue()==h.highestValue().getValue()) {
			   return 0;
		   }
	   }
	   
	   //Straight
	   if (this.hasStraight()==true&&h.hasStraight()==false) {
		   return +1;
	   }
	   else if (this.hasStraight()==false&&h.hasStraight()==true) {
		   return -1;
	   }
	   else if (this.hasStraight()==true&&h.hasStraight()==true) {
		   if (this.highestValue().getValue()>h.highestValue().getValue()) {
			   return +1;
		   }
		   else if (this.highestValue().getValue()<h.highestValue().getValue()) {
			   return -1;
		   }
		   else if (this.highestValue()==h.highestValue()) {
			   if (this.highestValue().getSuit()>h.highestValue().getSuit()) {
				   return +1;
			   }
			   else if(this.highestValue().getSuit()<h.highestValue().getSuit()) {
				   return -1;
			   }
			   else if(this.highestValue().getSuit()==h.highestValue().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   
	   //Three Of A Kind
	   if (this.hasTriplet()==true&&h.hasTriplet()==false) {
		   return +1;
	   }
	   else if (this.hasTriplet()==false&&h.hasTriplet()==true) {
		   return -1;
	   }
	   else if (this.hasTriplet()==true&&h.hasTriplet()==true) {
		   if (this.Duplicate().getValue()>h.Duplicate().getValue()) {
			   return +1;
		   }
		   else if(this.Duplicate().getValue()<h.Duplicate().getValue()) {
			   return -1; 
		   }
		   else if(this.Duplicate().getValue()==h.Duplicate().getValue()) {
			   if (this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
				   return +1;
			   }
			   else if (this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
				   return -1;
			   }
			   else if (this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   
	   //Two Pair
	   if (this.numPairs()==2&&this.hasFourOfAKind()==false &&
			   h.numPairs()!=2&&h.hasFourOfAKind()==false) {
		   return +1;
	   }
	   else if (this.numPairs()!=2&&this.hasFourOfAKind()==false &&
			   h.numPairs()==2&&h.hasFourOfAKind()==false) {
		   return -1;
	   }
	   else if (this.numPairs()==2&&this.hasFourOfAKind()==false &&
			   h.numPairs()==2&&h.hasFourOfAKind()==false) {
		   if (this.highestValue().getValue()>h.highestValue().getValue()) {
			   return +1;
		   }
		   else if (this.highestValue().getValue()<h.highestValue().getValue()) {
			   return -1;
		   }
		   else if (this.highestValue().getValue()==h.highestValue().getValue()) {
			   if (this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
				   return +1;
			   }
			   else if (this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
				   return -1;
			   }
			   else if (this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   
	   //One Pair
	   if (this.numPairs()==1&&this.hasTriplet()==false && h.numPairs()!=1&&
			   h.hasTriplet()==false) {
		   return +1;
	   }
	   else if (this.numPairs()!=1&&this.hasTriplet()==false && h.numPairs()==1
			   &&h.hasTriplet()==false) {
		   return -1;
	   }
	   else if (this.numPairs()==1&&this.hasTriplet()==false && h.numPairs()==1&&
			   h.hasTriplet()==false) {
		   if (this.highestValue().getValue()>h.highestValue().getValue()) {
			   return +1;
		   }
		   else if (this.highestValue().getValue()<h.highestValue().getValue()) {
			   return -1;
		   }
		   else if (this.highestValue().getValue()==h.highestValue().getValue()) {
			   if (this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
				   return +1;
			   }
			   else if (this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
				   return -1;
			   }
			   else if (this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
				   return 0;
			   }
		   }
	   }
	   
	   //Highest Value
	   if (this.highestValue().getValue()>h.highestValue().getValue()) {
		   return +1;
	   }
	   else if (this.highestValue().getValue()<h.highestValue().getValue()) {
		   return -1;
	   }
	   else if (this.highestValue().getValue()==h.highestValue().getValue()) {
		   if (this.Duplicate().getSuit()>h.Duplicate().getSuit()) {
			   return +1;
		   }
		   else if (this.Duplicate().getSuit()<h.Duplicate().getSuit()) {
			   return -1;
		   }
		   else if (this.Duplicate().getSuit()==h.Duplicate().getSuit()) {
			   return 0;
		   }
	   }
	   return 0;
   }
}
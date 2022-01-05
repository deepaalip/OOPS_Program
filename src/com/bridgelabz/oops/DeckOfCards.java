package com.bridgelabz.oops;

import java.util.Random;

public class DeckOfCards {

     int[][] Cards = new int[4][13];
	
	
public static void main(String[] args) {
		DeckOfCards  CardDeck = new DeckOfCards();
		
	 for (int Playerx =1; Playerx <= 4; Playerx++) {
		 CardDeck.distributeCards(Playerx);
		 System.out.println(" Player"+Playerx+"'s Cards =");
		  
		 CardDeck.print(Playerx);
		 }
	}
public void distributeCards(int Playerx) {
		for (int i = 0; i < 9; i++) {
			distributeonecard(Playerx);
			
		}
	}
public void distributeonecard(int Playerx) {
	  Random random = new Random();
	  int Suits = random.nextInt(4);
	  int Rank = random.nextInt(13);
	  
	  if (Cards[Suits][Rank] != 0) {
		distributeonecard(Playerx);
	} else {
        Cards[Suits][Rank]=Playerx;
	}
  }
public void print(int Playerx) {
	  
	
   for (int Suits = 0; Suits < 4; Suits++) {
	
   for (int Rank = 0; Rank < 13; Rank++) {
	
	if (Cards[Suits][Rank] == Playerx) {
		System.out.println(" ->"+getSuit(Suits)+ "="+getRank(Rank));
		
	  }
   }	
	
}

}
public String getRank(int rank) {
 
	switch (rank) {
	case 0:
		return "Ace";
	case 1:
		return "Queen";
	case 2:
		return "King";
	case 3:
		return "Jack";
	case 4:
		return "2";
	case 5:
		return "3";
	case 6:
		return "4";
	case 7:
		return "5";
	case 8:
		return "6";
	case 9:
		return "7";
	case 10:
		return "8";
	case 11:
		return "9";
	case 12:
		return "10";	
		  
		  
	default:
	       return"none";
	       
	}
	
}
public String getSuit(int suits) {
	// TODO Auto-generated method stub
switch (suits) {
case 0:
	return "Clubs";
case 1:
	return "Diamonds";
case 2:
	return "Hearts";
case 3:
	return "Spades";
default:
	return "none";
     }
  }
  
}

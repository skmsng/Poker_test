package com.example.poker_test;

public class Card {
	//private int id;		//カードID（プライマリーキー）
	private int r_id;	//Rクラスの画像ID
	private int suit;	//スート（マーク）
	private int num;	//数字
	
	public Card(int r_id, int suit, int num) {
		super();
		//this.id = id;
		this.r_id = r_id;
		this.suit = suit;
		this.num = num;
	}
	
	
}

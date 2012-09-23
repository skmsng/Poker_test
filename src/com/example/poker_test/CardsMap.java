package com.example.poker_test;

import java.util.HashMap;
import java.util.Map;

import android.util.Log;

public class CardsMap {
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();

	public CardsMap(int rCards[], int cardNum[][]){
		int i = 0;	//52回
		for(int j=0; j<cardNum.length; j++){	//4回
			for(int k=0; k<cardNum[j].length; k++){	//13回
				this.map.put(rCards[i], cardNum[j][k]);
				System.out.println(rCards[i]+":"+cardNum[j][k]);
				i++;
			}
		}
	}
	
	public Map getCardsMap(){
		for(int name : map.keySet()){
			System.out.println(name +":"+ map.get(name));
		}
		return this.map;
	}
}

package com.example.poker_test;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class Poker extends Activity {
	public float disp_w,disp_h;	//実機ディスプレイサイズ

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //タイトルバー、情報バーを消して全画面表示
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        //ディスプレイサイズの取得
        WindowManager manager = window.getWindowManager();
        Display disp = manager.getDefaultDisplay();
        this.disp_w = disp.getWidth();
        this.disp_h = disp.getHeight();
        
        setContentView(R.layout.main);
        
        int[] CARDs = {
    			R.drawable.d01, R.drawable.d02, R.drawable.d03, R.drawable.d04, R.drawable.d05,
    			R.drawable.d06, R.drawable.d07, R.drawable.d08, R.drawable.d09, R.drawable.d10,
    			R.drawable.d11, R.drawable.d12, R.drawable.d13,
    			R.drawable.c01, R.drawable.c02, R.drawable.c03, R.drawable.c04, R.drawable.c05,
    			R.drawable.c06, R.drawable.c07, R.drawable.c08, R.drawable.c09, R.drawable.c10,
    			R.drawable.c11, R.drawable.c12, R.drawable.c13,
    			R.drawable.h01, R.drawable.h02, R.drawable.h03, R.drawable.h04, R.drawable.h05,
    			R.drawable.h06, R.drawable.h07, R.drawable.h08, R.drawable.h09, R.drawable.h10,
    			R.drawable.h11, R.drawable.h12, R.drawable.h13,
    			R.drawable.s01, R.drawable.s02, R.drawable.s03, R.drawable.s04, R.drawable.s05,
    			R.drawable.s06, R.drawable.s07, R.drawable.s08, R.drawable.s09, R.drawable.s10,
    			R.drawable.s11, R.drawable.s12, R.drawable.s13,
    			};
        int[][] cardNum = {
    			{1,2,3,4,5,6,7,8,9,10,11,12,13},  {1,2,3,4,5,6,7,8,9,10,11,12,13},
    			{1,2,3,4,5,6,7,8,9,10,11,12,13},  {1,2,3,4,5,6,7,8,9,10,11,12,13},
    			};
    	//private Integer j01 = R.drawable.j01;	//ジョーカー
    	//private Integer uk0 = R.drawable.uk0;	//裏イメージ
        
        Map<Integer,Card> map = new HashMap<Integer,Card>();
        int id=0;
        
        for(int i=0; i<cardNum.length; i++){
        	for(int j=0; j<cardNum[i].length; j++){
        		map.put(id, new Card(CARDs[id], i+1, j+1));
        		id++;
        	}
        }
        
        
        
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

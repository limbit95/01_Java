package edu.kh.rpggame.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.kh.rpggame.model.service.RPGGameService;
import edu.kh.rpggame.model.service.RPGGameServiceImpl;

public class RPGGameView {

	private BufferedReader br = null;
	private RPGGameService service = null;
	
	public RPGGameView() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			service = new RPGGameServiceImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void main() {
		int input = 0;
		
		do {
			System.out.println("========== Main Menu ==========");
			
			
		}while(input != 0);
	}
	
	
}
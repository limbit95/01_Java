package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length; x++) {
				arr[i][x] = "(" + i + ", " + x + ")";
			}
			System.out.println(Arrays.toString(arr[i]));
		}	
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int cnt = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length; x++) {
				arr[i][x] = cnt;
				cnt++;
				System.out.printf("%3d", arr[i][x]);
			} System.out.println();
		} 
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int cnt = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length; x++) {
				arr[i][x] = cnt;
				cnt--;
				System.out.printf("%3d", arr[i][x]);
			} System.out.println();
		} 
	}
	
	// 입력 받아서 값 저장 후 처리해보기
	public void practice4() {
		int[][] arr = {{9, 3, 7, 0},
					   {3, 6, 9, 0},
					   {6, 10, 10, 0},
					   {0, 0, 0, 0}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length-1; x++) {
				arr[i][arr[i].length-1] += arr[i][x];
				arr[arr.length-1][i] += arr[x][i];
			} 
			arr[arr.length-1][arr.length-1] /= 2;
			System.out.println(Arrays.toString(arr[i]));
		} 
		
	}
	
	public void practice5() {
		boolean flag = true;
		
		int row = 0;
		int col = 0;
		
		while(flag) {
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			if((row >= 1 && row <= 10) && (col >= 1 && col <= 10)) {
				flag = false;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		
		char[][] arr = new char[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length; x++) {
				arr[i][x] = (char)(Math.random() * 26 + 66);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void practice6() {
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		char[][] arr = new char[row][];
		char a = 'a';
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			arr[i] =  new char[col];
			for(int x = 0; x < arr[i].length; x++) {
				arr[i][x] = a++;
			}
		}
		// 결과물 출력 for문
		for(int i = 0; i < arr.length; i++) {
			for(char ch : arr[i]) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int cnt = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int x = 0; x < arr1[i].length; x++) {
				arr1[i][x] = students[cnt];
				cnt++;
			}
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int x = 0; x < arr2[i].length; x++) {
				arr2[i][x] = students[cnt];
				cnt++;
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
	}
	
	public void practice8() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int cnt = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int x = 0; x < arr1[i].length; x++) {
				arr1[i][x] = students[cnt];
				cnt++;
			}
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int x = 0; x < arr2[i].length; x++) {
				arr2[i][x] = students[cnt];
				cnt++;
			}
			System.out.println(Arrays.toString(arr2[i]));
		}
		
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		for(int i = 0; i < arr1.length; i++) {
			for(int x = 0; x < arr1[i].length; x++) {
				if(arr1[i][x].equals(input)) {
					String leftRight = "";
					if(x == 0) {
						leftRight = "왼쪽";
					} else if (x == 1) {
						leftRight = "오른쪽";
					}
					
					System.out.printf("검색하신 차천축 학생은 "
									+ "1분단 %d번째 줄 %s에 있습니다.",
									   i+1, leftRight);
				}
			}
		}	
		
		for(int i = 0; i < arr2.length; i++) {
			for(int x = 0; x < arr2[i].length; x++) {
				if(arr2[i][x].equals(input)) {
					String leftRight = "";
					if(x == 0) {
						leftRight = "왼쪽";
					} else if (x == 1) {
						leftRight = "오른쪽";
					}
					
					System.out.printf("검색하신 차천축 학생은 "
									+ "2분단 %d번째 줄 %s에 있습니다.",
									   i+1, leftRight);
				}
			}
		}	
	}
	
	public void practice9() {
		String[][] arr = {{"", "0", "1", "2", "3", "4"},
						  {"0", "", "", "", "", ""},
						  {"1", "", "", "", "", ""},
						  {"2", "", "", "", "", ""},
						  {"3", "", "", "", "", ""},
						  {"4", "", "", "", "", ""}};
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int col = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			for(int x = 0; x < arr[i].length; x++) {
				if(i == row+1 && x == col+1) {
					arr[i][x] = "x";
				}
				System.out.printf("%-2s", arr[i][x]);
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		while(true) {
			String[][] arr = {{"", "0", "1", "2", "3", "4"},
							  {"0", "", "", "", "", ""},
							  {"1", "", "", "", "", ""},
							  {"2", "", "", "", "", ""},
							  {"3", "", "", "", "", ""},
							  {"4", "", "", "", "", ""}};

			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int col = sc.nextInt();
			for(int i = 0; i < arr.length; i++) {
				for(int x = 0; x < arr[i].length; x++) {
					if(i == row+1 && x == col+1) {
						arr[i][x] = "x";
					}
					System.out.printf("%-2s", arr[i][x]);
				}
				System.out.println();
			}
		}
		
		
	}

}

package edu.kh.array.ex;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample2 {
	
	// 얕은 복사 (shallow)
	// -> 주소를 복사하여 서로 다른 두 번수가
	//    하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사 방법
	public void shallowCopy() {
		int[] arr = {1,2,3,4,5};
		
		// 얕은 복사 진행
		int[] copyArr = arr; // 주소만 복사
		
		System.out.println("변경 전");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
	}
	
	// 깊은 복사 (deep)
	// -> 같은 자료형의 새로운 배열을 만들어서
	//    기존 배열의 데이터를 모두 복사하는 방법
	public void deepCopy() {
		int[] arr = {1,2,3,4,5}; // 원본
		
		// 1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length];
		for(int i = 0; i < copyArr1.length; i++) {
			copyArr1[i] = arr[i];
		}
//		System.out.println(Arrays.toString(copyArr1));
		
		// 2. System.arraycopy();
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
//		System.out.println(Arrays.toString(copyArr2));
		
		// 3. 복사한 배열 참조변수 = Arrays.copyOf();
		int[] copyArr3 = new int[arr.length];
		copyArr3 = Arrays.copyOf(arr, arr.length);
//		System.out.println(Arrays.toString(copyArr3));
		
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));
		
		
	}

	// 배열을 이용한 중복 데이터 제거 + 정렬
	public void createLottoNumber() {
		// 1. 1 ~ 45 사이 중복되지 않은 난수 6개 생성
		// 2. 생성된 난수가 오름차순으로 정렬
		
		// 1) 정수 6개를 저장할 배열 선언 및 할당
		int[] lotto = new int[6];
		
		// 내 풀이
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = 1;
			
			int randomNum = (int)(Math.random() * 45 + 1);
			
			boolean flag = false;
			
			for(int x = 0; x < i; x++) {
				if(lotto[x] == randomNum) {
					flag = true;
				}  
			}
			
			if(!flag) {
				lotto[i] = randomNum;
			} 
		}
		
		// 강사님 코드
		// 2) 생성된 배열을 처음부터 끝까지 순차 접근하는 for문 작성
//		for(int i = 0; i < lotto.length; i++) {
//			// 3) 1 ~ 45 사이 난수 생성
//			int randomNum = (int)(Math.random() * 45 + 1);
//			
//			// 4) 생성된 난수를 순서대로 배열 요소에 대입
//			lotto[i] = randomNum;
//			
//			// 5) 중복 검사를 위한 for문 작성
//			for(int x = 0; x < i; x++) {
//				
//				// 6) 현재 생성된 난수와 같은 수가 앞쪽 요소에 있는지 검사
//				if(lotto[x] == randomNum) {
//					i--;
//					break;
//				}
//			}
//		}
		
		Arrays.sort(lotto);
		
//		for(int i = 0; i < lotto.length; i++) {
//			for(int x = i + 1; x < lotto.length; x++) {
//				int temp;
//				if(lotto[i] > lotto[x]) {
//					temp = lotto[i];
//					lotto[i] = lotto[x];
//					lotto[x] = temp;
//				}
//			}
//		}
		
		System.out.println(Arrays.toString(lotto));
	}
	
	
}

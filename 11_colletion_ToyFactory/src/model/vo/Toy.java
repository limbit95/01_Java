package model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Toy implements Comparable<Toy>{
	
	private String toyName;
	private int useAge;
	private int price;
	private String toyColor;
	private int since;
	private Set<String> setMaterial;
	
	private String material;

	public Toy() {}
	
	public Toy(String toyName, int useAge, int price, String toyColor, int since, Set<String> setMaterial) {
		super();
		this.toyName = toyName;
		this.useAge = useAge;
		this.price = price;
		this.toyColor = toyColor;
		this.since = since;
		this.setMaterial = setMaterial;
		materialToString();
	}
	
	

	public void materialToString() {
		String tempMaterial = "";
//		
		for(String m : setMaterial) {
			if(tempMaterial.length() == 0) {
				tempMaterial += m;
			} else {
				tempMaterial += ", " + m;
			}
		}
		
		this.material = tempMaterial;
	}



	@Override
	public String toString() {
		return "이름 : " + toyName + " / 가격 : " + price + " / 색상 : " + toyColor + " / 사용가능연령 : " + useAge
				+ " / 제조년월일 : " + since + " / 재료 : " + material;
	}



	@Override
	public int compareTo(Toy other) {
		return this.since - other.since;
	}

	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	public int getUseAge() {
		return useAge;
	}
	public void setUseAge(int useAge) {
		this.useAge = useAge;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getToyColor() {
		return toyColor;
	}
	public void setToyColor(String toyColor) {
		this.toyColor = toyColor;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	public Set<String> getSetMaterial() {
		return setMaterial;
	}
	public void setSetMaterial(Set<String> setMaterial) {
		this.setMaterial = setMaterial;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

//	// 장난감 객체
//	public Map<String, Object> createToy() {
//		
//		Map<String, Object> toy = new HashMap<String, Object>();
//		
//		toy.put("장난감 이름", toyName);
//		toy.put("사용연령", useAge);
//		toy.put("가격", price);
//		toy.put("색상", toyColor);
//		toy.put("제조년월일", since);
//		toy.put("사용재료", material);
//		
//		return toy;
//	}
	
}
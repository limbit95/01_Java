package model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Toy_2 {
	
	private String name;
	private int age;
	private int price;
	private String color;
	private String since;
	private Set<String> materials;

	public Toy_2() {}
	
	public Toy_2(String name, int age, int price, String color, String since, Set<String> materials) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.since = since;
		this.materials = materials;
	}
	
	
	// StringBuilder를 사용한 getMaterialsAsString() 메서드 업그레이드
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		
		for(String material : materials) {
			sb.append(material).append(", ");
		}
		
		// 마지막 쉼표와 공백 제거하기
		if(sb.length() > 0) {
			sb.setLength(sb.length() - 2);;
		}
		
		return sb.toString();
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(price, materials, since, color, name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy_2 other = (Toy_2) obj;
		return price == other.price && Objects.equals(materials, other.materials) && since == other.since
				&& Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& age == other.age;
	}

	
	
	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age
				+ " / 제조년월일 : " + since + " / 재료 : " + getMaterialsAsString();
	}




	public String getName() {
		return name;
	}
	public void setName(String toyName) {
		this.name = toyName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int useAge) {
		this.age = useAge;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String toyColor) {
		this.color = toyColor;
	}
	public String getSince() {
		return since;
	}
	public void setSince(String since) {
		this.since = since;
	}
	public Set<String> getMaterials() {
		return materials;
	}
	public void setMaterials(Set<String> materials) {
		this.materials = materials;
	}
	
}
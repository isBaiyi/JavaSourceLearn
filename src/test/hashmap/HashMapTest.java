package test.hashmap;

import java.util.HashMap;

/**
 * @description: hashmap测试
 * @author: star bright
 * @date: 2024/5/7 15:59
 */
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();

		hashMap.put("1", "1");
		hashMap.put("2", "2");
		hashMap.put("3", "3");
		hashMap.put("4", "4");
		hashMap.put("5", "5");
		hashMap.put("6", "6");
		System.out.println("hashMap = " + hashMap);
	}
}

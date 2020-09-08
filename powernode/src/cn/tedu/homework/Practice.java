package cn.tedu.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class Practice {
	
	/**
	 * 	第一题
	 */
	@Test
	public void demo() {
		final int start = 10;
		final int end = 20;
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=start; i<=end; i++) {
			numbers.add(i);
		}

		System.out.println(numbers);
		
		Random random = new Random();

		Integer r = numbers.remove(random.nextInt(numbers.size()));
		System.out.println(numbers);
		System.out.println(r);
		
		// findMissNumber(start, end, numbers); 完成方法
		
	}

	
}

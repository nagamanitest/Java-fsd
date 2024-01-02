package com.simplilearn.junit;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicTestExample {
	
	
	@TestFactory
	@DisplayName("Dynamic test")
	public DynamicTest dynamicTestWithDynamicTest(){
		return DynamicTest.dynamicTest("Addition Test", ()-> {
			assertEquals(200,Math.addExact(100,100));
			
		});
		
	}
	@TestFactory
	@DisplayName("Collection Dynamic test")
	public Collection<DynamicTest> dynamicTestWithCollection(){
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition  +ve Test", ()-> {
					assertEquals(200,Math.addExact(100,100));
				}),
				DynamicTest.dynamicTest("Addition  +ve and -ve Test", ()-> {
					assertEquals(200,Math.addExact(-200,400));
				}),
				DynamicTest.dynamicTest("Addition  0 and +ve Test", ()-> {
					assertEquals(400,Math.addExact(0,400));
				}),
				DynamicTest.dynamicTest("Addition  -ve and -ve Test", ()-> {
					assertEquals(-200,Math.addExact(-100,-100));
				})
				
			);
	
	}
	@TestFactory
	@DisplayName("Iterable Dynamic test")
	public Iterable<DynamicTest> dynamicTestWithIterable(){
		return Arrays.asList(
				DynamicTest.dynamicTest("Addition Test", ()-> {
					assertEquals(200,Math.addExact(100,100));
				}),
				DynamicTest.dynamicTest("Multiplication Test", ()-> {
					assertEquals(400000,Math.multiplyExact(1000,400));
				})
				
			);
}
	@TestFactory
	@DisplayName("Stream Dynamic  test")
	public Stream<DynamicTest> dynamicTestWithStream(){
		return IntStream.iterate(0, n ->n+2).limit(10)
				.mapToObj(n ->
				DynamicTest.dynamicTest("Test Dicvisible by 2 ::" + n,() -> {
				assertTrue(n%2==0);
					})	
		);
		
}
}

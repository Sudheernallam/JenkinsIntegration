package com.temp;

import org.testng.annotations.Test;

public class TempClass {
			
		@Test
		public void afirstMethod() {
			System.out.println("First Method executed");
		}
		
		@Test
		public void bsecondMethod() {
			System.out.println("Second Method executed");
		}
		
		@Test
		public void cfinalMethod() {
			System.out.println("Finally i ran local java code in Jenkins");
		}

	}


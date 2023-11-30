package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiB();
		kadaiC();
	}
		static void kadaiB() {
			Random random = new Random();
			int a = random.nextInt(100) + 1;
			System.out.println(a);
		}
		static void kadaiC() {
	int a = 50;
	int b = 75;
	int c = a+b;

	System.out.println(c);
		}
}
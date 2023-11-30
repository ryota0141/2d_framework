package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiB();

	}

		static void kadaiB() {
			Random random = new Random();
			int a = random.nextInt(100) + 1;
			System.out.println(a);
		}
}
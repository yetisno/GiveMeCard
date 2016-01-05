package org.yetiz.utils;

import java.util.Random;

/**
 * Created by yeti on 16/1/5.
 */
public class CardGenerator {
	private static Random random = new Random(System.currentTimeMillis());

	public static String getCheckCode(String card) {
		int sum = 0;
		for (int i = card.length() - 1; i >= 0; i--) {
			int current = Integer.parseInt(String.valueOf(card.charAt(i)), 10);
			current *= (1 + (((card.length() - 1 - i) + 1) % 2));
			sum += ((current / 10) + (current % 10));
		}
		return String.valueOf((10 - (sum % 10)) % 10);
	}

	public static String JCB() {
		int length = 16;
		int firstNumber = random.nextInt(3589 - 3528) + 3528 + 1;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length - 5; i++) {
			stringBuilder.append(random.nextInt(10));
		}
		return stringBuilder
			.reverse()
			.insert(0, String.valueOf(firstNumber))
			.append(getCheckCode(stringBuilder.toString()))
			.toString();
	}

	public static String MasterCard() {
		int length = 16;
		int firstNumber = random.nextInt(55 - 51) + 51 + 1;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length - 3; i++) {
			stringBuilder.append(random.nextInt(10));
		}
		return stringBuilder
			.reverse()
			.insert(0, String.valueOf(firstNumber))
			.append(getCheckCode(stringBuilder.toString()))
			.toString();
	}

	public static String Visa() {
		int length = 16;
		int firstNumber = 4;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length - 2; i++) {
			stringBuilder.append(random.nextInt(10));
		}
		return stringBuilder
			.reverse()
			.insert(0, String.valueOf(firstNumber))
			.append(getCheckCode(stringBuilder.toString()))
			.toString();
	}

	public static String AmericanExpress() {
		int length = 15;
		int firstNumber = random.nextInt(2) == 0 ? 34 : 37;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length - 3; i++) {
			stringBuilder.append(random.nextInt(10));
		}
		return stringBuilder
			.reverse()
			.insert(0, String.valueOf(firstNumber))
			.append(getCheckCode(stringBuilder.toString()))
			.toString();
	}

	public static String ChinaUnionPay() {
		int length = 15;
		int firstNumber = 62;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < length - 3; i++) {
			stringBuilder.append(random.nextInt(10));
		}
		return stringBuilder
			.reverse()
			.insert(0, String.valueOf(firstNumber))
			.append(getCheckCode(stringBuilder.toString()))
			.toString();
	}
}

package com.ezrebclan.computerenglish;

public class Sentance {

	public String[] words;
	public Sentance(String sentance) {
		String[] words2 = breakApart(sentance, ' ');
		this.words = words2;
	}
	
	public static String[] breakApart(String sentance, char seperator) {
		char[] chars = sentance.toCharArray();
		if(chars[chars.length-1] != seperator) {
			char[] chars2 = new char[chars.length+1];
			for (int i = 0; i < chars.length; i++) {
				chars2[i] = chars[i];
			}
			chars2[chars.length] = seperator;
			chars = chars2;
		}
		String[] words = new String[0];
		int lastSpace = 0;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == seperator) {
				String[] words2 = new String[words.length+1];
				for (int j = 0; j < words.length; j++) {
					words2[j] = words[j];
				}
				char[] word = new char[i-lastSpace];
				int i3 = 0;
				for(int i2 = lastSpace; i2 < i; i2++) {
					char i4 = chars[i2];
					word[i3] = i4;
					i3++;
				}
				words2[words.length] = new String(word);
				words = words2;
				lastSpace = i+1;
			}
		}
		return words;
	}
	public static String[] breakIntoChunks(String sentance, String starter, String ender) {
		String[] chunks = new String[0];
		System.out.println(sentance.length());
		int start = -1;
		int end = 0;
		int ending = 0;
		String toBreak = new String(sentance);
		while(ending < sentance.length()) {
			if(start != -1) {
				toBreak = toBreak.substring(end);
			}
			start = toBreak.indexOf(starter);
			System.out.println();
			System.out.println();
			System.out.println("Original: "+toBreak);
			System.out.println("Start: "+start);
			System.out.println("With Start: "+toBreak.substring(start));
			end = toBreak.substring(start).indexOf(ender)+start+1;
			System.out.println("End: "+end);
			System.out.println("With End: "+toBreak.substring(start, end));
			String[] chunks2 = new String[chunks.length+1];
			for (int i = 0; i < chunks.length; i++) {
				chunks2[i] = chunks[i];
			}
			chunks2[chunks.length] = toBreak.substring(start, end);
			chunks = chunks2;
			ending += end;
			System.out.println(ending);
		}
		return chunks;
	}
}

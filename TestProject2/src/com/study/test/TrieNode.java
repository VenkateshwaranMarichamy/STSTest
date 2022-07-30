package com.study.test;

public class TrieNode {
	
	public char value;
	public boolean isWord;
	public TrieNode[] children= new TrieNode[26];
	
	
	public TrieNode() {
		
	}
	
//	TrieNode(char c){
//		TrieNode node = new TrieNode();
//		node.value= c;
//	}

	

}

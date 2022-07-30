package com.study.test;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
		//root.value= ' ';
	}

	public void insert(String word) {

		TrieNode ws = root;

		for(int i=0; i<word.length(); i++) {
			char c= word.charAt(i);
			if(ws.children[c-'a']==null)
				ws.children[c-'a']= new TrieNode();
			ws = ws.children[c-'a'];
		}
		ws.isWord=true;
		System.out.println("word inserted");
	}

	public boolean search(String word) {
		
		
			return dfs(0,root,word);

	}
	
	public boolean dfs(int index,TrieNode root, String word) {
		TrieNode ws = root;
		for(int i=index; i<word.length();i++) {
			char c= word.charAt(i);
			if(c == '.') {
			//	for(int j=0;j<ws.children.length; j++) {
				for(TrieNode child : ws.children ) {
					if(dfs(i+1,child,word)) {
						return true;
					}
					return false;
				}
			}
			if(ws.children[c-'a']==null)
				return false;
			ws=ws.children[c-'a'];
		}
		return ws.isWord;
	}

	public boolean prefix(String word) {

		TrieNode ws = root;

		for(int i=0; i<word.length();i++) {
			char c= word.charAt(i);
			if(ws.children[c-'a']==null)
				return false;
			ws=ws.children[c-'a'];
		}
		return true;

	}

	public static void main(String[] args) {

		Trie t = new Trie();
		t.insert("ballons");
		t.insert("apple");
		System.out.println(t.search(".pplee"));

	}

}

package com.example.guessthatanagram;

import java.util.ArrayList;

public class Trie {
	
	//sorts strings efficiently
	private leaf head = new leaf();
	public Trie()
	{
		
	}
	
	public void add(String s)
	{
		leaf hold = head;
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(hold.branches[c - 'a'] == null)
				hold.branches[c - 'a'] = new leaf();
			
			hold = hold.branches[c - 'a'];
		}
		
		hold.isWord = true;
	}
	
	public boolean contains(String s)
	{
		leaf hold = head;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(hold.branches[c - 'a'] == null)
				return false;
			
			hold = hold.branches[c - 'a'];
		}
		
		return true;
	}
	
	
	private class leaf
	{
		public leaf[] branches = new leaf[26];
		public boolean isWord = false;
		public leaf()
		{
			
		}
	}

}

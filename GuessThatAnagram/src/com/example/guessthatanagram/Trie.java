package com.example.guessthatanagram;

import java.util.HashMap;
import java.util.Map;

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
			
			if(!hold.branches.containsKey(c))
				hold.branches.put(c, new leaf());
			
			hold = hold.branches.get(c);
		}
		
		hold.isWord = true;
	}
	
	public boolean contains(String s)
	{
		leaf hold = head;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(!hold.branches.containsKey(c))
				return false;
			
			hold = hold.branches.get(c);
		}
		
		return hold.isWord;
	}
	
	
	private class leaf
	{
		public Map<Character, leaf> branches = new HashMap<Character, leaf>();
		public boolean isWord = false;
		public leaf() 
		{
			
		}
	}

}

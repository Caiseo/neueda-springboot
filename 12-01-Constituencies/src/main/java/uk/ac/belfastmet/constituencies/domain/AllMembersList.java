package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllMembersList {



	private ArrayList<Member> allMembers = new ArrayList<Member>();	

	public AllMembersList()
	{

	}

	public AllMembersList(ArrayList<Member> allMembers)
	{
		this.allMembers = allMembers;
	}


	public ArrayList<Member> getAllMembers()
	{
		return allMembers;
	}

	public void setAllMembers(ArrayList<Member> allMembers)
	{
		this.allMembers = allMembers;
	}



}



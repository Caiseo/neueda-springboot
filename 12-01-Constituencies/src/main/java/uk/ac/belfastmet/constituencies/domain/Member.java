package uk.ac.belfastmet.constituencies.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member {

	@JsonProperty("PersonId")
	private String personId;

	@JsonProperty("AffiliationId")
	private String affiliationId;

	@JsonProperty("MemberName")
	private String memberName;

	@JsonProperty("MemberFirstName")
	private String memberFirstName;

	@JsonProperty("MemberLastName")
	private String memberLastName;

	@JsonProperty("MemberSortName")
	private String memberSortName;

	@JsonProperty("PartyName")
	private String partyName;

	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;

	@JsonProperty("ConstituencyName")
	private String constituencyName;

	@JsonProperty("ConstituencyId")
	private String constituencyId;
	
	@JsonProperty("MemberImgUrl")
	private String image;



}

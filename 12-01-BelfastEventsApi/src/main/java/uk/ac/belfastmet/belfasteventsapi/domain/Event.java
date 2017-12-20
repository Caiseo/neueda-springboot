package uk.ac.belfastmet.belfasteventsapi.domain;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Event {

	private String identifier;
	private String url;
	private String title;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
	public Event() {
		super();
	}

	public Event(String identifier, String url, String title, Date startDate, Date endDate, String time, String venue,
			String venueUrl, String image, String audience, String theme, String cost, String content) {
		super();
		this.identifier = identifier;
		this.url = url;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.time = time;
		this.venue = venue;
		this.venueUrl = venueUrl;
		this.image = image;
		this.audience = audience;
		this.theme = theme;
		this.cost = cost;
		this.content = content;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getVenueUrl() {
		return venueUrl;
	}

	public void setVenueUrl(String venueUrl) {
		this.venueUrl = venueUrl;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
		
}
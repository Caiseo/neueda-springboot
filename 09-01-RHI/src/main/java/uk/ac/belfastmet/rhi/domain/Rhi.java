package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rhi {

	@Id
	@GeneratedValue

	private Integer boilerId;
	private String name;
	private String date;
	private String location;
	private String installation;
	private Integer capacity;
	private double payment;

	public Rhi() {
		super();
	}

	public Rhi(Integer boilerId, String name, String date, String location, String installation, Integer capacity,
			double payment) {
		super();
		this.boilerId = boilerId;
		this.name = name;
		this.date = date;
		this.location = location;
		this.installation = installation;
		this.capacity = capacity;
		this.payment = payment;
	}

	public Integer getBoilerId() {
		return boilerId;
	}

	public void setBoilerId(Integer boilerId) {
		this.boilerId = boilerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInstallation() {
		return installation;
	}

	public void setInstallation(String installation) {
		this.installation = installation;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}



}






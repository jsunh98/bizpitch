package org.wecancodeit.bizpitch.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class VentureCapital {

	@Id
	@GeneratedValue
	private Long venId;
	private String venName;
	private String venUserName;
	private String venPassword;
	private String city;
	private String venUrl;
	private String venEmail;
	private String numOfInvest; //number of investors 
	private String venMarketCap;
	@ManyToMany
	private Collection<Industry> industries;
	@OneToMany
	@JsonIgnore
	private Collection<Proposal> props;
	
	public VentureCapital() {}

	public VentureCapital(String venName, String venUserName, String venPassword, String city, String venUrl,
			String venEmail, String numOfInvest, String venMarketCap) {
		this.venName = venName;
		this.venUserName = venUserName;
		this.venPassword = venPassword;
		this.city = city;
		this.venUrl = venUrl;
		this.venEmail = venEmail;
		this.numOfInvest = numOfInvest;
		this.venMarketCap = venMarketCap;
		this.industries = new ArrayList<Industry>();
		this.props = new ArrayList<Proposal>();
	}

	public Long getVenId() {
		return venId;
	}

	public String getVenName() {
		return venName;
	}

	public String getVenUserName() {
		return venUserName;
	}

	public String getVenPassword() {
		return venPassword;
	}

	public String getCity() {
		return city;
	}

	public String getVenUrl() {
		return venUrl;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public String getNumOfInvest() {
		return numOfInvest;
	}

	public String getVenMarketCap() {
		return venMarketCap;
	}

	public Collection<Industry> getIndustries() {
		return industries;
	}

	public Collection<Proposal> getProps() {
		return props;
	}
	
	public void addIndustryToVen(Industry industry) {
		industries.add(industry);
	}
	
	public void removeIndustry(Industry industry) {
		industries.remove(industry);
	}
	
	public void addPropToVen(Proposal prop) {
		props.add(prop);
	}
	
	public void removeProp(Proposal prop) {
		props.remove(prop);
	}
}

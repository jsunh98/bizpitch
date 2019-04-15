package org.wecancodeit.bizpitch.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Proposal {

	@Id
	@GeneratedValue
	private Long propId;
	private String propName;
	private boolean status;
	private String capRequest; //capital being requested
	private String percOfOwn; //percentage of ownership
	private String startCost; //projected startup cost
	private String projMargin; //projected profit per sale
	private String projMarketCap; //projected market cap 
	private String ageDemo;
	private String worthDemo;
	@Lob
	private String propMission; 
	@Lob
	private String servProd; //actual service or product
	@Lob
	private String marketingPlan;
	@Lob
	private String earnProj; //projected scalable earnings with timeframes
	@Lob
	private String employProj; //projected scalable employees required with timeframes
	@Lob
	private String competition; // who are the industry competitors?
	@ManyToMany
	private Collection<VentureCapital> vens;
	@ManyToMany
	private Collection<Skill> skills;
	@ManyToMany
	private Collection<Industry> industries;
	@ManyToOne
	private Entrepreneur ent;
	
	public Proposal() {}

	public Proposal(String propName, String capRequest, String percOfOwn, String startCost, String projMargin,
			String projMarketCap, String ageDemo, String worthDemo, String propMission, String servProd,
			String marketingPlan, String earnProj, String employProj, String competition) {
		this.propName = propName;
		this.capRequest = capRequest;
		this.percOfOwn = percOfOwn;
		this.startCost = startCost;
		this.projMargin = projMargin;
		this.projMarketCap = projMarketCap;
		this.ageDemo = ageDemo;
		this.worthDemo = worthDemo;
		this.propMission = propMission;
		this.servProd = servProd;
		this.marketingPlan = marketingPlan;
		this.earnProj = earnProj;
		this.employProj = employProj;
		this.competition = competition;
		this.status = true;
		this.vens = new ArrayList<VentureCapital>();
		this.skills = new ArrayList<Skill>();
		this.industries = new ArrayList<Industry>();

	}

	public Long getPropId() {
		return propId;
	}

	public String getPropName() {
		return propName;
	}
	
	public boolean getStatus() {
		return status;
	}

	public String getCapRequest() {
		return capRequest;
	}

	public String getPercOfOwn() {
		return percOfOwn;
	}

	public String getStartCost() {
		return startCost;
	}

	public String getProjMargin() {
		return projMargin;
	}

	public String getProjMarketCap() {
		return projMarketCap;
	}

	public String getAgeDemo() {
		return ageDemo;
	}

	public String getWorthDemo() {
		return worthDemo;
	}

	public String getPropMission() {
		return propMission;
	}

	public String getServProd() {
		return servProd;
	}

	public String getMarketingPlan() {
		return marketingPlan;
	}

	public String getEarnProj() {
		return earnProj;
	}

	public String getEmployProj() {
		return employProj;
	}

	public String getCompetition() {
		return competition;
	}

	public Collection<VentureCapital> getVens() {
		return vens;
	}

	public Collection<Skill> getSkills() {
		return skills;
	}

	public Collection<Industry> getIndustries() {
		return industries;
	}

	public Entrepreneur getEnt() {
		return ent;
	}
	
	public void addVenToProposal(VentureCapital ven) {
		vens.add(ven);
	}
	
	public void removeVen(VentureCapital ven) {
		vens.remove(ven);
	}
	
	public void addSkillToProposal(Skill skill) {
		skills.add(skill);
	}
	
	public void removeSkill(Skill skill) {
		skills.remove(skill);
	}
	
	public void addIndustryToProposal(Industry industry) {
		industries.add(industry);
	}
	
	public void removeIndustry(Industry industry) {
		industries.remove(industry);
	}
	public void addEntToProposal(Entrepreneur ent) {
		this.ent = ent;
	}
	
	
}

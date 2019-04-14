package org.wecancodeit.bizpitch.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Entrepreneur {
	
	@Id
	@GeneratedValue
	private Long entId;
	private String entUserName;
	private String entPassword;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String email;
	private String jobTitle;
	@Lob
	private String background;
	@ManyToMany
	private Collection<Skill> skills;
	@ManyToMany
	private Collection<Industry> industries;
	@OneToMany
	private Collection<Proposal> props;
	
	private Entrepreneur() {}

	public Entrepreneur(String entUserName, String entPassword, String firstName, String lastName, String phoneNum,
			String email, String jobTitle, String background) {
		this.entUserName = entUserName;
		this.entPassword = entPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.jobTitle = jobTitle;
		this.background = background;
		this.skills = new ArrayList<Skill>();
		this.industries = new ArrayList<Industry>();
		this.props = new ArrayList<Proposal>();
	}

	public Collection<Industry> getIndustry() {
		return industries;
	}

	public Collection<Proposal> getProps() {
		return props;
	}

	public Long getEntId() {
		return entId;
	}

	public String getEntUserName() {
		return entUserName;
	}

	public String getEntPassword() {
		return entPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getBackground() {
		return background;
	}

	public Collection<Skill> getSkills() {
		return skills;
	}


	
	public void addSkillToEntrepreneur(Skill skill) {
		skills.add(skill);
	}
	
	public void addProposalToEntrepreneur(Proposal proposal) {
		props.add(proposal);
	}
	
	public void removeSkill(Skill skill) {
		skills.remove(skill);
	}
	
	public void removeProposal(Proposal proposal) {
		props.remove(proposal);
	}
	
	public void addIndustryToEntrepreneur(Industry industry) {
		industries.add(industry);
	}
	
	public void removeIndustry(Industry industry) {
		industries.remove(industry);
	}

}

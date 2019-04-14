package org.wecancodeit.bizpitch.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue
	private Long skillId;
	private String skillName;
	@ManyToMany(mappedBy="skills")
	@JsonIgnore
	private Collection<Entrepreneur> ents;
	@ManyToMany(mappedBy="skills")
	@JsonIgnore
	private Collection<Proposal> props;
	
	public Skill() {}

	public Skill(String skillName) {
		this.skillName = skillName;
		this.ents = new ArrayList<Entrepreneur>();
		this.props = new ArrayList<Proposal>();
		
	}

	public Long getSkillId() {
		return skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public Collection<Entrepreneur> getEnts() {
		return ents;
	}

	public Collection<Proposal> getProps() {
		return props;
	}
	
	public void addEntsToSkill(Entrepreneur ent) {
		ents.add(ent);
	}
	
	public void removeEnts(Entrepreneur ent) {
		ents.remove(ent);
	}
		
	public void addPropToSkill(Proposal prop) {
		props.add(prop);
	}
	
	public void removeProp(Proposal prop) {
		props.remove(prop);
	}
	
	

}

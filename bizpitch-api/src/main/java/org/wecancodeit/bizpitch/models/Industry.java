package org.wecancodeit.bizpitch.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Industry {

	@Id
	@GeneratedValue
	private Long indId;
	private String indName;
	@ManyToMany(mappedBy="industries")
	@JsonIgnore
	private Collection<Entrepreneur> ents;
	@ManyToMany(mappedBy="industries")
	private Collection<Proposal> props;
	@ManyToMany(mappedBy="industries")
	private Collection<VentureCapital> vens;
	
	public Industry() {}

	public Industry(String indName) {
		this.indName = indName;
		this.ents = new ArrayList<Entrepreneur>();
		this.props = new ArrayList<Proposal>();
		this.vens = new ArrayList<VentureCapital>();
	}

	public Long getIndId() {
		return indId;
	}

	public String getIndName() {
		return indName;
	}

	public Collection<Entrepreneur> getEnts() {
		return ents;
	}

	public Collection<Proposal> getProps() {
		return props;
	}

	public Collection<VentureCapital> getVens() {
		return vens;
	}
	
	public void addEntToIndustry(Entrepreneur ent) {
		ents.add(ent);
	}
	
	public void removeEnt(Entrepreneur ent) {
		ents.remove(ent);
	}
	
	public void addPropToIndustry(Proposal prop) {
		props.add(prop);
	}
	
	public void removeProp(Proposal prop) {
		props.remove(prop);
	}
	
	public void addVenToIndustry(VentureCapital ven) {
		vens.add(ven);
	}
	
	public void removeVen(VentureCapital ven) {
		vens.remove(ven);
	}
	
	
	
}

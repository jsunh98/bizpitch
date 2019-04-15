package org.wecancodeit.bizpitch.modeltests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.wecancodeit.bizpitch.models.Entrepreneur;
import org.wecancodeit.bizpitch.models.Industry;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.models.Skill;
import org.wecancodeit.bizpitch.models.VentureCapital;

public class ProposalTest {
	
	Proposal underTest = new Proposal("","","", null, null, null, null, null, null, null, null, null, null, null);
	Entrepreneur ent = new Entrepreneur("","","", null, null, null, null, null);
	Skill skill = new Skill("");
	Industry industry = new Industry("");
	VentureCapital ven = new VentureCapital("","","", null, null, null, null, null);
	
	@Test
	public void shouldAddEntToProp() {
		underTest.addEntToProposal(ent);
		Entrepreneur entFromDatabase = underTest.getEnt(); 
		assertThat(entFromDatabase, is(ent));
	}
	@Test
	public void shouldAddSkillToProp() {
		underTest.addSkillToProposal(skill);
		int length = underTest.getSkills().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveSkill() {
		underTest.addSkillToProposal(skill);
		underTest.removeSkill(skill);
		int length = underTest.getSkills().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddIndustryToProp() {
		underTest.addIndustryToProposal(industry);
		int length = underTest.getIndustries().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveIndustry() {
		underTest.addIndustryToProposal(industry);
		underTest.removeIndustry(industry);
		int length = underTest.getIndustries().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddVenToProp() {
		underTest.addVenToProposal(ven);
		int length = underTest.getVens().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveVen() {
		underTest.addVenToProposal(ven);
		underTest.removeVen(ven);
		int length = underTest.getVens().size();
		assertEquals(length, 0);
	}

}

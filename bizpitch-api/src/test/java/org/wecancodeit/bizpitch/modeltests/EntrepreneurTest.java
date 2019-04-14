package org.wecancodeit.bizpitch.modeltests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wecancodeit.bizpitch.models.Entrepreneur;
import org.wecancodeit.bizpitch.models.Industry;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.models.Skill;

public class EntrepreneurTest {
	
	Entrepreneur underTest = new Entrepreneur("","","", null, null, null, null, null);
	Skill skill = new Skill("");
	Industry industry = new Industry("");
	Industry industry2 = new Industry("");
	Proposal prop = new Proposal("","","", null, null, null, null, null, null, null, null, null, null, null);
	
	
	@Test
	public void shouldAddSkill() {
		underTest.addSkillToEntrepreneur(skill);
		int length = underTest.getSkills().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveSkill() {
		underTest.addSkillToEntrepreneur(skill);
		underTest.removeSkill(skill);
		int length = underTest.getSkills().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddIndustry() {
		underTest.addIndustryToEntrepreneur(industry);
		underTest.addIndustryToEntrepreneur(industry2);
		int length = underTest.getIndustry().size();
		assertEquals(length, 2);
	}
	@Test
	public void shouldRemoveIndustry() {
		underTest.addIndustryToEntrepreneur(industry);
		underTest.addIndustryToEntrepreneur(industry2);
		underTest.removeIndustry(industry);
		int length = underTest.getIndustry().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldAddProposal() {
		underTest.addProposalToEntrepreneur(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveProposal() {
		underTest.addProposalToEntrepreneur(prop);
		underTest.removeProposal(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 0);
	}
}

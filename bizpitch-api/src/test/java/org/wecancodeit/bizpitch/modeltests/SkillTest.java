package org.wecancodeit.bizpitch.modeltests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wecancodeit.bizpitch.models.Entrepreneur;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.models.Skill;

public class SkillTest {
	
	Skill underTest = new Skill("");
	Entrepreneur ent = new Entrepreneur("","","","","", null, null, null);
	Proposal prop = new Proposal("","","","", null, null, null, null, null, null, null, null, null, null);
	
	@Test
	public void shouldAddEntToSkill() {
		underTest.addEntsToSkill(ent);
		int length = underTest.getEnts().size();
		assertEquals(length, 1);
	}
	@Test 
	public void shouldRemoveEnt() {
		underTest.addEntsToSkill(ent);
		underTest.removeEnts(ent);
		int length = underTest.getEnts().size();
		assertEquals(length, 0);
	}
	@Test 
	public void shouldAddPropToSkill() {
		underTest.addPropToSkill(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveProp() {
		underTest.addPropToSkill(prop);
		underTest.removeProp(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 0);
	}

}

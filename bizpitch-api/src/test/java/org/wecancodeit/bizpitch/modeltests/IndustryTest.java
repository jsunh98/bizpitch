package org.wecancodeit.bizpitch.modeltests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wecancodeit.bizpitch.models.Entrepreneur;
import org.wecancodeit.bizpitch.models.Industry;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.models.VentureCapital;

public class IndustryTest {
	
	Industry underTest = new Industry("");
	Entrepreneur ent = new Entrepreneur("","","", null, null, null, null, null);
	Proposal prop = new Proposal("","","", null, null, null, null, null, null, null, null, null, null, null);
	VentureCapital ven = new VentureCapital("","","", null, null, null, null, null);
	
	@Test
	public void shouldAddEntToIndustry() {
		underTest.addEntToIndustry(ent);
		int length = underTest.getEnts().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveEnt() {
		underTest.addEntToIndustry(ent);
		underTest.removeEnt(ent);
		int length = underTest.getEnts().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddPropToIndustry() {
		underTest.addPropToIndustry(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 1);
	}
	@Test 
	public void shouldRemoveProp() {
		underTest.addPropToIndustry(prop);
		underTest.removeProp(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddVenToIndustry() {
		underTest.addVenToIndustry(ven);
		int length = underTest.getVens().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveVen() {
		underTest.addVenToIndustry(ven);
		underTest.removeVen(ven);
		int length = underTest.getVens().size();
		assertEquals(length, 0);
	}

}

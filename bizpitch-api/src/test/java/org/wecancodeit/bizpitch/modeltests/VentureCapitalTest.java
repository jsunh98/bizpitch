package org.wecancodeit.bizpitch.modeltests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.wecancodeit.bizpitch.models.Industry;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.models.VentureCapital;

public class VentureCapitalTest {
	
	VentureCapital underTest = new VentureCapital("","","","","", null, null, null);
	Proposal prop = new Proposal("","","","","", null, null, null, null, null, null, null, null, null);
	Industry industry = new Industry("");
	
	@Test
	public void shouldAddPropToVen() {
		underTest.addPropToVen(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveProp() {
		underTest.addPropToVen(prop);
		underTest.removeProp(prop);
		int length = underTest.getProps().size();
		assertEquals(length, 0);
	}
	@Test
	public void shouldAddIndToVen() {
		underTest.addIndustryToVen(industry);
		int length = underTest.getIndustries().size();
		assertEquals(length, 1);
	}
	@Test
	public void shouldRemoveInd() {
		underTest.addIndustryToVen(industry);
		underTest.removeIndustry(industry);
		int length = underTest.getIndustries().size();
		assertEquals(length, 0);
	}
	

}

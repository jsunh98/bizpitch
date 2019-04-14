package org.wecancodeit.bizpitch.repotests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.bizpitch.models.VentureCapital;
import org.wecancodeit.bizpitch.repositories.VentureCapitalRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class VentureCapitalRepoTest {
	
	@Resource
	private TestEntityManager entityManager;
	@Resource
	private VentureCapitalRepository venRepo;
	
	@Test
	public void shouldFindByVenName() {
		VentureCapital ven = venRepo.save(new VentureCapital("ACR Capital","","","","","","",""));
		Long venId = ven.getVenId();
		entityManager.persist(ven);
		entityManager.flush();
		entityManager.clear();
		Optional<VentureCapital> venToFind = venRepo.findById(venId);
		VentureCapital venFromDatabase = venRepo.findByVenName("ACR Capital");
		assertThat(venFromDatabase.getVenName(), is("ACR Capital"));
	}

}

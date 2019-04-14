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
import org.wecancodeit.bizpitch.models.Entrepreneur;
import org.wecancodeit.bizpitch.repositories.EntrepreneurRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class EntrepreneurRepoTest {
	
	@Resource
	private TestEntityManager entityManager;
	@Resource
	private EntrepreneurRepository entRepo;
	
	@Test
	public void shouldFindByLastName() {
		Entrepreneur ent = entRepo.save(new Entrepreneur("jsunh98","hochh22","jason","hochheiser","6143538151","jsunh98@gmail.com","dispatch","logistics"));
		Long entId = ent.getEntId();
		entityManager.persist(ent);
		entityManager.flush();
		entityManager.clear();
		Optional<Entrepreneur> entToFind = entRepo.findById(entId);
		Entrepreneur entFromDatabase = entRepo.findByLastName("hochheiser");
		assertThat(entFromDatabase.getLastName(), is("hochheiser"));
	}

}

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
import org.wecancodeit.bizpitch.models.Industry;
import org.wecancodeit.bizpitch.repositories.IndustryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class IndustryRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private IndustryRepository indRepo;
	
	@Test
	public void shoudFindByIndName() {
		Industry industry = indRepo.save(new Industry("logistics"));
		Long indId = industry.getIndId();
		entityManager.persist(industry);
		entityManager.flush();
		entityManager.clear();
		Optional<Industry> indToFind = indRepo.findById(indId);
		Industry indFromDatabase = indRepo.findByIndName("logistics");
		assertThat(indFromDatabase.getIndName(), is("logistics"));
	}
}

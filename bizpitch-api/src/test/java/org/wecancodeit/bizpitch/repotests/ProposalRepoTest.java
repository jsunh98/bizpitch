package org.wecancodeit.bizpitch.repotests;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.bizpitch.models.Proposal;
import org.wecancodeit.bizpitch.repositories.ProposalRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ProposalRepoTest {
	
	@Resource
	private EntityManager entityManager;
	@Resource
	private ProposalRepository propRepo;
	
	@Test
	public void shouldFindPropByPropName() {
		Proposal prop = propRepo.save(new Proposal("goFish","true","130000","20","30","2B","25-55","any",
				"make fishing easier","AI lures","social media","100k","5","none"));
		Long propId = prop.getPropId();
		entityManager.persist(prop);
		entityManager.flush();
		entityManager.clear();
		Optional<Proposal> propToFind = propRepo.findById(propId);
		Proposal propFromDatabase = propRepo.findByPropName("goFish");
		assertThat(propFromDatabase.getPropName(), is("goFish"));;
	}

}

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
import org.wecancodeit.bizpitch.models.Skill;
import org.wecancodeit.bizpitch.repositories.SkillRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class SkillRepoTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private SkillRepository skillRepo;
	
	@Test
	public void shouldFindBySkillName() {
		Skill skill = skillRepo.save(new Skill("engineering"));
		Long skillId = skill.getSkillId();
		entityManager.persist(skill);
		entityManager.flush();
		entityManager.clear();
		Optional<Skill> skillToFind = skillRepo.findById(skillId);
		Skill skillFromDatabase = skillRepo.findBySkillName("engineering");
		assertThat(skillFromDatabase.getSkillName(), is("engineering"));
		
	}
}

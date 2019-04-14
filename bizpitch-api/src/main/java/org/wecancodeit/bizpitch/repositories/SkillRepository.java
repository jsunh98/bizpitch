package org.wecancodeit.bizpitch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bizpitch.models.Skill;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long>{

	Skill findBySkillName(String string);

}

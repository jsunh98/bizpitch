package org.wecancodeit.bizpitch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bizpitch.models.Proposal;

@Repository
public interface ProposalRepository extends CrudRepository<Proposal, Long> {

	Proposal findByPropName(String string);

}

package org.wecancodeit.bizpitch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bizpitch.models.VentureCapital;

@Repository
public interface VentureCapitalRepository extends CrudRepository<VentureCapital, Long>{

	VentureCapital findByVenName(String string);

}

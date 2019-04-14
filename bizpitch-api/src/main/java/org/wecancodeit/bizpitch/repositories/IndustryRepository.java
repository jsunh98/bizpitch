package org.wecancodeit.bizpitch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bizpitch.models.Industry;

@Repository
public interface IndustryRepository extends CrudRepository<Industry, Long> {

	Industry findByIndName(String string);
	
	

}

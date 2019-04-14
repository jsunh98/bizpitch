package org.wecancodeit.bizpitch.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.bizpitch.models.Entrepreneur;

@Repository
public interface EntrepreneurRepository extends CrudRepository<Entrepreneur, Long>  {


	Entrepreneur findByLastName(String string);

	Entrepreneur findByEntUserName(String username);
	Entrepreneur findByEntPassword(String password);
}

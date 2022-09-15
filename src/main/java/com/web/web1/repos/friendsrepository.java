package com.web.web1.repos;

import com.web.web1.model.friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface friendsrepository extends JpaRepository<friends,Long> {
}

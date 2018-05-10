package me.ankit.zooplus.repositories;

import org.springframework.data.repository.CrudRepository;

import me.ankit.zooplus.Entity.Users;

public interface UserRepository extends CrudRepository<Users, Long> {

}

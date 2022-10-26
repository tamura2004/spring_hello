package com.example.demo.depository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Member;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}

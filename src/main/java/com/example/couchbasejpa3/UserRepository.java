package com.example.couchbasejpa3;

import org.springframework.data.couchbase.core.query.N1qlSecondaryIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@N1qlSecondaryIndexed(indexName="user_idx")
public interface UserRepository extends CouchbaseRepository<User, String> {

    List<UserVO> findByName(String name);
}

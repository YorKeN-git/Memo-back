package com.memo.dashboard.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.memo.dashboard.models.Memo;

public interface MemoRepository extends MongoRepository<Memo, String>{

}

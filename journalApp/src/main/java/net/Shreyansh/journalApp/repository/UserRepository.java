package net.Shreyansh.journalApp.repository;


import net.Shreyansh.journalApp.entity.JournalEntry;
import net.Shreyansh.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Stack;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);

    void deleteByUserName(String username);


}

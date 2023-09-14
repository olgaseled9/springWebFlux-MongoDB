package repository;


import model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Handles the database operation as create, read, update, delete an {@link User} object.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {


}

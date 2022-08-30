package practice.principle.singleresp;

//A separate class for handling persistence 
public class UserPersistenceService {

    private final Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}

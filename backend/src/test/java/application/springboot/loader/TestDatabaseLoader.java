package application.springboot.loader;

import application.springboot.entities.User;
import application.springboot.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Optional;

public class TestDatabaseLoader {

    @Resource
    private UserRepository userRepository;

    @Before
    public void beforeClass() throws Exception {
        this.userRepository = new UserRepository() {
            @Override
            public <S extends User> S save(S s) {
                return null;
            }

            @Override
            public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public Optional<User> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public Iterable<User> findAll() {
                return null;
            }

            @Override
            public Iterable<User> findAllById(Iterable<Integer> iterable) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(User user) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> iterable) {

            }

            @Override
            public void deleteAll(Iterable<? extends User> iterable) {

            }

            @Override
            public void deleteAll() {

            }
        };
    }

    @Test
    public void TestLoader() throws Exception {
        DatabaseLoader loader = new DatabaseLoader(this.userRepository);
        Assert.assertNotNull(loader);

        Assert.assertNotNull(loader.getUserRepository());
        Assert.assertEquals(0, this.userRepository.count());
        loader.run("Test");
    }
}


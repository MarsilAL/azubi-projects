package io.ideas.engineering.ioc.persistence;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class Datastore {

    private final Map<String, String> store = new ConcurrentHashMap<>();

    public Optional<String> findValue(String key) {
        return Optional.ofNullable(store.get(key));
    }

    public Optional<String> saveValue(String key, String value) {
        return Optional.ofNullable(this.store.put(key, value));
    }

    public boolean deleteValue(String key) {
        return store.remove(key) != null;
    }

}

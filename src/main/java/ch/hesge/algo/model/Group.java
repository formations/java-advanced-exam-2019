package ch.hesge.algo.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Group<T extends Super> {

    private final String name;
    private final Set<T> members;

    public Group(String name, Set<T> members) {
        this.name = name;
        this.members = members;
    }

    @SafeVarargs
    public Group(String name, T... member) {
        this.name = name;
        this.members = new HashSet<>(Arrays.asList(member));
    }

    public Set<T> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return 0;
    }
}

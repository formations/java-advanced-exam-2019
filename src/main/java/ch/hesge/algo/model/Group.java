package ch.hesge.algo.model;

import java.util.*;

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
        int power = 0;
        List<T> membersByPower = new ArrayList<>(members);
        membersByPower.sort(Comparator.comparing(Super::getPower));
        for (int i = 0; i < membersByPower.size(); i++) {
            double memberPower = ((double) membersByPower.get(i).getPower()) / (i + 1);
            power += Math.ceil(memberPower);
        }
        return power;
    }
}

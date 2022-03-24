package uz.pdp.apponlinemobileoperator.model;

import uz.pdp.apponlinemobileoperator.model.template.AbsInit;

import java.util.Set;

public class MobileCompany extends AbsInit {
    private String name;
    private Set<String> codes;
    private String callCenter; // 8110 1069

    public MobileCompany(String name, Set<String> codes, String callCenter) {
        this.name = name;
        this.codes = codes;
        this.callCenter = callCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCodes() {
        return codes;
    }

    public void setCodes(Set<String> codes) {
        this.codes = codes;
    }

    public String getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(String callCenter) {
        this.callCenter = callCenter;
    }

    @Override
    public String toString() {
        return "MobileCompany{" +
                "name='" + name + '\'' +
                ", codes=" + codes +
                ", callCenter='" + callCenter + '\'' +
                ", isActive=" + isActive() +
                ", id=" + getId() +
                '}';
    }
}

package uz.pdp.apponlinemobileoperator.model.template;

import java.util.UUID;

public abstract class AbsInit {
    private UUID id;
    private boolean isActive;

    public AbsInit() {
        this.id = UUID.randomUUID();
        this.isActive = true;
    }

    public UUID getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

package ru.fadesml.practise.smarthouse.entity.capability;

public class CapabilityException extends RuntimeException {
    private final Class<? extends Capability> capability;

    public CapabilityException(Class<? extends Capability> capability, String message) {
        super(message);
        this.capability = capability;
    }

    public Class<? extends Capability> getCapability() {
        return capability;
    }
}

package ru.fadesml.practise.smarthouse.entity.capability.speaker;

public interface PortableSpeaker extends Speaker {
    default boolean isMovable() {
        return true;
    }
}

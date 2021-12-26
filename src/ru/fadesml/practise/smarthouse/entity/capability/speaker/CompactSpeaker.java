package ru.fadesml.practise.smarthouse.entity.capability.speaker;

public interface CompactSpeaker extends Speaker {
    default boolean isMovable() {
        return false;
    }
}

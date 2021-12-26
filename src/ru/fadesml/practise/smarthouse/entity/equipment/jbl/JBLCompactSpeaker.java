package ru.fadesml.practise.smarthouse.entity.equipment.jbl;

import ru.fadesml.practise.smarthouse.entity.capability.speaker.CompactSpeaker;
import ru.fadesml.practise.smarthouse.entity.capability.speaker.volume.Volume;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

public class JBLCompactSpeaker extends Equipment implements CompactSpeaker {
    private Volume volume;

    @Override
    public Volume getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(Volume volume) {
        this.volume = volume;
    }
}

package ru.fadesml.practise.smarthouse.entity.capability.speaker.volume;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;
import ru.fadesml.practise.smarthouse.entity.capability.CapabilityException;

public class VolumeRangeException extends CapabilityException {
    public VolumeRangeException(Class<? extends Capability> clazz, Integer value) {
        super(clazz, "Volume range error min = " + Volume.minValue + ", max = " + Volume.maxValue + ", your = " + value);
    }
}

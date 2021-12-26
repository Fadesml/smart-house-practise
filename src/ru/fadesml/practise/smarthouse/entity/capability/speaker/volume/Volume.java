package ru.fadesml.practise.smarthouse.entity.capability.speaker.volume;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;

public class Volume implements Capability {
    public static final Integer minValue = 0;
    public static final Integer maxValue = 100;

    private final Integer value;

    public Volume(Integer value) {
        if (value < minValue || value > maxValue) {
            throw new VolumeRangeException(Volume.class, value);
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

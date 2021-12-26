package ru.fadesml.practise.smarthouse.entity.capability.light.rgb;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;

public class RGBValue implements Capability {
    public static final Integer minValue = 0;
    public static final Integer maxValue = 255;

    private final Integer value;

    public RGBValue(Integer value) {
        if (value < minValue || value > maxValue) {
            throw new RGBRangeException(RGBValue.class, value);
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

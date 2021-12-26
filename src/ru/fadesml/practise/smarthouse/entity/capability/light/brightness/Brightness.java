package ru.fadesml.practise.smarthouse.entity.capability.light.brightness;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBRangeException;

public class Brightness implements Capability {
    public static final Integer minValue = 0;
    public static final Integer maxValue = 10;

    private final Integer value;

    public Brightness(Integer value) {
        if (value < minValue || value > maxValue) {
            throw new RGBRangeException(Brightness.class, value);
        }
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

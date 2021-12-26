package ru.fadesml.practise.smarthouse.entity.capability.light.rgb;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;
import ru.fadesml.practise.smarthouse.entity.capability.CapabilityException;

public class RGBRangeException extends CapabilityException {
    public RGBRangeException(Class<? extends Capability> clazz, Integer value) {
        super(clazz, "RGB range error min = " + RGBValue.minValue + ", max = " + RGBValue.maxValue + ", your = " + value);
    }
}

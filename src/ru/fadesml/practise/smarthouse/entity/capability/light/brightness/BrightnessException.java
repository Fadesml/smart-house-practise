package ru.fadesml.practise.smarthouse.entity.capability.light.brightness;

import ru.fadesml.practise.smarthouse.entity.capability.Capability;
import ru.fadesml.practise.smarthouse.entity.capability.CapabilityException;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBValue;

public class BrightnessException extends CapabilityException {
    public BrightnessException(Class<? extends Capability> clazz, Integer value) {
        super(clazz, "Brightness range error min = " + RGBValue.minValue + ", max = " + RGBValue.maxValue + ", your = " + value);
    }
}

package ru.fadesml.practise.smarthouse.entity.capability.light;

import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBValue;

import java.util.Map;

public interface NeonLight {
    Map<RGBKey, RGBValue> getColor();
}

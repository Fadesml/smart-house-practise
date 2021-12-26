package ru.fadesml.practise.smarthouse.entity.capability.light;

import ru.fadesml.practise.smarthouse.entity.capability.light.brightness.Brightness;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;

public interface BasicLight {
    RGBKey getColor();

    Brightness getBrightness();

    void setBrightness(Brightness brightness);
}

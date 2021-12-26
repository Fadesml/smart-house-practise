package ru.fadesml.practise.smarthouse.entity.capability.light;

import ru.fadesml.practise.smarthouse.entity.capability.light.brightness.Brightness;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBValue;

import java.util.Map;

public interface RGBLight {
    Map<RGBKey, RGBValue> getColor();

    void setColor(Map<RGBKey, RGBValue> color);

    Brightness getBrightness();

    void setBrightness(Brightness brightness);
}

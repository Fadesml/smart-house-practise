package ru.fadesml.practise.smarthouse.entity.equipment.arduino;

import ru.fadesml.practise.smarthouse.entity.capability.light.RGBLight;
import ru.fadesml.practise.smarthouse.entity.capability.light.brightness.Brightness;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBValue;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

import java.util.Map;

public class ArduinoRGBLamp extends Equipment implements RGBLight {
    private Map<RGBKey, RGBValue> color;
    private Brightness brightness;

    @Override
    public Map<RGBKey, RGBValue> getColor() {
        return Map.copyOf(color);
    }

    @Override
    public void setColor(Map<RGBKey, RGBValue> color) {
        this.color = color;
    }

    @Override
    public Brightness getBrightness() {
        return this.brightness;
    }

    @Override
    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }
}

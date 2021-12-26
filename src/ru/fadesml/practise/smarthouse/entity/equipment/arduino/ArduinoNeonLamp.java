package ru.fadesml.practise.smarthouse.entity.equipment.arduino;

import ru.fadesml.practise.smarthouse.entity.capability.light.NeonLight;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBValue;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

import java.util.Map;

public class ArduinoNeonLamp extends Equipment implements NeonLight {
    private final Map<RGBKey, RGBValue> color;

    public ArduinoNeonLamp(Map<RGBKey, RGBValue> color) {
        this.color = color;
    }

    @Override
    public Map<RGBKey, RGBValue> getColor() {
        return Map.copyOf(color);
    }
}

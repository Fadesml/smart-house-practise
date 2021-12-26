package ru.fadesml.practise.smarthouse.entity.equipment.arduino;

import ru.fadesml.practise.smarthouse.entity.capability.light.BasicLight;
import ru.fadesml.practise.smarthouse.entity.capability.light.brightness.Brightness;
import ru.fadesml.practise.smarthouse.entity.capability.light.rgb.RGBKey;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

public class ArduinoLamp extends Equipment implements BasicLight {
    private final RGBKey color;
    private Brightness brightness;

    public ArduinoLamp(RGBKey color, Brightness brightness) {
        this.color = color;
        this.brightness = brightness;
    }

    @Override
    public RGBKey getColor() {
        return this.color;
    }

    @Override
    public Brightness getBrightness() {
        return brightness;
    }

    @Override
    public void setBrightness(Brightness brightness) {
        this.brightness = brightness;
    }
}

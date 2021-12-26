package ru.fadesml.practise.smarthouse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class House {
    private Long id;
    private List<Room> rooms;

    public List<Equipment> getEquipment() {
        List<Equipment> equipment = new ArrayList<>();

        rooms.forEach(item -> equipment.addAll(item.getEquipment()));

        return equipment;
    }
}

package ru.fadesml.practise.smarthouse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.fadesml.practise.smarthouse.entity.equipment.Equipment;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Room {
    private Long id;
    private RoomType type;

    private List<Equipment> equipment;

    private int length;
    private int width;
    private int height;
}

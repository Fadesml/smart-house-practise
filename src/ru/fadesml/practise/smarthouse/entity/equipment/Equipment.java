package ru.fadesml.practise.smarthouse.entity.equipment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Equipment {
    protected Long id;
    protected EquipmentType type;
    protected boolean isEnabled;
}

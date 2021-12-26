package ru.fadesml.practise.smarthouse.entity.capability.speaker;

import ru.fadesml.practise.smarthouse.entity.capability.speaker.volume.Volume;

public interface Speaker {
    Volume getVolume();

    void setVolume(Volume volume);
}

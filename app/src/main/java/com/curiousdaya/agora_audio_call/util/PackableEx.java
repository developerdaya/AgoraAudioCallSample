package com.curiousdaya.agora_audio_call.util;

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}

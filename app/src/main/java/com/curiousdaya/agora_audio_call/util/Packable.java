package com.curiousdaya.agora_audio_call.util;

public interface Packable {
    ByteBuf marshal(ByteBuf out);
}

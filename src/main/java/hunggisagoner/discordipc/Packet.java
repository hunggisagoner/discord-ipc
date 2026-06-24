package hunggisagoner.discordipc;

import com.google.gson.JsonObject;

import hunggisagoner.discordipc.Opcode;

public record Packet(Opcode opcode, JsonObject data) {
}

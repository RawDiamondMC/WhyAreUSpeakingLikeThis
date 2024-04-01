package io.github.rawdiamondmc.wauslt.client;

import io.github.rawdiamondmc.wauslt.Utils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;

public class WhyAreUSpeakingLikeThisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSendMessageEvents.MODIFY_CHAT.register((Utils::reverse));
    }
}

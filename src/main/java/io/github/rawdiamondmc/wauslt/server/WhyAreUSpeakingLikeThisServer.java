package io.github.rawdiamondmc.wauslt.server;

import io.github.rawdiamondmc.wauslt.Utils;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent;
import net.minecraft.text.Text;

public class WhyAreUSpeakingLikeThisServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        ServerMessageDecoratorEvent.EVENT.register(ServerMessageDecoratorEvent.CONTENT_PHASE, (sender, message) -> Text.of(Utils.reverse(message.getString())));
    }
}

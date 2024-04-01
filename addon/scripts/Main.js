import { world } from "@minecraft/server";

world.beforeEvents.chatSend.subscribe((event) => {
    const message = event.message;
    const player = event.sender;
    event.cancel = true;
    player.sendMessage(reverse(message));
});

function reverse(str) {
    return str.split('').reverse().join('');
}
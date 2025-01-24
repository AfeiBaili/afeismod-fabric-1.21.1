package online.afeibaili.afeismod;

import net.fabricmc.api.ClientModInitializer;

public class AfeisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AfeisMod.LOGGER.info("我是客户端类的初始化消息！！");
    }
}

package online.afeibaili.afeismod;

import net.fabricmc.api.ClientModInitializer;
import online.afeibaili.afeismod.group.AGroup;
import online.afeibaili.afeismod.item.AItems;

public class AfeisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AfeisMod.LOGGER.info("我是客户端类的初始化消息！！");
        AItems.registerItems();     //第一加载
        AGroup.registerGroups();    //第二加载
    }
}

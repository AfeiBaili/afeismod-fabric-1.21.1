package online.afeibaili.afeismod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import online.afeibaili.afeismod.AfeisMod;

import java.util.ArrayList;
import java.util.List;

public class AItems {

    public static final List<Item> ITEM_LIST = new ArrayList<>();

    public static final Item FROST_SAPPHIRE = registerItem("frost_sapphire",
            new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
        ITEM_LIST.add(item);
        return Registry.register(Registries.ITEM,
                Identifier.of(AfeisMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        AfeisMod.LOGGER.info("正在加载物品");
    }
}

package online.afeibaili.afeismod.group;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import online.afeibaili.afeismod.AfeisMod;
import online.afeibaili.afeismod.item.AItems;

public class AGroup {

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AItems.FROST_SAPPHIRE))
            .displayName(Text.translatable("itemgroup.afeismod.itemgroup"))
            .entries((context, entries) ->
                    AItems.ITEM_LIST.forEach(entries::add))
            .build();

    public static void registerGroups() {
        AfeisMod.LOGGER.info("正在创建物品组");
        Registry.register(Registries.ITEM_GROUP,
                Identifier.of(AfeisMod.MOD_ID, "itemgroup"),
                ITEM_GROUP);
    }
}

package net.shosomething.disintegrity.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shosomething.disintegrity.Disintegrity;
import net.shosomething.disintegrity.block.ModBlocks;

public class ItemGroups {
    public static final ItemGroup NADIUM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Disintegrity.MOD_ID, "nadium_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.NADIUM_CRYSTAL))
                    .displayName(Text.translatable("itemgroup.disintegrity.nadium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NADIUM_CRYSTAL);
                        entries.add(ModBlocks.NADIUM_BLOCK);
                    })

            .build());

    public static void registerItemGroups() {
        Disintegrity.LOGGER.info("Registering item groups ("+Disintegrity.MOD_ID+")");
    }

}

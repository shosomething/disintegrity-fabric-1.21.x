package net.shosomething.disintegrity.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shosomething.disintegrity.Disintegrity;

public class ModItems {
    //ITEMS!
    public static final Item NADIUM_CRYSTAL = registerItem("nadium_crystal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Disintegrity.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Disintegrity.LOGGER.info("Registering moditems ("+Disintegrity.MOD_ID+")...");

        //ingredients
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(NADIUM_CRYSTAL);
        });
    }

}

package net.shosomething.disintegrity.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.shosomething.disintegrity.Disintegrity;

public class ModBlocks {

    //blocks
    public static final Block NADIUM_BLOCK = registerBlock("nadium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(value -> 3))
    );

    public static final Block EXP_BLOCK = registerBlock("exp_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(27,99),
                    AbstractBlock.Settings.create().strength(1f)
                            .breakInstantly()
                            .sounds(BlockSoundGroup.COBWEB)


    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(Disintegrity.MOD_ID, name),block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Disintegrity.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

        Disintegrity.LOGGER.info("Registering blocks ("+Disintegrity.MOD_ID+")...");


        //building blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.EXP_BLOCK);
        });

    }

}

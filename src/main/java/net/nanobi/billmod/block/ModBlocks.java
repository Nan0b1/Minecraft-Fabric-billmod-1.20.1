package net.nanobi.billmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nanobi.billmod.Billmod;

public class ModBlocks {
    public static Block URANIUM_BLOCK = registerblock("uranium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerblock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Billmod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Billmod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public  static void registerModBlocks() {
        Billmod.LOGGER.info("registering ModBlocks for " + Billmod.MOD_ID);
    }
}

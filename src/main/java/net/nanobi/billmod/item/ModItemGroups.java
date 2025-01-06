package net.nanobi.billmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nanobi.billmod.Billmod;
import net.nanobi.billmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GRAVITY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Billmod.MOD_ID, "gravity"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gravity"))
                    .icon(() -> new ItemStack(ModItems.URANIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM);
                        entries.add(ModItems.URANIUM_INGOT);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                    }).build());


    public static void registerItemGroups(){
        Billmod.LOGGER.info("Registering Iten Groups");
    }
}

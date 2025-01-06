package net.nanobi.billmod;

import net.fabricmc.api.ClientModInitializer;
import net.nanobi.billmod.item.ModItemGroups;
import net.nanobi.billmod.item.ModItems;

public class BillmodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}

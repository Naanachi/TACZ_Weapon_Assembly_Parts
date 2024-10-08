package net.rabbichi.TACZWeaponAssemblyParts.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rabbichi.TACZWeaponAssemblyParts.TACZWeaponAssemblyParts;

public class Moditems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TACZWeaponAssemblyParts.MOD_ID);


    // Receivers
    public static final RegistryObject<Item> RECEIVERLIGHT = ITEMS.register("receiverlight",
            () -> new Item(new Item.Properties())); // Light Receiver (SMGs-pistols, revolvers)
    public static final RegistryObject<Item> RECEIVERMEDIUM = ITEMS.register("receivermedium",
            () -> new Item(new Item.Properties())); // Medium Receiver (ARs)
    public static final RegistryObject<Item> RECEIVERHEAVY = ITEMS.register("receiverheavy",
            () -> new Item(new Item.Properties())); // Heavy Receiver (LMGs, Snipers, explosives)


    // Frames
    public static final RegistryObject<Item> FRAMESMALL = ITEMS.register("framesmall",
            () -> new Item(new Item.Properties())); // Sm Frame
    public static final RegistryObject<Item> FRAMEMEDIUM = ITEMS.register("framemedium",
            () -> new Item(new Item.Properties())); // Med Frame
    public static final RegistryObject<Item> FRAMELARGE = ITEMS.register("framelarge",
            () -> new Item(new Item.Properties())); // Lar Frame

    // Stock
    public static final RegistryObject<Item> STOCK = ITEMS.register("stock",
            () -> new Item(new Item.Properties())); // Stock

    // Barrel
    public static final RegistryObject<Item> BARREL = ITEMS.register("barrel",
            () -> new Item(new Item.Properties())); // Barrel



    public  static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

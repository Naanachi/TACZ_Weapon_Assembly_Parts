package net.rabbichi.TACZWeaponAssemblyParts.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rabbichi.TACZWeaponAssemblyParts.TACZWeaponAssemblyParts;

import java.rmi.registry.Registry;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TACZWeaponAssemblyParts.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TACZ_AP_TAB = CREATIVE_MODE_TABS.register("tacz_ap_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.RECEIVERLIGHT.get()))
                    .title(Component.translatable("creativetab.tacz_ap_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.RECEIVERLIGHT.get());
                        output.accept(Moditems.RECEIVERMEDIUM.get());
                        output.accept(Moditems.RECEIVERHEAVY.get());
                        output.accept(Moditems.FRAMESMALL.get());
                        output.accept(Moditems.FRAMEMEDIUM.get());
                        output.accept(Moditems.FRAMELARGE.get());
                        output.accept(Moditems.STOCK.get());
                        output.accept(Moditems.BARREL.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

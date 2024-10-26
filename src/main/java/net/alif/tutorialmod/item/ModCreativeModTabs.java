package net.alif.tutorialmod.item;

import net.alif.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static void  register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB =
            CREATIVE_MOD_TABS.register("tutorial_tab", () -> CreativeModeTab.builder().icon(
                    () -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creative.tutorial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.RAW_SAPPHIRE.get());
                    })
                    .build());
}

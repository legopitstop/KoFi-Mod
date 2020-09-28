package com.legopitstop.kofimod.init;

import com.legopitstop.kofimod.KoFiMod;
import com.legopitstop.kofimod.item.KoFiBannerPatternItem;
import com.legopitstop.kofimod.item.KoFiMug;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class KoFiItems {
    // Register Items
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KoFiMod.MOD_ID);

    // Items
    public static final RegistryObject<KoFiMug> KOFI_MUG = ITEMS.register("kofi_mug", KoFiMug::new);
    public static final RegistryObject<KoFiBannerPatternItem> KOFI_BANNER_PATTERN = ITEMS.register("kofi_banner_pattern", KoFiBannerPatternItem::new);
}

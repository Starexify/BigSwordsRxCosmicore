package net.nova.big_swords_addon;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.nova.big_swords_addon.data.DataGenerators;
import net.nova.big_swords_addon.init.BCItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.nova.big_swords_addon.BigSwordsRAddon.MODID;

@Mod(MODID)
public class BigSwordsRAddon {
    public static final String MODID = "big_swords_addon";
    public static final Logger logger = LoggerFactory.getLogger(BigSwordsRAddon.class);

    public BigSwordsRAddon(IEventBus bus) {
        BCItems.ITEMS.register(bus);

        bus.addListener(DataGenerators::gatherData);
    }

    // Util
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}

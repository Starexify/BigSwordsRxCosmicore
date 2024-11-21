package net.nova.bsrxcc;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.nova.bsrxcc.data.DataGenerators;
import net.nova.bsrxcc.init.BCItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.nova.bsrxcc.BSRxCC.MODID;

@Mod(MODID)
public class BSRxCC {
    public static final String MODID = "bsrxcc";
    public static final Logger logger = LoggerFactory.getLogger(BSRxCC.class);

    public BSRxCC(IEventBus bus) {
        BCItems.ITEMS.register(bus);

        bus.addListener(DataGenerators::gatherData);
    }

    // Util
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}

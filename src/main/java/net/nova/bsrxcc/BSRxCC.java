package net.nova.bsrxcc;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.nova.bsrxcc.init.BCItems;

import static net.nova.bsrxcc.BSRxCC.MODID;

@Mod(MODID)
public class BSRxCC {
    public static final String MODID = "bsrxcc";

    public BSRxCC(IEventBus bus) {
        BCItems.ITEMS.register(bus);
    }
}

package net.nova.bsrxcc.data.models;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

import static net.nova.bsrxcc.BSRxCC.MODID;

public class BCModelProvider extends ModelProvider {
    public BCModelProvider(PackOutput output) {
        super(output, MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        new BCItemModelGenerator(itemModels.itemModelOutput, itemModels.modelOutput).run();
    }
}

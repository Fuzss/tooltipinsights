package fuzs.tooltipinsights.fabric.impl;

import fuzs.tooltipinsights.common.impl.TooltipInsights;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class TooltipInsightsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(TooltipInsights.MOD_ID, TooltipInsights::new);
    }
}

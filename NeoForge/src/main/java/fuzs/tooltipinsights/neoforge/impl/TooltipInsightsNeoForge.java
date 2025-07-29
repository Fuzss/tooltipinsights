package fuzs.tooltipinsights.neoforge.impl;

import fuzs.tooltipinsights.impl.TooltipInsights;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.neoforged.fml.common.Mod;

@Mod(TooltipInsights.MOD_ID)
public class TooltipInsightsNeoForge {

    public TooltipInsightsNeoForge() {
        ModConstructor.construct(TooltipInsights.MOD_ID, TooltipInsights::new);
    }
}

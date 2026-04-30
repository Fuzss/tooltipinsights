package fuzs.tooltipinsights.fabric.impl.client;

import fuzs.tooltipinsights.common.impl.TooltipInsights;
import fuzs.tooltipinsights.common.impl.client.TooltipInsightsClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class TooltipInsightsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(TooltipInsights.MOD_ID, TooltipInsightsClient::new);
    }
}

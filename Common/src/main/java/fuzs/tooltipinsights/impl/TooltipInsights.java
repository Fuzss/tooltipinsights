package fuzs.tooltipinsights.impl;

import fuzs.puzzleslib.api.core.v1.ModConstructor;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooltipInsights implements ModConstructor {
    public static final String MOD_ID = "tooltipinsights";
    public static final String MOD_NAME = "Tooltip Insights";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}

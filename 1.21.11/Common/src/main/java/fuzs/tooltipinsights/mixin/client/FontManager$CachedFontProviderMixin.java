package fuzs.tooltipinsights.mixin.client;

import fuzs.tooltipinsights.impl.client.gui.font.SpacedGlyphProvider;
import fuzs.tooltipinsights.impl.network.chat.contents.objects.SpacedSprite;
import net.minecraft.client.gui.GlyphSource;
import net.minecraft.network.chat.FontDescription;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.client.gui.font.FontManager$CachedFontProvider")
abstract class FontManager$CachedFontProviderMixin {

    @Inject(method = "getGlyphSource", at = @At("HEAD"), cancellable = true)
    private void getGlyphSource(FontDescription fontDescription, CallbackInfoReturnable<GlyphSource> callback) {
        if (fontDescription instanceof SpacedSprite.Description(int width)) {
            callback.setReturnValue(SpacedGlyphProvider.getGlyphSource(width));
        }
    }
}

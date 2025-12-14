package fuzs.tooltipinsights.impl.client.gui.font;

import com.mojang.blaze3d.font.GlyphInfo;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.gui.GlyphSource;
import net.minecraft.client.gui.font.SingleSpriteSource;
import net.minecraft.client.gui.font.TextRenderable;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.network.chat.Style;
import org.jspecify.annotations.Nullable;

public final class SpacedGlyphProvider {
    private static final Int2ObjectMap<GlyphSource> GLYPH_SOURCE_CACHE = new Int2ObjectArrayMap<>();

    private SpacedGlyphProvider() {
        // NO-OP
    }

    public static GlyphSource getGlyphSource(int width) {
        return GLYPH_SOURCE_CACHE.computeIfAbsent(width, SpacedGlyphProvider::createGlyphSource);
    }

    private static GlyphSource createGlyphSource(int width) {
        return new SingleSpriteSource(new SimpleBakedGlyph(width));
    }

    private record SimpleBakedGlyph(GlyphInfo glyphInfo) implements BakedGlyph {

        private SimpleBakedGlyph(int width) {
            this(GlyphInfo.simple(width));
        }

        @Override
        public GlyphInfo info() {
            return this.glyphInfo;
        }

        @Override
        public TextRenderable.@Nullable Styled createGlyph(float x, float y, int color, int shadowColor, Style style, float boldOffset, float shadowOffset) {
            return null;
        }
    }
}

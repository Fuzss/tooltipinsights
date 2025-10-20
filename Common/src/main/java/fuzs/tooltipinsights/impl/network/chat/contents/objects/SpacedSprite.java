package fuzs.tooltipinsights.impl.network.chat.contents.objects;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.chat.FontDescription;
import net.minecraft.network.chat.contents.objects.ObjectInfo;
import net.minecraft.util.ExtraCodecs;

public record SpacedSprite(int width) implements ObjectInfo {
    public static final MapCodec<SpacedSprite> MAP_CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                    ExtraCodecs.NON_NEGATIVE_INT.fieldOf("width").forGetter(SpacedSprite::width))
            .apply(instance, SpacedSprite::new));

    @Override
    public FontDescription fontDescription() {
        return new Description(this.width);
    }

    @Override
    public String description() {
        return "[" + this.width + "px space]";
    }

    @Override
    public MapCodec<? extends ObjectInfo> codec() {
        return MAP_CODEC;
    }

    public record Description(int width) implements FontDescription {

    }
}

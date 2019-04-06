package com.wade.adam.pattern.flyweight.wiki;

import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.*;

public final class FontData {

    /*
       A weak hash map will drop unused references to FontData.
       Values ​​have to be wrapped in WeakReferences,
       because value objects in weak hash map are held by strong references.
    */

    private static final WeakHashMap<FontData, WeakReference<FontData>> flyweightData = new WeakHashMap<>();
    private final int pointSize;
    private final String fontFace;
    private final Color color;
    private final Set<FontEffect> effects;

    public FontData(int pointSize, String fontFace, Color color, EnumSet<FontEffect> effects) {
        this.pointSize = pointSize;
        this.fontFace = fontFace;
        this.color = color;
        this.effects = Collections.unmodifiableSet(effects);
    }

    public static FontData create(int pointSize, String fontFace, Color color, FontEffect... effects) {
        EnumSet<FontEffect> effectsSet = EnumSet.noneOf(FontEffect.class);
        effectsSet.addAll(Arrays.asList(effects));

        // We are unconcerned with object creation cost, we are reducing overall memory consumption
        FontData data = new FontData(pointSize, fontFace, color, effectsSet);
        if (!flyweightData.containsKey(data)) {
            flyweightData.put(data, new WeakReference(data));
        }
        // return the single immutable copy with the given values
        return flyweightData.get(data).get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FontData fontData = (FontData) o;
        return pointSize == fontData.pointSize &&
                Objects.equals(fontFace, fontData.fontFace) &&
                Objects.equals(color, fontData.color) &&
                Objects.equals(effects, fontData.effects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointSize, fontFace, color, effects);
    }

    public static WeakHashMap<FontData, WeakReference<FontData>> getFlyweightData() {
        return flyweightData;
    }

    public int getPointSize() {
        return pointSize;
    }

    public String getFontFace() {
        return fontFace;
    }

    public Color getColor() {
        return color;
    }

    public Set<FontEffect> getEffects() {
        return effects;
    }
}

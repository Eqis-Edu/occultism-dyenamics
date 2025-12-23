package com.eqisedu.occultism_dyenamics.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.IntValue;

public class OccultismDyenamicsClientConfig {

    public final VisualSettings visuals;
    public final ModConfigSpec spec;

    public OccultismDyenamicsClientConfig() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();
        this.visuals = new VisualSettings(builder);
        this.spec = builder.build();
    }

    public static class VisualSettings {

        public final IntValue honeyChalkGlyphColor;
        public final IntValue icyBlueChalkGlyphColor;
        public final IntValue amberChalkGlyphColor;
        public final IntValue mintChalkGlyphColor;
        public final IntValue lavenderChalkGlyphColor;
        public final IntValue navyChalkGlyphColor;
        public final IntValue bubblegumChalkGlyphColor;
        public final IntValue coniferChalkGlyphColor;
        public final IntValue ultramarineChalkGlyphColor;
        public final IntValue maroonChalkGlyphColor;
        public final IntValue wineChalkGlyphColor;
        public final IntValue roseChalkGlyphColor;
        public final IntValue fluorescentChalkGlyphColor;
        public final IntValue springGreenChalkGlyphColor;
        public final IntValue peachChalkGlyphColor;
        public final IntValue cherenkovChalkGlyphColor;
        public final IntValue aquamarineChalkGlyphColor;
        public final IntValue persimmonChalkGlyphColor;



        public VisualSettings(ModConfigSpec.Builder builder) {
            builder.comment("Visual Settings").push("visual");

            this.honeyChalkGlyphColor = builder.comment(
                    "The integer code of the color of the honey chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("honeyChalkGlyphColor", 0xf9ad44, 0, 0xffffff);

            this.mintChalkGlyphColor = builder.comment(
                    "The integer code of the color of the mint chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("mintChalkGlyphColor", 0x79d0a6, 0, 0xffffff);

            this.lavenderChalkGlyphColor = builder.comment(
                    "The integer code of the color of the lavender chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("lavenderChalkGlyphColor", 0xc287e3, 0, 0xffffff);

            this.navyChalkGlyphColor = builder.comment(
                    "The integer code of the color of the navy chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("navyChalkGlyphColor", 0x1a2568, 0, 0xffffff);

            this.bubblegumChalkGlyphColor = builder.comment(
                    "The integer code of the color of the bubblegum chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("bubblegumChalkGlyphColor", 0xd43891, 0, 0xffffff);

            this.amberChalkGlyphColor = builder.comment(
                    "The integer code of the  color of the amber chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("amberChalkGlyphColor", 0xd07219,0, 0xffffff);

            this.coniferChalkGlyphColor = builder.comment(
                    "The integer code of the color of the conifer chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("coniferChalkGlyphColor", 0xa8d754, 0, 0xffffff);

            this.icyBlueChalkGlyphColor = builder.comment(
                    "The integer code of the color of the icy blue chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("icyBlueChalkGlyphColor", 0x9ce7fc, 0, 0xffffff);

            this.ultramarineChalkGlyphColor = builder.comment(
                    "The integer code of the color of the ultramarine chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("ultramarineChalkGlyphColor", 0x4c4dfc, 0, 0xffffff);

            this.maroonChalkGlyphColor = builder.comment(
                    "The integer code of the color of the maroon chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("maroonChalkGlyphColor", 0x991813, 0, 0xffffff);

            this.wineChalkGlyphColor = builder.comment(
                    "The integer code of the color of the wine chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("wineChalkGlyphColor", 0x711e5a, 0, 0xffffff);

            this.roseChalkGlyphColor = builder.comment(
                    "The integer code of the color of the rose chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("roseChalkGlyphColor", 0xfc3475, 0, 0xffffff);

            this.fluorescentChalkGlyphColor = builder.comment(
                    "The integer code of the color of the fluorescent chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("fluorescentChalkGlyphColor", 0xedfcc1, 0, 0xffffff);

            this.springGreenChalkGlyphColor = builder.comment(
                    "The integer code of the color of the springGreen chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("springGreenChalkGlyphColor", 0xc1fc97, 0, 0xffffff);

            this.peachChalkGlyphColor = builder.comment(
                    "The integer code of the color of the peach chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("peachChalkGlyphColor", 0xbd9672, 0, 0xffffff);

            this.cherenkovChalkGlyphColor = builder.comment(
                    "The integer code of the color of the cherenkov chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("cherenkovChalkGlyphColor", 0x0db4da, 0, 0xffffff);

            this.aquamarineChalkGlyphColor = builder.comment(
                    "The integer code of the color of the aquamarine chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("aquamarineChalkGlyphColor", 0x53c29f, 0, 0xffffff);

            this.persimmonChalkGlyphColor = builder.comment(
                    "The integer code of the color of the persimmon chalk glyph in world.",
                    "This is intended to allow people with color blindness to change the color of the glyph.",
                    "For most types of color blindness it should not be necessary to change this."
            ).defineInRange("persimmonChalkGlyphColor", 0xdd591c, 0, 0xffffff);
            builder.pop();
        }
    }
}

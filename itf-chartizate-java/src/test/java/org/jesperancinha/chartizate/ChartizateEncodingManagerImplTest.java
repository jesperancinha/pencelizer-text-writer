package org.jesperancinha.chartizate;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

import java.awt.*;

public class ChartizateEncodingManagerImplTest {

    /**
     * NOTE: It tests dot density for each code point. It does not reflect human
     * perception of fullness. For example W you will find that is a less denser
     * character than others. However looking at it it does give the effect of
     * fullness
     *
     * @
     */
    @Test
    public void testInit_Latin_Visual_Density_Test() {
        final ChartizateFontManager<Font> fontManager = new ChartizateFontManagerImpl("Arial", 10);
        final ChartizateEncodingManagerImpl manager = new ChartizateEncodingManagerImpl(
            Character.UnicodeBlock.LATIN_EXTENDED_A,
            fontManager);
        manager.init();
        assertThat(manager.getCharacters()).isNotNull();
        assertThat(manager.getCharacters()).isNotEmpty();
    }

    @Test
    public void testGetCharacterFullness_H() {
        final ChartizateFontManager<Font> fontManager = new ChartizateFontManagerImpl("Arial", 10);
        final ChartizateEncodingManager<Font> manager = new ChartizateEncodingManagerImpl(
            Character.UnicodeBlock.LATIN_EXTENDED_A,
            fontManager) {
            @Override
            protected int getMaximumHeight() {
                return 10;
            }
        };

        final int h = manager.getCharacterFullness('H');
        assertThat(h).isAnyOf(442, 225, 242);
    }

    @Test
    public void testGetCharacterFullness_Special_Z() {
        final ChartizateFontManager<Font> fontManager = new ChartizateFontManagerImpl("Arial", 10);
        final ChartizateEncodingManager<Font> manager = new ChartizateEncodingManagerImpl(
            Character.UnicodeBlock.LATIN_EXTENDED_A,
            fontManager) {
            @Override
            protected int getMaximumHeight() {
                return 10;
            }
        };
        final int zSpecial = manager.getCharacterFullness('ž');
        assertThat(zSpecial).isAnyOf(600, 280, 260, 320);
    }

    @Test
    public void testGetCharacterFullness_Special_L() {
        final ChartizateFontManager<Font> fontManager = new ChartizateFontManagerImpl("Arial", 10);
        final ChartizateEncodingManager<Font> manager = new ChartizateEncodingManagerImpl(
            Character.UnicodeBlock.LATIN_EXTENDED_A,
            fontManager) {
            @Override
            protected int getMaximumHeight() {
                return 10;
            }
        };
        final int lSpecial = manager.getCharacterFullness('Ĺ');
        assertThat(lSpecial).isAnyOf(383, 216);
    }

    @Test
    public void testGetCharacterFullness_Special_W() {
        final ChartizateFontManager<Font> fontManager = new ChartizateFontManagerImpl("Arial", 10);
        final ChartizateEncodingManager<Font> manager = new ChartizateEncodingManagerImpl(
            Character.UnicodeBlock.LATIN_EXTENDED_A,
            fontManager) {
            @Override
            protected int getMaximumHeight() {
                return 10;
            }
        };
        final int wSpecial = manager.getCharacterFullness('Ŵ');
        assertThat(wSpecial).isAnyOf(600, 277, 311);
    }
}
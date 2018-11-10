package com.jesperancinha.chartizate;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GraphicsEnvironment;
import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author joao Manages the prescribed font
 *
 */
public class ChartizateFontManagerImpl extends ChartizateFontManager<Font> {

	private Font font;

	private FontMetrics fontMetrics;

	public ChartizateFontManagerImpl(String fontName, int fontSize) {
		this.font = new Font(fontName, Font.PLAIN, fontSize);
		Canvas c = new Canvas();
		this.fontMetrics = c.getFontMetrics(font);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.steelzack.pencelizer.PencelizerFontManager#getCharacterWidth(char)
	 */
	@Override
	public int getCharacterWidth(char c) {
		return fontMetrics.stringWidth(new String(new char[] { c }));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.steelzack.pencelizer.PencelizerFontManager#getCharacterHeight(char)
	 */
	@Override
	public int getCharacterHeight(char c) {
		return font.getSize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.steelzack.pencelizer.PencelizerFontManager#getFont()
	 */
	@Override
	public Font getFont() {
		return font;
	}

	static final String[] unicodeDesignationsJava8 = new String[] { //
			"BASIC_LATIN", //
			"LATIN_1_SUPPLEMENT", //
			"LATIN_EXTENDED_A", //
			"LATIN_EXTENDED_B", //
			"IPA_EXTENSIONS", //
			"SPACING_MODIFIER_LETTERS", //
			"COMBINING_DIACRITICAL_MARKS", //
			"GREEK", //
			"CYRILLIC", //
			"ARMENIAN", //
			"HEBREW", //
			"ARABIC", //
			"DEVANAGARI", //
			"BENGALI", //
			"GURMUKHI", //
			"GUJARATI", //
			"ORIYA", //
			"TAMIL", //
			"TELUGU", //
			"KANNADA", //
			"MALAYALAM", //
			"THAI", //
			"LAO", //
			"TIBETAN", //
			"GEORGIAN", //
			"HANGUL_JAMO", //
			"LATIN_EXTENDED_ADDITIONAL", //
			"GREEK_EXTENDED", //
			"GENERAL_PUNCTUATION", //
			"SUPERSCRIPTS_AND_SUBSCRIPTS", //
			"CURRENCY_SYMBOLS", //
			"COMBINING_MARKS_FOR_SYMBOLS", //
			"LETTERLIKE_SYMBOLS", //
			"NUMBER_FORMS", //
			"ARROWS", //
			"MATHEMATICAL_OPERATORS", //
			"MISCELLANEOUS_TECHNICAL", //
			"CONTROL_PICTURES", //
			"OPTICAL_CHARACTER_RECOGNITION", //
			"ENCLOSED_ALPHANUMERICS", //
			"BOX_DRAWING", //
			"BLOCK_ELEMENTS", //
			"GEOMETRIC_SHAPES", //
			"MISCELLANEOUS_SYMBOLS", //
			"DINGBATS", //
			"CJK_SYMBOLS_AND_PUNCTUATION", //
			"HIRAGANA", //
			"KATAKANA", //
			"BOPOMOFO", //
			"HANGUL_COMPATIBILITY_JAMO", //
			"KANBUN", //
			"ENCLOSED_CJK_LETTERS_AND_MONTHS", //
			"CJK_COMPATIBILITY", //
			"CJK_UNIFIED_IDEOGRAPHS", //
			"HANGUL_SYLLABLES", //
			"PRIVATE_USE_AREA", //
			"CJK_COMPATIBILITY_IDEOGRAPHS", //
			"ALPHABETIC_PRESENTATION_FORMS", //
			"ARABIC_PRESENTATION_FORMS_A", //
			"COMBINING_HALF_MARKS", //
			"CJK_COMPATIBILITY_FORMS", //
			"SMALL_FORM_VARIANTS", //
			"ARABIC_PRESENTATION_FORMS_B", //
			"HALFWIDTH_AND_FULLWIDTH_FORMS", //
			"SPECIALS", //
			"SYRIAC", //
			"THAANA", //
			"SINHALA", //
			"MYANMAR", //
			"ETHIOPIC", //
			"CHEROKEE", //
			"UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS", //
			"OGHAM", //
			"RUNIC", //
			"KHMER", //
			"MONGOLIAN", //
			"BRAILLE_PATTERNS", //
			"CJK_RADICALS_SUPPLEMENT", //
			"KANGXI_RADICALS", //
			"IDEOGRAPHIC_DESCRIPTION_CHARACTERS", //
			"BOPOMOFO_EXTENDED", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A", //
			"YI_SYLLABLES", //
			"YI_RADICALS", //
			"CYRILLIC_SUPPLEMENTARY", //
			"TAGALOG", //
			"HANUNOO", //
			"BUHID", //
			"TAGBANWA", //
			"LIMBU", //
			"TAI_LE", //
			"KHMER_SYMBOLS", //
			"PHONETIC_EXTENSIONS", //
			"MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A", //
			"SUPPLEMENTAL_ARROWS_A", //
			"SUPPLEMENTAL_ARROWS_B", //
			"MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B", //
			"SUPPLEMENTAL_MATHEMATICAL_OPERATORS", //
			"MISCELLANEOUS_SYMBOLS_AND_ARROWS", //
			"KATAKANA_PHONETIC_EXTENSIONS", //
			"YIJING_HEXAGRAM_SYMBOLS", //
			"VARIATION_SELECTORS", //
			"LINEAR_B_SYLLABARY", //
			"LINEAR_B_IDEOGRAMS", //
			"AEGEAN_NUMBERS", //
			"OLD_ITALIC", //
			"GOTHIC", //
			"UGARITIC", //
			"DESERET", //
			"SHAVIAN", //
			"OSMANYA", //
			"CYPRIOT_SYLLABARY", //
			"BYZANTINE_MUSICAL_SYMBOLS", //
			"MUSICAL_SYMBOLS", //
			"TAI_XUAN_JING_SYMBOLS", //
			"MATHEMATICAL_ALPHANUMERIC_SYMBOLS", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B", //
			"CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT", //
			"TAGS", //
			"VARIATION_SELECTORS_SUPPLEMENT", //
			"SUPPLEMENTARY_PRIVATE_USE_AREA_A", //
			"SUPPLEMENTARY_PRIVATE_USE_AREA_B", //
			"HIGH_SURROGATES", //
			"HIGH_PRIVATE_USE_SURROGATES", //
			"LOW_SURROGATES", //
			"ARABIC_SUPPLEMENT", //
			"NKO", //
			"SAMARITAN", //
			"MANDAIC", //
			"ETHIOPIC_SUPPLEMENT", //
			"UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED", //
			"NEW_TAI_LUE", //
			"BUGINESE", //
			"TAI_THAM", //
			"BALINESE", //
			"SUNDANESE", //
			"BATAK", //
			"LEPCHA", //
			"OL_CHIKI", //
			"VEDIC_EXTENSIONS", //
			"PHONETIC_EXTENSIONS_SUPPLEMENT", //
			"COMBINING_DIACRITICAL_MARKS_SUPPLEMENT", //
			"GLAGOLITIC", //
			"LATIN_EXTENDED_C", //
			"COPTIC", //
			"GEORGIAN_SUPPLEMENT", //
			"TIFINAGH", //
			"ETHIOPIC_EXTENDED", //
			"CYRILLIC_EXTENDED_A", //
			"SUPPLEMENTAL_PUNCTUATION", //
			"CJK_STROKES", //
			"LISU", //
			"VAI", //
			"CYRILLIC_EXTENDED_B", //
			"BAMUM", //
			"MODIFIER_TONE_LETTERS", //
			"LATIN_EXTENDED_D", //
			"SYLOTI_NAGRI", //
			"COMMON_INDIC_NUMBER_FORMS", //
			"PHAGS_PA", //
			"SAURASHTRA", //
			"DEVANAGARI_EXTENDED", //
			"KAYAH_LI", //
			"REJANG", //
			"HANGUL_JAMO_EXTENDED_A", //
			"JAVANESE", //
			"CHAM", //
			"MYANMAR_EXTENDED_A", //
			"TAI_VIET", //
			"ETHIOPIC_EXTENDED_A", //
			"MEETEI_MAYEK", //
			"HANGUL_JAMO_EXTENDED_B", //
			"VERTICAL_FORMS", //
			"ANCIENT_GREEK_NUMBERS", //
			"ANCIENT_SYMBOLS", //
			"PHAISTOS_DISC", //
			"LYCIAN", //
			"CARIAN", //
			"OLD_PERSIAN", //
			"IMPERIAL_ARAMAIC", //
			"PHOENICIAN", //
			"LYDIAN", //
			"KHAROSHTHI", //
			"OLD_SOUTH_ARABIAN", //
			"AVESTAN", //
			"INSCRIPTIONAL_PARTHIAN", //
			"INSCRIPTIONAL_PAHLAVI", //
			"OLD_TURKIC", //
			"RUMI_NUMERAL_SYMBOLS", //
			"BRAHMI", //
			"KAITHI", //
			"CUNEIFORM", //
			"CUNEIFORM_NUMBERS_AND_PUNCTUATION", //
			"EGYPTIAN_HIEROGLYPHS", //
			"BAMUM_SUPPLEMENT", //
			"KANA_SUPPLEMENT", //
			"ANCIENT_GREEK_MUSICAL_NOTATION", //
			"COUNTING_ROD_NUMERALS", //
			"MAHJONG_TILES", //
			"DOMINO_TILES", //
			"PLAYING_CARDS", //
			"ENCLOSED_ALPHANUMERIC_SUPPLEMENT", //
			"ENCLOSED_IDEOGRAPHIC_SUPPLEMENT", //
			"MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS", //
			"EMOTICONS", //
			"TRANSPORT_AND_MAP_SYMBOLS", //
			"ALCHEMICAL_SYMBOLS", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C", //
			"CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D", //
			"ARABIC_EXTENDED_A", //
			"SUNDANESE_SUPPLEMENT", //
			"MEETEI_MAYEK_EXTENSIONS", //
			"MEROITIC_HIEROGLYPHS", //
			"MEROITIC_CURSIVE", //
			"SORA_SOMPENG", //
			"CHAKMA", //
			"SHARADA", //
			"TAKRI", //
			"MIAO", //
			"ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS" //
	};
	

	protected List<UnicodeBlock> getAllUniCodeBlocksJava8() {
		final List<UnicodeBlock> unicodeBlockList = new ArrayList<>();
		for (final String unicodeBlock : unicodeDesignationsJava8) {
			unicodeBlockList.add(UnicodeBlock.forName(unicodeBlock));
		}
		return unicodeBlockList;
	}

	protected List<UnicodeBlock> getAllUniCodeBlocksJava7() {
		final List<UnicodeBlock> unicodeBlockList = new ArrayList<>();
		for (final String unicodeBlock : unicodeDesignationsJava7) {
			unicodeBlockList.add(UnicodeBlock.forName(unicodeBlock));
		}
		return unicodeBlockList;
	}

	public static List<String> getAllFontTypes() {
		return Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
	}

	public static  List<String> getAllUniCodeBlockStringsJava8() {
		return Arrays.asList(unicodeDesignationsJava8);
	}

	@Override
	public int getFontSize() {
		return font.getSize();
	}
}

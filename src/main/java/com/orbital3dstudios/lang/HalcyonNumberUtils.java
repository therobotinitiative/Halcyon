package com.orbital3dstudios.lang;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Supplementary utility methods for parsing numeric values without the need to
 * catch exceptions and without receiving instance in case of parsing errors or
 * null parameters.
 * 
 * If numeric value is always valid and there is a need to know if numeric value
 * is set or not then this utility class can be useful. null can indicate that
 * there is no value while for example any numeric value is valid value.
 * 
 * @author Mikko Sirén
 * 
 */
public final class HalcyonNumberUtils
{
	private HalcyonNumberUtils()
	{
		// Hide utility class constructor
	}

	/**
	 * Parses {@link Byte} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Byte} instance; null if no value could be parsed
	 */
	public static <T extends Object> Byte toByte(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toByte(value.toString());
		}
		return null;
	}

	/**
	 * Parses {@link Short} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Short} instance; null if no value could be parsed
	 */
	public static <T extends Object> Short toShort(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toShort(value.toString());
		}
		return null;
	}

	/**
	 * Parses {@link Integer} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Integer} instance; null if no value could be parsed
	 */
	public static <T extends Object> Integer toInteger(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toInt(value.toString());
		}
		return null;
	}

	/**
	 * Parses {@link Long} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Long} instance; null if no value could be parsed
	 */
	public static <T extends Object> Long toLong(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toLong(value.toString());
		}
		return null;
	}

	/**
	 * Parses {@link Float} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Float} instance; null if no value could be parsed
	 */
	public static <T extends Object> Float toFloat(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toFloat(value.toString());
		}
		return null;
	}

	/**
	 * Parses {@link Double} value from the given parameters
	 * {@link Object#toString()} return value. null and non-numeric value will
	 * return null.
	 * 
	 * @param value
	 *            {@link Object#toString()} return value to parse; can be null
	 * @return {@link Double} instance; null if no value could be parsed
	 */
	public static <T extends Object> Double toDouble(final T value)
	{
		if (value != null && NumberUtils.isNumber(value.toString()))
		{
			return NumberUtils.toDouble(value.toString());
		}
		return null;
	}

	/**
	 * @param value
	 *            Type <T extends Number> value to convert into {@link String}
	 * @return {@link Number#toString()} return value; null if the parameter is
	 *         null
	 */
	public static <T extends Number> String toString(final T value)
	{
		if (value != null)
		{
			return value.toString();
		}
		return null;
	}

}

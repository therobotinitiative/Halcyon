package com.orbital3dstudios.lang;

import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

/**
 * Supplementary {@link String} utilities. These utility methods are null
 * resilient and do not throw exceptions.
 * 
 * @author Mikko Sirén
 * 
 */
public final class HalcyonStringUtils
{
	private HalcyonStringUtils()
	{
		// Hide utility class constructor
	}

	/**
	 * Returns the {@link Object#toString()} value of the given parameter. If
	 * the parameter is null or the string value is empty null will be returned.
	 * The type parameter defines {@link Object} as the bound because it defines
	 * the toString method. It is the clients responsibility to make sure that
	 * the given parameter produces valid value.
	 * 
	 * @param value
	 *            Value which {@link Object#toString()} is returned
	 * @return {@link Object#toString()} value; null if the parameter is null or
	 *         the string value is empty
	 */
	public static <T extends Object> String toString(T value)
	{
		if (value != null && !StringUtils.isEmpty(value.toString()))
		{
			return value.toString();
		}
		return null;
	}

	/**
	 * Returns the country code as {@link String}. If the
	 * {@link Locale#getCountry()} value is not a null or empty value the
	 * country code value is returned. The {@link Locale} can be null.
	 * 
	 * @param locale
	 *            {@link Locale} which {@link Locale#getCountry()} value is
	 *            returned
	 * @return {@link Locale#getCountry()} value; null if the parameter is null
	 *         or the country code is empty
	 */
	public static String toCountryCode(Locale locale)
	{
		if (locale != null && !StringUtils.isEmpty(locale.getCountry()))
		{
			return locale.getCountry();
		}
		return null;
	}

	/**
	 * Returns the language code as {@link String}. If the
	 * {@link Locale#getLanguage()} value is not a null or empty value the
	 * language code value is returned. The {@link Locale} can be null.
	 * 
	 * @param locale
	 *            {@link Locale} which {@link Locale#getLanguage()} value is
	 *            returned
	 * @return {@link Locale#getLanguage()} value; null if the parameter is null
	 *         or the country code is empty
	 */
	public static String toLanguage(Locale locale)
	{
		if (locale != null && !StringUtils.isEmpty(locale.getLanguage()))
		{
			return locale.getLanguage();
		}
		return null;
	}
}

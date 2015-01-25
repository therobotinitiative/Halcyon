package com.orbital3dstudios.lang;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Supplementary methods for using java.net package classes. These methods
 * reduces boiler plate code if there is no need to handle null checks or
 * exception catching.
 * 
 * @author Mikko Sirén
 * 
 */
public final class HalcyonNetUtils
{
	private HalcyonNetUtils()
	{
		// Hide utility class constructor
	}

	/**
	 * Parses the given {@link String} into {@link URL} without throwing any
	 * exception. In case of error null will be returned.
	 * 
	 * @param value
	 *            {@link String} to parse with {@link URL#URL(String)}
	 * @return New {@link URL} instance; null if the parameter is not a valid
	 *         {@link URL}
	 */
	public static URL parseURL(String value)
	{
		try
		{
			return new URL(value);
		}
		catch (MalformedURLException e)
		{
			// Silently fail
		}
		return null;
	}

	/**
	 * Parses the given {@link String} into {@link URI} without throwing any
	 * exception. In case of error null will be returned.
	 * 
	 * @param value
	 *            {@link String} to parse with {@link URI#URI(String)}
	 * @return New {@link URI} instance; null if the parameter is not a valid
	 *         {@link URI}
	 */
	public static URI parseURI(String value)
	{
		try
		{
			return new URI(value);
		}
		catch (URISyntaxException e)
		{
			// Silently fail
		}
		return null;
	}

	/**
	 * Returns {@link URL#toString()}. If the {@link URL} is null then null will
	 * be returned.
	 * 
	 * @param url
	 *            {@link URL}
	 * @return {@link URL#toString()}; null if the parameter is null
	 */
	public static String toString(URL url)
	{
		if (url != null)
		{
			return url.toString();
		}
		return null;
	}

	/**
	 * Returns {@link URI#toString()}. If the {@link URI} is null then null will
	 * be returned.
	 * 
	 * @param uri
	 *            {@link URI}
	 * @return {@link URI#toString()}; null if the parameter is null
	 */
	public static String toString(URI uri)
	{
		if (uri != null)
		{
			return uri.toString();
		}
		return null;
	}
}

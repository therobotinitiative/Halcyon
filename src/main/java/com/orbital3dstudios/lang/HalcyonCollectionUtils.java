package com.orbital3dstudios.lang;

import java.util.Collection;
import java.util.List;

/**
 * Type safe supplementary utility methods for handling JDK Collection classes.
 * This utility class is resilient to null values and do not throw exceptions.
 * 
 * @author Mikko Sirén
 * 
 */
public final class HalcyonCollectionUtils
{
	private HalcyonCollectionUtils()
	{
		// Hide utility class constructor
	}

	/**
	 * Pushes the given value to the top of the {@link List}. The client is
	 * responsible to provide sorted {@link List} class otherwise this method
	 * gives no guarantee about the order in which value will be stored.
	 * 
	 * @param list
	 *            {@link List} into which the value is pushed into; can be null
	 * @param value
	 *            Type <T> value which is pushed into the {@link Collection};
	 *            can be null
	 */
	public static <T> void pushToList(List<T> list, final T value)
	{
		if (list != null && value != null)
		{
			list.add(0, value);
		}
	}

	/**
	 * Pops the first value from the {@link Collection}. The value is removed
	 * from the {@link Collection} if there is at least one value.
	 * 
	 * @param collection
	 *            {@link Collection} from which the value is popped from; can be
	 *            null
	 * @return Value of type <T>; null if the {@link Collection} is null or
	 *         empty
	 */
	public static <T> T popCollection(Collection<T> collection)
	{
		if (collection != null && !collection.isEmpty())
		{
			// If the collection is not empty then there must be at least one
			// item which makes the operation below legal and safe.
			T value = collection.iterator().next();
			collection.remove(value);
			return value;
		}
		return null;
	}

	/**
	 * Peeks into the {@link Collection}. If the {@link Collection} is not null
	 * or empty then the first value is returned.
	 * 
	 * @param collection
	 *            {@link Collection} to peek into; can be null
	 * @return First value from {@link Collection}; null if the
	 *         {@link Collection} is null or empty
	 */
	public static <T> T peekCollection(final Collection<T> collection)
	{
		if (collection != null && !collection.isEmpty())
		{
			// If the collection is not empty then there must be at least one
			// item which makes the operation below legal and safe.
			return collection.iterator().next();
		}
		return null;
	}

	/**
	 * Adds value to the {@link Collection}. The value of type <T> is added to
	 * the {@link Collection} if the {@link Collection} or the value are not
	 * null. If {@link Collection#add(Object)} throws
	 * {@link IllegalStateException} it is caught and silently ignored.
	 * 
	 * @param collection
	 *            {@link Collection} into which the value is added into; can be
	 *            null
	 * @param value
	 *            Value of type <T>; can be null
	 */
	public static <T> void addToCollection(Collection<T> collection, final T value)
	{
		if (collection != null && value != null)
		{
			try
			{
				collection.add(value);
			}
			catch (IllegalStateException e)
			{
				// Silently fail
			}
		}
	}
}

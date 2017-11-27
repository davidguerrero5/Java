package edu.albany.homework3;

import java.util.Collection;

public abstract class Semigroup<T> {
	abstract T operator(T object);

	public static <T> T combine(Collection<T> collection) {
		Semigroup<T> object = null;

		for (T element:collection) {
			if (object == null) {
				object = (Semigroup<T>) element;
			} else {
				object = (Semigroup<T>) object.operator(element);
			}
		}
		return (T)object;
	}
}
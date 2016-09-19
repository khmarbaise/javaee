package com.soebes.examples.j2ee.domain;

import java.io.Serializable;

public final class Name implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;

	public Name(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

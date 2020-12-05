package com.chenly.designpattern.adapter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenly
 * @create 2020-12-05 15:26
 */
public class StandardSession implements HttpSession {
	private String id;

	private Map<String, Object> sessionAttrs = new HashMap<>();

	private long creationTime = Instant.now().getEpochSecond();

	public StandardSession(String id) {
		this.id = id;
	}

	public StandardSession() {
	}

	@Override
	public String getSessionId() {
		return id;
	}

	@Override
	public Map<String, Object> getAttribute() {
		return sessionAttrs;
	}

	@Override
	public long getCreationTime() {
		return creationTime;
	}
}

package com.chenly.designpattern.adapter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenly
 * @create 2020-12-05 15:31
 */
public class RedisSession {

	public MapSession session;

	private boolean isNew;

	private String originalSessionId;

	static class MapSession {
		private String id;

		private Map<String, Object> sessionAttrs = new HashMap<>();

		private Instant creationTime = Instant.now();

		public MapSession(String id, Map<String, Object> sessionAttrs, Instant creationTime) {
			this.id = id;
			this.sessionAttrs = sessionAttrs;
			this.creationTime = creationTime;
		}

		public String getId() {
			return id;
		}

		public Map<String, Object> getSessionAttrs() {
			return sessionAttrs;
		}

		public Instant getCreationTime() {
			return creationTime;
		}

	}

	public MapSession getSession() {
		return session;
	}
}

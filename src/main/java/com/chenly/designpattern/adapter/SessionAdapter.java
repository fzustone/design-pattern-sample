package com.chenly.designpattern.adapter;

import java.util.Map;

/**
 * @author chenly
 * @create 2020-12-05 15:39
 */
public class SessionAdapter implements HttpSession{

	private RedisSession session;

	public SessionAdapter(RedisSession session) {
		this.session = session;
	}

	@Override
	public String getSessionId() {
		return session.getSession().getId();
	}

	@Override
	public Map<String, Object> getAttribute() {
		return session.getSession().getSessionAttrs();
	}

	@Override
	public long getCreationTime() {
		return session.getSession().getCreationTime().getEpochSecond();
	}
}

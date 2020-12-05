package com.chenly.designpattern.adapter;

import java.util.Map;

/**
 * @author chenly
 * @create 2020-12-05 15:23
 */
public interface HttpSession {

	String getSessionId();

	Map<String, Object> getAttribute();

	long getCreationTime();
}

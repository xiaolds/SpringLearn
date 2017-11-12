package com.lids.spring.data;

import java.util.List;

import com.lids.spring.pojo.Spittle;

public interface SpittleRepo {
	/**
	 * ²éÑ¯ÏûÏ¢
	 * @param max
	 * @param count
	 * @return
	 */
	List<Spittle> findSpittles(long max, int count);
}

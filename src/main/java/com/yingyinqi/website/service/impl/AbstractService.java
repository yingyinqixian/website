package com.yingyinqi.website.service.impl;

import com.yingyinqi.website.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

public abstract class AbstractService<T> implements Service<T> {

	@Autowired
	protected Mapper<T> mapper;
	@Override
	public void save(T entity) {
		mapper.insert(entity);
	}
}
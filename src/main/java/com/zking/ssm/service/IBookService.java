package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-23 21:54
 */
@Transactional
public interface IBookService {

    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    @Transactional(readOnly = true)
    //@Cacheable(value = "book")
    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

//    @CachePut(value = "book")
    Book updateByPrimaryKey(Book record);

    @Transactional(readOnly = true)
   List queryAll(Book record);
}

package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-11-24 18:52
 */

public class IBookServiceTest extends BaseTestCase{
    @Autowired
    private IBookService iBookService;
    Book book;
//    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        book = new Book();
//        sqlSession = MybatisSessionFactoryUtils.openSession();
//        //com.zking.ssm.mapper.BookMapper
//        //String name = BookMapper.class.getName();
//        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
//        BookServiceImpl bookServiceImpl = new BookServiceImpl();
//        bookServiceImpl.setBookMapper(bookMapper);
//        iBookService = bookServiceImpl;
        //del
    }

    @After
    public void tearDown() throws Exception {
//        sqlSession.commit();
    }

    @Test
    public void insert() {
        book.setBookId(null);
        book.setBookName("西游记");
        book.setBookPrice(33f);
        book.setBookBrief("升级打怪");
        iBookService.insert(book);
        System.out.println("OK");
    }

    @Test

    public void queryAll() {
        book.setBookName("西");
        List list = iBookService.queryAll(book);
        list.forEach(l -> {
            System.out.println(l);
        });
    }

    @Test
    public void get(){
        Book b=iBookService.selectByPrimaryKey(3);
        System.out.println(b);
    }
    @Test
    public void edit(){
        book.setBookId(null);
        book.setBookName("西游记");
        book.setBookPrice(44f);
        book.setBookBrief("升级打怪才怪");
        iBookService.updateByPrimaryKey(book);
    }
}
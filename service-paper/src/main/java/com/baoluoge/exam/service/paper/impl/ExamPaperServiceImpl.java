package com.baoluoge.exam.service.paper.impl;


import com.baoluoge.exam.dao.paper.ExamPaperMapper;
import com.baoluoge.exam.domain.ExamPaper;
import com.baoluoge.exam.domain.ExamPaperExample;
import com.baoluoge.exam.service.paper.ExamPaperService;
import com.baoluoge.exam.util.page.Page;
import com.baoluoge.exam.util.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by PaulZhang on 2016/9/26.
 */
@Service(value = "ExamPaperService")
public class ExamPaperServiceImpl implements ExamPaperService {

    @Autowired
    private ExamPaperMapper examPaperMapper;

    @Override
    @Transactional(readOnly = true)
    public Page<ExamPaper> findByPage(int pn, int size) {
        int start = PageUtil.getPageStart(pn, size);
        ExamPaperExample example = new ExamPaperExample();
        example.createCriteria().andIsDeleteEqualTo(Boolean.FALSE);
        long count = examPaperMapper.countByExample(example);
        example.setOrderByClause("`ORDER` LIMIT " + start + "," + size);
        List<ExamPaper> items = examPaperMapper.selectByExample(example);
        return PageUtil.getPage(count, pn, items, size);
    }

    @Override
    @Transactional(readOnly = true)
    public ExamPaper findById(int id) {
        return examPaperMapper.selectByPrimaryKey(id);
    }
}

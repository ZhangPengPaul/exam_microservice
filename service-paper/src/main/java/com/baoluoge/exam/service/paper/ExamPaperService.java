package com.baoluoge.exam.service.paper;


import com.baoluoge.exam.domain.ExamPaper;
import com.baoluoge.exam.util.page.Page;

/**
 * 试卷service
 * <p>
 * Created by PaulZhang on 2016/9/26.
 */
public interface ExamPaperService {

    /**
     * 分页查询所有试卷
     *
     * @param pn   分页页码
     * @param size 每页数量
     * @return
     */
    Page<ExamPaper> findByPage(int pn, int size);

    ExamPaper findById(int id);
}

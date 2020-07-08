package com.sc.mapper;

import com.sc.entity.XsFeedback;
import com.sc.entity.XsFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsFeedbackMapper {
    int countByExample(XsFeedbackExample example);

    int deleteByExample(XsFeedbackExample example);

    int deleteByPrimaryKey(Long feedbackId);

    int insert(XsFeedback record);

    int insertSelective(XsFeedback record);

    List<XsFeedback> selectByExample(XsFeedbackExample example);

    XsFeedback selectByPrimaryKey(Long feedbackId);

    int updateByExampleSelective(@Param("record") XsFeedback record, @Param("example") XsFeedbackExample example);

    int updateByExample(@Param("record") XsFeedback record, @Param("example") XsFeedbackExample example);

    int updateByPrimaryKeySelective(XsFeedback record);

    int updateByPrimaryKey(XsFeedback record);
}
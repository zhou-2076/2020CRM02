package com.sc.mapper;

import com.sc.entity.XtJournal;
import com.sc.entity.XtJournalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtJournalMapper {
    int countByExample(XtJournalExample example);

    int deleteByExample(XtJournalExample example);

    int deleteByPrimaryKey(Long journalId);

    int insert(XtJournal record);

    int insertSelective(XtJournal record);

    List<XtJournal> selectByExample(XtJournalExample example);

    XtJournal selectByPrimaryKey(Long journalId);

    int updateByExampleSelective(@Param("record") XtJournal record, @Param("example") XtJournalExample example);

    int updateByExample(@Param("record") XtJournal record, @Param("example") XtJournalExample example);

    int updateByPrimaryKeySelective(XtJournal record);

    int updateByPrimaryKey(XtJournal record);
}
package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtJournal;

public interface XtJournalService {

	public void addJournal(XtJournal journal);
	
	public void deleteJournal(Long journalId);
	
	public void updateJournal(XtJournal journal);
	
	public XtJournal getJournal(Long journalId);
	
	public PageInfo<XtJournal> selectJournal(Integer pageNum,Integer pageSize, XtJournal journal);
}

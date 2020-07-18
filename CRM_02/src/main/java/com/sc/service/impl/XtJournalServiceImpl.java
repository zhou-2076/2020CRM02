package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtJournal;
import com.sc.mapper.XtJournalMapper;
import com.sc.service.XtJournalService;
@Service
public class XtJournalServiceImpl implements XtJournalService {

	@Autowired
	XtJournalMapper xtJournalMapper;
	@Override
	public void addJournal(XtJournal journal) {
		xtJournalMapper.insert(journal);

	}

	@Override
	public void deleteJournal(Long journalId) {
		if(journalId!=null){
			xtJournalMapper.deleteByPrimaryKey(journalId);
		}

	}

	@Override
	public void updateJournal(XtJournal journal) {
		if(journal!=null&&journal.getJournalId()!=null){
			xtJournalMapper.updateByPrimaryKey(journal);
		}
	}

	@Override
	public XtJournal getJournal(Long journalId) {
		if(journalId!=null){
			return xtJournalMapper.selectByPrimaryKey(journalId);
		}
		return null;
	}

	@Override
	public PageInfo<XtJournal> selectJournal(Integer pageNum, Integer pageSize, XtJournal journal) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtJournal> list = xtJournalMapper.selectByExample(null);
		for (XtJournal cs : list) {
			System.out.println("@@@@@@"+cs);
		}
		PageInfo<XtJournal> page=new PageInfo<XtJournal>(list);
		return page;
	}

}

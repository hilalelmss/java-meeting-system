package com.github.hilalelms.mebitech.meeting.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hilalelms.mebitech.meeting.dao.MeetingDao;
import com.github.hilalelms.mebitech.meeting.entity.Employee;
import com.github.hilalelms.mebitech.meeting.entity.Meeting;
import com.github.hilalelms.mebitech.meeting.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {
	
	@Autowired
	MeetingDao meetingDao;

	@Override
	public void save(Meeting meeting) {
		meetingDao.save(meeting);
	}

	@Override
	public void update(Meeting meeting) {
		meetingDao.save(meeting);
	}

	@Override
	public void delete(int id) {
		meetingDao.delete(id);
	}

	@Override
	public Meeting getByKey(int id) {
		return meetingDao.findOne(id);
	}

	@Override
	public List<Meeting> getAll() {
		List<Meeting> meetingList = new ArrayList<>();
		Iterator<Meeting> iterator=  meetingDao.findAll().iterator();
		Meeting meeting = null;
		while (iterator.hasNext()) {
			meeting = (Meeting) iterator.next();
			meetingList.add(meeting);
		}
		return meetingList;
	}

}

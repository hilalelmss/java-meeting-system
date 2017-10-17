package com.github.hilalelms.mebitech.meeting.service;

import java.util.List;

import com.github.hilalelms.mebitech.meeting.entity.Meeting;

public interface MeetingService {
	public void save(Meeting meeting);
	public void update(Meeting meeting);
	public void delete(int id);
	public Meeting getByKey(int id);
	public List<Meeting> getAll();
}

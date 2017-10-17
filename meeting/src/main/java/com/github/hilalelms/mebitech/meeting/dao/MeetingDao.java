package com.github.hilalelms.mebitech.meeting.dao;

import org.springframework.data.repository.CrudRepository;

import com.github.hilalelms.mebitech.meeting.entity.Meeting;

public interface MeetingDao extends CrudRepository<Meeting, Integer>{

}

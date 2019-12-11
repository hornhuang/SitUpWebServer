package com.fishinwater.situp.model.base;

import com.fishinwater.situp.beans.DayBean;

public interface IDay {
	
	DayBean getDayByUserAndDate(String user_id, String day_date);

}

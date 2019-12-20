package com.fishinwater.situp.model;

import java.util.List;

import com.fishinwater.situp.beans.UserBean;
import com.fishinwater.situp.dao.UserDao;
import com.fishinwater.situp.model.base.IBaseModel;
import com.fishinwater.situp.model.base.IUser;
import com.fishinwater.situp.utils.DaoEnum;
import com.fishinwater.situp.utils.JsonUtils;
import com.fishinwater.situp.utils.UpdateEnum;

public class UserImpl implements IUser<UserBean> {

	public static enum USERENUM {
		UPDATE_PASSWORD,
		UPDATE_INTRODUCE,
		UPDATE_HEAD_IMG
	}
	
	@Override
	public UserBean login(UserBean user) {
		// TODO Auto-generated method stub
		UserBean par_user = user;
		UserDao dao = new UserDao();
		List<UserBean> list = dao.getAll();
		for (int i = 0; i < list.size(); i++) {
			UserBean userBean = (UserBean) list.get(i);
			if (par_user.getUser_name().equals(userBean.getUser_name())) {
				if (par_user.getUser_password().equals(userBean.getUser_password())) {
					userBean.setUser_password("");
					return userBean;
				}else {
					return null;
				}
			}
		}
		return null;
	}

	@Override
	public int register(UserBean user) {
		int result = IBaseModel.SUCCEED;
		UserBean par_user = (UserBean) user;
		UserDao userdao = new UserDao();

		UserBean userbean = (UserBean) userdao.getBy(DaoEnum.NAME, par_user.getUser_name());
		if (userbean != null) {
			result = IBaseModel.WRONG_NAME;
			System.out.println("ÓÃ»§´æÔÚ£¬ÇëÊäÈëÃÜÂëµÇÂ¼!");
		} else {
			if (userdao.add(par_user) == 1) {
				return result;
			}else{
				result = IBaseModel.WRONG_PASSWORD;
				System.out.println("×¢²áÊ§°Ü£¡");
			}
		}
		return result;
	}
	
	@Override
	public UserBean update(UpdateEnum updateFlag,  UserBean user) {
		// TODO Auto-generated method stub
		UserBean result = new UserBean();
		UserDao dao = new UserDao();
		UserBean par_user= user;
		UserBean userBean = dao.getBy(DaoEnum.ID, par_user.getUser_id());
		if (userBean != null) {
			if (updateFlag == UpdateEnum.UPDATE_PASSWORD) {
				result=dao.update(user);
			} else if (updateFlag == UpdateEnum.UPDATE_INTRODUCE) {
				result=dao.updateIntroduction(user);
			} else if (updateFlag == UpdateEnum.UPDATE_HEAD_IMG) {
				result=dao.updateHeadImg(user);
			}
		}else {
			result.setUser_id("Î´ÕÒµ½¸ÃÓÃ»§");
			result.setUser_introduction(user.getUser_id());
		}
		return result;
	}

	@Override
	public String getUserById(String user_id) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDao();
		UserBean user = userDao.getBy(DaoEnum.ID, user_id);
		return JsonUtils.objToString(user);
	}

}

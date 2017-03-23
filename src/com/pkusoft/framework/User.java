package com.pkusoft.framework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.subject.WebSubject;

import com.pkusoft.admin.model.SysDeptRele;
import com.pkusoft.framework.model.OnlineUsers;

/**
 * 访问用户对象
 * @author tanggj
 *
 */
public class User {
	public static final String ONLINE = "online";

	public static final String OFFLINE = "offline";

	public static final String BUSY = "busy";

	public static final String AWAY = "away";

	public static final String HIDDEN = "hidden";

	public static final Map<String,String> LOGIN_STATUS_MAP;

	private static ThreadLocal<UserInfo> UserLocal = new ThreadLocal<UserInfo>();
	
	static {
		LOGIN_STATUS_MAP = new HashMap<String,String>();
		LOGIN_STATUS_MAP.put("online", "在线");
		LOGIN_STATUS_MAP.put("offline", "下线");
		LOGIN_STATUS_MAP.put("busy", "忙碌");
		LOGIN_STATUS_MAP.put("away", "离开");
		LOGIN_STATUS_MAP.put("hidden", "隐身");
	}

	public static Locale getLocale(){
		UserInfo userInfo = getCurrent();
		if(userInfo == null){
			return Locale.getDefault();
		}
		
		return userInfo.getLocale();
	}

	public static Long getUserId() {
		return getCurrent().userId;
	}
	
	public static String getUserName() {
		return getCurrent().userName;
	}

	public static String getLoginName() {
		return getCurrent().loginName;
	}

	public static String getDeptId() {
		return getCurrent().deptId;
	}

	public static String getDeptName() {
		return getCurrent().deptName;
	}
	
	public static String getStatus() {
		return getCurrent().status;
	}

	public static String getLoginStatus() {
		return getCurrent().loginStatus;
	}

	public static String getIp() {
		return getCurrent().ip;
	}

    public static String getMacAddress() {
        return getCurrent().macAddress;
    }

	public static int getValueCount() {
		return getCurrent().map.size();
	}

	public static Object getValue(Object key) {
		return getCurrent().map.get(key);
	}

	public static Map<String,Object> getValues() {
		return getCurrent().map;
	}

	public static boolean isLogin() {
		return getCurrent().isLogin;
	}

	/*public static void setLogin(boolean isLogin) {
		getCurrent().isLogin = isLogin;
		if(isLogin){
			WebSubject subject  = (WebSubject) SecurityUtils.getSubject();
			HttpServletRequest request = (HttpServletRequest) subject.getServletRequest();
			// 增加在线后台用户
			OnlineUsers.getInstance().addLoginSession(request.getSession());
		}
	}*/

	public static void setCurrent(UserInfo user) {
		UserLocal.set(user);
	}

	public static UserInfo getCurrent() {
		return (UserInfo) UserLocal.get();
	}

	public static void destory() {
		setCurrent(new UserInfo());
	}

	public static String getSessionId() {
		return getCurrent().sessionId;
	}

	public static String getLoginId() {
		return getCurrent().loginId;
	}

	public static String getUserLevel() {
		return getCurrent().userLevel;
	}

	public static String getCunitid() {
		return getCurrent().cunitid;
	}

	public static String getSunitid() {
		return getCurrent().sunitid;
	}

	public static String getTunitid() {
		return getCurrent().tunitid;
	}
	public static String getObjectid() {
		return getCurrent().objectid;
	}

	public static List<SysDeptRele> getDataUnitList() {
		return getCurrent().getDataUnitList();
	}
	
	public static boolean isMember() {
		return getCurrent().isMember;
	}

	public static boolean isManager() {
		return getCurrent().isManager;
	}

    public static String getIdcard() {
        return getCurrent().idcard;
    }

	public static class UserInfo implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private Locale locale;

		private Long userId;

		private String loginName;

		private String userName;

		private String deptId;
		
		private String deptName;

		private String status;
		
		private String loginStatus;

		private String userType;
		
		private String ip;

        private String macAddress;

		private boolean isLogin;

		private boolean isMember;

		private boolean isManager;

		private String sessionId;
		
		private String loginId;

		private String userLevel;
		private String cunitid;
		private String sunitid;
		private String tunitid;
		private List<SysDeptRele> dataUnitList;
		
		private String objectid;
		
		private String idcard;
		

		private Map<String,Object> map;
		
		
		public Locale getLocale() {
			return locale;
		}
		
		public void setLocale(Locale locale) {
			this.locale = locale;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getLoginName() {
			return loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDeptId() {
			return deptId;
		}

		public void setDeptId(String deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}
		
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
		
		public String getLoginStatus() {
			return loginStatus;
		}
		
		public void setLoginStatus(String loginStatus) {
			this.loginStatus = loginStatus;
		}

		public String getUserType() {
			return userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

        public String getMacAddress() {
            return this.macAddress;
        }

        public void setMacAddress(String macAddress) {
            this.macAddress = macAddress;
        }

		public boolean isLogin() {
			return isLogin;
		}

		public void setLogin(boolean isLogin) {
			this.isLogin = isLogin;
		}

		public boolean isMember() {
			return isMember;
		}

		public void setMember(boolean isMember) {
			this.isMember = isMember;
		}

		public boolean isManager() {
			return isManager;
		}

		public void setManager(boolean isManager) {
			this.isManager = isManager;
		}

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
		
		public String getLoginId() {
			return loginId;
		}
		
		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}

		public String getUserLevel() {
			return userLevel;
		}

		public void setUserLevel(String userLevel) {
			this.userLevel = userLevel;
		}

		public String getCunitid() {
			return cunitid;
		}

		public void setCunitid(String cunitid) {
			this.cunitid = cunitid;
		}

		public String getSunitid() {
			return sunitid;
		}

		public void setSunitid(String sunitid) {
			this.sunitid = sunitid;
		}

		public String getTunitid() {
			return tunitid;
		}

		public void setTunitid(String tunitid) {
			this.tunitid = tunitid;
		}

		public List<SysDeptRele> getDataUnitList() {
			if(dataUnitList == null){
				dataUnitList = new ArrayList<SysDeptRele>();
			}
			return dataUnitList;
		}
		
		public void setDataUnitList(List<SysDeptRele> dataUnitList) {
			this.dataUnitList = dataUnitList;
		}
		
		public String getObjectid() {
			return objectid;
		}
		
		public void setObjectid(String objectid) {
			this.objectid = objectid;
		}
		
		public Map<String,Object> getMap() {
			return map;
		}

		public void setMap(Map<String,Object> map) {
			this.map = map;
		}

		public UserInfo() {
			isLogin = false;
			isMember = true;
			isManager = false;
			map = new HashMap<String,Object>();
		}

        public String getIdcard() {
            return idcard;
        }

        public void setIdcard(String idcard) {
            this.idcard = idcard;
        }
	}
}

package Database;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDataDao {

	HibernateTemplate hibernate;
	
	
	
	@Transactional
	public int Insert(UserData userdata)
	{
		try {
			hibernate.get(UserData.class, userdata.getUsername());
			hibernate.save(userdata);
		}
		catch(Exception w)
		{
			System.out.println("Insert Exception===="+w.getMessage());
			return 1;
		}
		
		return 0;
		
	}
	
	
	public int check(String username , String password)
	{
		try {
		if(null!=hibernate.get(UserData.class, username))
		{
			System.out.println("found username!!!!!!!!");
		   if(hibernate.get(UserData.class, username).getPassword().equals(password))
		   {
			   System.out.println("foundlogin!!!!!!!!");
			   return 1;
		   }
		}
		}catch(Exception e)
		{
			return 0;
		}
		return 0;
	}
	
	
	public HibernateTemplate getHibernate() {
		return hibernate;
	}

	public void setHibernate(HibernateTemplate hibernate) {
		this.hibernate = hibernate;
	}
	
	
	
}

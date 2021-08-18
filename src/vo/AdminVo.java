package vo;

public class AdminVo {
	//field
	private int admin_num;     
	private String admin_name; 
	private String admin_id;
	private String admin_pwd;
	private String admin_dong;
	private String admin_birth;
	private String admin_tel;
	
	
	
	//construct
	public AdminVo() {};
	
	
	public AdminVo(int admin_num, String admin_name, String admin_id, String admin_pwd, String admin_dong,
			String admin_birth, String admin_tel) {
		super();
		this.admin_num = admin_num;
		this.admin_name = admin_name;
		this.admin_id = admin_id;
		this.admin_pwd = admin_pwd;
		this.admin_dong = admin_dong;
		this.admin_birth = admin_birth;
		this.admin_tel = admin_tel;
	}

	//get set
	public int getAdmin_num() {
		return admin_num;
	}

	public void setAdmin_num(int admin_num) {
		this.admin_num = admin_num;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_pwd() {
		return admin_pwd;
	}

	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}

	public String getAdmin_dong() {
		return admin_dong;
	}

	public void setAdmin_dong(String admin_dong) {
		this.admin_dong = admin_dong;
	}

	public String getAdmin_birth() {
		return admin_birth;
	}

	public void setAdmin_birth(String admin_birth) {
		this.admin_birth = admin_birth;
	}

	public String getAdmin_tel() {
		return admin_tel;
	}

	public void setAdmin_tel(String admin_tel) {
		this.admin_tel = admin_tel;
	}

	//toString
	@Override
	public String toString() {
		return "AdminVo [admin_num=" + admin_num + ", admin_name=" + admin_name + ", admin_id=" + admin_id
				+ ", admin_pwd=" + admin_pwd + ", admin_dong=" + admin_dong + ", admin_birth=" + admin_birth
				+ ", admin_tel=" + admin_tel + "]";
	}
	
	
	
}

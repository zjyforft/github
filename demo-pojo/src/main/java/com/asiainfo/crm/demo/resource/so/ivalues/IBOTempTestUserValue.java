package resource.so.ivalues;
import com.ai.appframe2.common.DataStructInterface;
import java.sql.Timestamp;
public interface IBOTempTestUserValue extends DataStructInterface{

  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_Name = "NAME";
  public final static  String S_Age = "AGE";
  public final static  String S_Tel = "TEL";
  public final static  String S_Qq = "QQ";
  public final static  String S_Sex = "SEX";
  public final static  String S_Id = "ID";
  public final static  String S_Addr = "ADDR";
  public final static  String S_Mail = "MAIL";


public Timestamp getBirthday();

public String getName();

public long getAge();

public String getTel();

public String getQq();

public String getSex();

public long getId();

public String getAddr();

public String getMail();


public  void setBirthday(Timestamp value);

public  void setName(String value);

public  void setAge(long value);

public  void setTel(String value);

public  void setQq(String value);

public  void setSex(String value);

public  void setId(long value);

public  void setAddr(String value);

public  void setMail(String value);
}

package resource.so.bo;

import java.sql.*;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.DataType;


public class BOTempTestUserBean extends DataContainer implements DataContainerInterface, resource.so.ivalues.IBOTempTestUserValue {

  private static String  m_boName = "resource.so.bo.BOTempTestUser";



  public final static  String S_Birthday = "BIRTHDAY";
  public final static  String S_Name = "NAME";
  public final static  String S_Age = "AGE";
  public final static  String S_Tel = "TEL";
  public final static  String S_Qq = "QQ";
  public final static  String S_Sex = "SEX";
  public final static  String S_Id = "ID";
  public final static  String S_Addr = "ADDR";
  public final static  String S_Mail = "MAIL";

  public static ObjectType S_TYPE = null;
  static{
    try {
      S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
    }catch(Exception e){
      throw new RuntimeException(e);
    }
  }
  public BOTempTestUserBean() throws AIException{
      super(S_TYPE);
  }

 public static ObjectType getObjectTypeStatic() throws AIException{
   return S_TYPE;
 }

 public void setObjectType(ObjectType  value) throws AIException{
   //��������������������ҵ���������
   throw new AIException("Cannot reset ObjectType");
 }


  public void initBirthday(Timestamp value){
     this.initProperty(S_Birthday,value);
  }
  public  void setBirthday(Timestamp value){
     this.set(S_Birthday,value);
  }
  public  void setBirthdayNull(){
     this.set(S_Birthday,null);
  }

  public Timestamp getBirthday(){
        return DataType.getAsDateTime(this.get(S_Birthday));
  
  }
  public Timestamp getBirthdayInitialValue(){
        return DataType.getAsDateTime(this.getOldObj(S_Birthday));
      }

  public void initName(String value){
     this.initProperty(S_Name,value);
  }
  public  void setName(String value){
     this.set(S_Name,value);
  }
  public  void setNameNull(){
     this.set(S_Name,null);
  }

  public String getName(){
       return DataType.getAsString(this.get(S_Name));
  
  }
  public String getNameInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Name));
      }

  public void initAge(long value){
     this.initProperty(S_Age,new Long(value));
  }
  public  void setAge(long value){
     this.set(S_Age,new Long(value));
  }
  public  void setAgeNull(){
     this.set(S_Age,null);
  }

  public long getAge(){
        return DataType.getAsLong(this.get(S_Age));
  
  }
  public long getAgeInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Age));
      }

  public void initTel(String value){
     this.initProperty(S_Tel,value);
  }
  public  void setTel(String value){
     this.set(S_Tel,value);
  }
  public  void setTelNull(){
     this.set(S_Tel,null);
  }

  public String getTel(){
       return DataType.getAsString(this.get(S_Tel));
  
  }
  public String getTelInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Tel));
      }

  public void initQq(String value){
     this.initProperty(S_Qq,value);
  }
  public  void setQq(String value){
     this.set(S_Qq,value);
  }
  public  void setQqNull(){
     this.set(S_Qq,null);
  }

  public String getQq(){
       return DataType.getAsString(this.get(S_Qq));
  
  }
  public String getQqInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Qq));
      }

  public void initSex(String value){
     this.initProperty(S_Sex,value);
  }
  public  void setSex(String value){
     this.set(S_Sex,value);
  }
  public  void setSexNull(){
     this.set(S_Sex,null);
  }

  public String getSex(){
       return DataType.getAsString(this.get(S_Sex));
  
  }
  public String getSexInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Sex));
      }

  public void initId(long value){
     this.initProperty(S_Id,new Long(value));
  }
  public  void setId(long value){
     this.set(S_Id,new Long(value));
  }
  public  void setIdNull(){
     this.set(S_Id,null);
  }

  public long getId(){
        return DataType.getAsLong(this.get(S_Id));
  
  }
  public long getIdInitialValue(){
        return DataType.getAsLong(this.getOldObj(S_Id));
      }

  public void initAddr(String value){
     this.initProperty(S_Addr,value);
  }
  public  void setAddr(String value){
     this.set(S_Addr,value);
  }
  public  void setAddrNull(){
     this.set(S_Addr,null);
  }

  public String getAddr(){
       return DataType.getAsString(this.get(S_Addr));
  
  }
  public String getAddrInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Addr));
      }

  public void initMail(String value){
     this.initProperty(S_Mail,value);
  }
  public  void setMail(String value){
     this.set(S_Mail,value);
  }
  public  void setMailNull(){
     this.set(S_Mail,null);
  }

  public String getMail(){
       return DataType.getAsString(this.get(S_Mail));
  
  }
  public String getMailInitialValue(){
        return DataType.getAsString(this.getOldObj(S_Mail));
      }


 
 }


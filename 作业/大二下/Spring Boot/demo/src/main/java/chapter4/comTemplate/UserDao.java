package chapter4.comTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class UserDao {
    private JdbcTemplate JdbcTemplate;
    private static String tableName="student";
    public JdbcTemplate getJdbcTemplate(){
        return JdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.JdbcTemplate=jdbcTemplate;
    }
    public int getNumber(){
        System.out.println("第三步,我是dao！");
        String sql=String.format("select count(*) from %s;",tableName);
        int num=this.JdbcTemplate.queryForObject(sql,Integer.class);
        return num;
    }
public void insertUpdate(User user){
        int id=user.getId();
        String username= user.getName();
        int age=user.getAge();

//        for insert
//        String sql=String.format("insert into %s values(?,?,?);",tableName);
//        this.JdbcTemplate.update(sql,new Object[]{id,username,age});

//    for insert edit
//    String sql=String.format("update %s set age=22 where id = %s",tableName,id);
//        this.JdbcTemplate.update(sql);

//    for insert del
//    String sql=String.format("delete from %s where id = %s",tableName,id);
//        this.JdbcTemplate.update(sql);


    //    String sql=String.format("select * from %s;",tableName);
//    List<Map<String,Object>> result=this.JdbcTemplate.queryForList(sql);
//    System.out.println(result);

//插入数据
//    String sql=String.format(" insert into %s values(?,?,?)",tableName);
//    System.out.println(sql);
//    this.JdbcTemplate.update(sql,new Object[]{user.getId(),user.getName(),user.getAge()});
}

//删除数据
public void updateDelete(User user){
    String sql=String.format("delete from %s where id = ? ;",tableName);
    System.out.println(sql);
    this.JdbcTemplate.update(sql,new Object[]{user.getId()});
}

//输出所有
public void findAllMap(){
    String sql=String.format("select * from %s",tableName);
    System.out.println(sql);
    List<Map<String,Object>> result=this.JdbcTemplate.queryForList(sql);
    for (Map<String,Object>each:result){
        for(String item:each.keySet()){
            System.out.print(item+"->"+each.get(item).toString()+",");
        }
        System.out.println();
    }
}

}

package Role;
import java.util.Scanner;

public class Admin {
    int id;
    String password;
    String name;
    int age;
    String limit; //管理员权限

    public void introduce(){

        System.out.println("----------------------------");
        System.out.println("管理员id：" + id + "\n姓名：" +name + "\n年龄：" + age + "\n管理员权限：" + limit);
    }

    public void init(){

        System.out.println("----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入管理员id：");
        id = sc.nextInt();
        System.out.print("请输入密码：");
        password = sc.next();
        System.out.print("请输入姓名：");
        name = sc.next();
        System.out.print("请输入年龄：");
        age = sc.nextInt();
        System.out.print("请输入管理员权限：");
        limit = sc.next();
    }

    public void modify_password(){

        System.out.println("-----------修改密码-----------");
        int id_m;
        String password_m;

        while(true){

            Scanner sc = new Scanner(System.in);
            System.out.print("请输入管理员id：");
            id_m = sc.nextInt();

            System.out.print("请输入旧密码：");
            password_m = sc.next();

            if(id_m == id && password_m.equals(password)){

                System.out.print("请输入新密码：");
                password = sc.next();
                System.out.println("密码修改成功！");
                break;
            }
            System.out.println("账户或密码输入错误，请重新输入！");
        }
    }

}



class TestAdministrator {

    public static void main(String[] args) {

        Admin adm1 = new Admin();
        adm1.init();

        Admin adm2 = new Admin();
        adm2.init();

        adm1.introduce();
        adm2.introduce();

        adm1.modify_password();
    }


    public class Manage_account{


    }

    public class Permission_setting {

    }


    public class Course_management {

    }
}


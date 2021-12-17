package compositeMode.transparentWay;

public class test {
    public static void main(String[] args) {
        People boss = new Manager("老板", "唱怒放的生命");
        People HR = new Employee("人力资源", "聊微信");
        People PM = new Manager("产品经理", "不知道干啥");
        People CFO = new Manager("财务主管", "看剧");
        People CTO = new Manager("技术主管", "划水");
        People UI = new Employee("设计师", "画画");
        People operator = new Employee("运营人员", "兼职客服");
        People webProgrammer = new Employee("程序员", "学习设计模式");
        People backgroundProgrammer = new Employee("后台程序员", "CRUD");
        People accountant = new Employee("会计", "背九九乘法表");
        People clerk = new Employee("文员", "给老板递麦克风");
        boss.addEmployee(HR);
        boss.addEmployee(PM);
        boss.addEmployee(CFO);
        PM.addEmployee(UI);
        PM.addEmployee(CTO);
        PM.addEmployee(operator);
        CTO.addEmployee(webProgrammer);
        CTO.addEmployee(backgroundProgrammer);
        CFO.addEmployee(accountant);
        CFO.addEmployee(clerk);
        boss.check();
    }
}

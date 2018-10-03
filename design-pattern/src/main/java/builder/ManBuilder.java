package builder;

/**
 * Created by teemper on 2018/10/4, 0:39.
 *
 * @author Zed.
 * github:https://github.com/twentyworld/
 * <p>
 * copy as you like, but with these words.
 * please kindly write to teemper@163.com if anthing.
 * from win.
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        person = new Person();//创建一个person实例，用于调用set方法
    }

    public void buildBody() {
        person.setBody("建造身体部分");
    }

    public void buildFoot() {
        person.setFoot("建造四肢部分");
    }

    public void buildHead() {
        person.setHead("建造头部部分");
    }

    public Person buildPerson() {
        return person;//返回一个person实例
    }

}
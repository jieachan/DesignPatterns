package cn.mrxccc.bridge;

/**
 * @author mrxccc
 * @create 2020/9/23
 */
public class SimpleCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("快充");
    }
}
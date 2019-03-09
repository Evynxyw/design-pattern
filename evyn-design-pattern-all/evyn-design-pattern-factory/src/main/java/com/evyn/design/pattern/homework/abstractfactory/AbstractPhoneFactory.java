package com.evyn.design.pattern.homework.abstractfactory;

/**
 * @ClassName AbstractPhoneFactory
 * @Description:
 * @Author xyw
 * @Date 2019/3/9 18:44
 * @Version 1.0
 */
public class AbstractPhoneFactory {
    public static void main(String[] args) {
        MobilePhoneFactory appleFactory = new AppleAbstractPhoneFactory();
        appleFactory.generatePhone().call();
        appleFactory.phoneBill().freeBill();

        MobilePhoneFactory xmFactory = new XMAbstractPhoneFactory();
        xmFactory.generatePhone().call();
        xmFactory.phoneBill().freeBill();

        MobilePhoneFactory nokiaFactory = new NokiaAbstractPhoneFactory();
        nokiaFactory.generatePhone().call();
        nokiaFactory.phoneBill().freeBill();

    }
}

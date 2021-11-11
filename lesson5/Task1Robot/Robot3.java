package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot3 implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot3(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot3(){}

    public ToshibaHead getHead(ToshibaHead head3){
        return head3;
    }

    public void setHead (ToshibaHead head3){
        this.head = head3;
    }

    public SamsungHand getHand(SamsungHand hand3){
        return hand3;
    }

    public void setHand (SamsungHand hand3){
        this.hand = hand3;
    }

    public SonyLeg getLeg(SonyLeg leg3){
        return leg3;
    }

    public void setLeg (SonyLeg leg3){
        this.leg = leg3;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }



}

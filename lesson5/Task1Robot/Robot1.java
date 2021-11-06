package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Robot1 implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot1(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot1(){}

    public SamsungHead getHead(SamsungHead head1){
        return head1;
    }

    public void setHead (SamsungHead head1){
        this.head = head1;
    }

    public SonyHand getHand(SonyHand hand1){
        return hand1;
    }

    public void setHand (SonyHand hand1){
        this.hand = hand1;
    }

    public ToshibaLeg getLeg(ToshibaLeg leg1){
        return leg1;
    }

    public void setLeg (ToshibaLeg leg1){
        this.leg = leg1;
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

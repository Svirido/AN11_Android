package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;

public class Robot2 implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot2(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot2(){}

    public SonyHead getHead(SonyHead head2){
        return head2;
    }

    public void setHead (SonyHead head2){
        this.head = head2;
    }

    public ToshibaHand getHand(ToshibaHand hand2){
        return hand2;
    }

    public void setHand (ToshibaHand hand2){
        this.hand = hand2;
    }

    public SamsungLeg getLeg(SamsungLeg leg2){
        return leg2;
    }

    public void setLeg (SamsungLeg leg2){
        this.leg = leg2;
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

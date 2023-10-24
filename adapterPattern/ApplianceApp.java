package adapterPattern;

public class ApplianceApp {
    public static void main(String[] args){

        //laptop
        Laptop laptop = new Laptop();
        PowerOutlet lapTopRc = new LaptopAdapter(laptop);

        //ref
        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorRc = new RefrigeratorAdapter(refrigerator);

        //smartphone
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneRc = new SmartphoneAdapter(smartphoneCharger);

        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        System.out.println();
        //plugging in the appliances
        System.out.println(lapTopRc.plugIn()); //laptop
        System.out.println(refrigeratorRc.plugIn()); //refrigerator
        System.out.println(smartphoneRc.plugIn()); //smartPhone

        System.out.println();
        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());

        System.out.println();

        //press button up
        System.out.println(tvRc.pressPlusButton());
        System.out.println(airConRc.pressPlusButton());
        System.out.println(speakerRc.pressPlusButton());

    }
}

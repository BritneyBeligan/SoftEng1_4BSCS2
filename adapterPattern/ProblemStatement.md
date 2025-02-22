Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

Adaptee Objects:

Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

Target Object:

PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

Adapter Objects:

LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().
In your solution you must provide the following in your Github link account:

  Problem statement (description of the problem. Just copy what is stated here.
  UML Class Diagram
  Uploaded java codes for the solution.

  ![Beligan_UML_Diagram](https://github.com/BritneyBeligan/SoftEng1_4BSCS2/assets/142373706/127e4506-0ca7-485a-a130-2da0ac70b714)

![output_lab 6](https://github.com/BritneyBeligan/SoftEng1_4BSCS2/assets/142373706/cc3bea4e-6316-42c9-9d53-6541f04a3369)

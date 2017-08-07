# Overview
This sample shows how some code used in an application can be unit-tested using the JUnit support library. 

# Usage
This application has no other purpose than to be tested. You can execute it as a regular MicroEJ application.<br />
It's actually a BackgroundService that will display a message on the console when started.<br>
To unit-test the code inside this application, you simply need to:
## Trigger at build time
1. Import a Virtual Device, against which the test will be run.
2. Define the ant property `target.platform.dir` to point to this Virtual Device in the repository. <br />
	1. Press **Window->Preferences**, go to **Ant -> Runtime** <br />
	2. Select Add Property <br />
	3. Set **Name=target.platform.dir** <br />
	4. Set **Value=the path of the VD** E.g. `C:\Users\username\.microej\repositories\MicroEJ-Studio-4.1.0\1.6\sd001` <br />
3. Build the application using "Build selected sandbox application", this will trigger the compilation, packaging as a WPK, and unit testing of this project.<br />
After test execution, the test report will be located into `target~/test/html/test/junit-noframes.html`

## Run on the simulator
1. Right Click on the example to run `src-adpgenerated/junit/java/com.microej.examples.junit.sampleservice/src-adpgenerated/junit/java/com/microej/examples/junit/sampleservice/_AllTests_TestMyLib.java` file
2. Select **Run as -> MicroEJ Application**
3. Select your platform 
4. Press **Ok**

## Run on the device (not suitable for virtual devices)
1. Right Click on the example to build `src-adpgenerated/junit/java/com.microej.examples.junit.sampleservice/src-adpgenerated/junit/java/com/microej/examples/junit/sampleservice/_AllTests_TestMyLib.java` file
2. Select **Run as -> Run Configuration** 
3. Select **MicroEJ Application** configuration kind
4. Click on **New launch configuration** icon
5. In **Execution** tab
	1. In **Target** frame, in **Platform** field, select a relevant platform (but not a virtual device)
	2. In **Execution** frame
		1. Select **Execute on Device**
		2. In **Settings** field, select **Build & Deploy**
6. Press **Apply**
7. Press **Run**
8. Copy the generated `.out` file path
9. Flash your device

# Requirements
  - EDC-1.2 or higher
  - Wadapps Framework 1.2.0 or higher

# Dependencies
_All dependencies are retrieved transitively by Ivy resolver_.

# Source
N/A

# Restrictions
None.
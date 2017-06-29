<!--
	Markdown
-->

# Overview
This sample shows how some code used in an application can be unit-tested using the JUnit support library. 

# Usage
This application has no other purpose than to be tested. You can execute it as a regular MicroEJ application.<br>
It's actually a BackgroundService that will display a message on the console when started.<br>
To unit-test the code inside this application, you simply need to:
<ul>
<li> Import a Virtual Device, against which the test will be run.
<li> Define the ant property `target.platform.dir` to point to this Virtual Device in the repository. <br>
E.g. `target.platform.dir=C:\Users\username\.microej\repositories\MicroEJ-Studio-4.1.0\1.6\sd001`
<li> Build the application using "Build selected sandbox application", this will trigger the compilation, packaging as a WPK, and unit testing of this project.<br>
After test execution, the test report will be located into `target~/test/html/test/junit-noframes.html`
</ul> 
 
# Requirements
  - EDC-1.2 or higher
  - Wadapps Framework 1.2.0 or higher

# Dependencies
_All dependencies are retrieved transitively by Ivy resolver_.

# Source
N/A

# Restrictions
None.
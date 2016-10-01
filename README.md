IntDefs
=======
Android constants wrapped in `@IntDef` annotations.

Not all of the constants... just the ones that would usually be used in `switch` statements. 

![ ](/MotionEventAction.gif)

Usage
=====
Currently there are 3 annotations implemented in the library:
 
 1. `@Visibility`
 2. `@MotionEventAction`
 3. `@MotionEventAction_Simple`
 
Add the annotation to a variable or to the method (result of the method to be exact) to specify the possible values for it.


Including In Your Project
-------------------------

1. If your `minSdk` is 23 or higher use this:

  ```xml
  dependencies {
      compile 'com.bartoszlipinski.intdefs:intdefs-v23:1.0.0'
  }
  ```
  
2. Otherwise if your `minSdk` is 14 or higher use this:

  ```xml
  dependencies {
      compile 'com.bartoszlipinski.intdefs:intdefs-v14:1.0.0'
  }
  ```
  
3. Otherwise if your `minSdk` is 9 or higher use this:

  ```xml
  dependencies {
      compile 'com.bartoszlipinski.intdefs:intdefs-v9:1.0.0'
  }
  ```

Contributions
-------------
If you think another set of constants should be included in the library, issues and pull requests are welcome.

Developed by
============
 * Bartosz Lipiński

License
=======

    Copyright 2016 Bartosz Lipiński
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

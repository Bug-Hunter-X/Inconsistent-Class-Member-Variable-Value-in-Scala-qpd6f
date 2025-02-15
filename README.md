# Inconsistent Class Member Variable Value in Scala

This repository demonstrates an uncommon bug in Scala related to the inconsistent behavior of a class instance's member variable value across different method calls.  The issue is subtle and might not be immediately apparent. The bug is observed when the value of the member variable appears to change unpredictably between consecutive method calls. This issue is specifically caused by the compiler optimizations which change how the class instance works.

## Bug Description

The `MyClass` class has a member variable `x` and a method `myMethod`.  The bug manifests in the unpredictable behavior of the `x` variable.  The expected outcome is that `x` remains constant at 5 throughout the execution.  However, due to compiler optimizations, the value of `x` might appear to change unintentionally. This can be related to how the compiler optimizes the code and handles the instances of the class.

## Solution

The solution avoids relying on the implicit behavior of the class, providing clarity and ensuring consistent results. This would involve ensuring the value is clearly initialized and not altered during various method calls. In addition, ensuring the value of x is not changed after being initialized could solve the issue.
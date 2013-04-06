# Encoding Guard for Java

Prevents accidental encoding conversions of Java source code by making it
uncompilable if the encoding is changed.

Requires that the expected encoding of the source code is hard coded into your
build script.

The current encoding of the source code is UTF-8.

Test it out as follows:

    ant compile

Yields `BUILD SUCCESSFUL`.

Now convert the .java files encoding and try to compile (requires `iconv` on
your path):

    ant -DfromEncoding=UTF-8 -DtoEncoding=ISO-8859-15 switch-encoding
    ant compile

Yields `BUILD FAILED`.

## How it works

The compilation failure for the wrong encoding is provided by either:

* Making the character literal for € unrepresentable in the wrong encodings.
* Utilizing Java's requirement that all case statements within a switch
  statement must be unique.
This contains some proposed additions to Xtext.
The Xtext site is at https://github.com/eclipse/xtext
--------------------------------
It would be very nice if xtext allowed a preprocessor to modify the input to the parser. We could write a lexer completely by hand but usually we want the lexer to be derived from the grammar but in a more customised way than currently allowed by Xtext.

Therefore this page is looking at the possibilities for customising the lexer. Examples or the need for this include:

    When we need a preprocessor.
    When we are adapting an existing grammar to use with xtext (for example in one of my projects I need virtual semicolons inserted after some closing braces).
    When we need to implement macroes in out language.
    When indents (whitespace) is used to indicate blocks.

What I would really like, in order to do these things, is a preprocessor between the lexer and the parser.
----------------------------------
Using whitespace to indicate blocks - Python-like syntax.

This proposes an alternative common.Terminals here: https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/common2/PythonTerminals.xtext
When the user uses this in the grammar then it is proposed that this token source is used:
https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java

The effect of this is when the sourcecode contains whitespace like this:

a
  b
    c
  d

Then 'phantom tokens' will be automatically added wich will be used by the parser instead of trying to make whitespace significant in the grammer. So the above input will look to the parser like:

a
  BEGIN b
    BEGIN c
  END d
END
<p>This contains some proposed additions to <a href="https://github.com/eclipse/xtext">Xtext</a>.</p>
<p>Xtext is a very poweful way to create a project IDE from a grammar but I would like some additional capabilities. I will put some small demonstrator projects here in the hope of perswaiding the Xtext team to include these capabilities into Xtext. </p>
<h2>Preprocessor</h2>
<p>It would be very nice if xtext allowed a preprocessor to modify the input to the parser. We could write a lexer completely by hand but usually we want the lexer to be derived from the grammar but in a more customised way than currently allowed by Xtext.</p>
<p>Therefore this page is looking at the possibilities for customising the lexer. Examples or the need for this include:</p>
<p> When we need a preprocessor.<br />
  When we are adapting an existing grammar to use with xtext (for example in one of my projects I need virtual semicolons inserted after some closing braces).<br />
  When we need to implement macroes in out language.<br />
  When indents (whitespace) is used to indicate blocks.</p>
<p>What I would really like, in order to do these things, is a preprocessor between the lexer and the parser.</p>
<h3>Python-like syntax</h3>
<p>Such as using whitespace to indicate blocks.</p>
<p>I have drafted out code to do this in this project. </p>
<p>This proposes an alternative common.Terminals <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/common2/PythonTerminals.xtext">here</a></p>
<p>  When the user uses this in the grammar then it is proposed that <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">this token source</a> is used.</p>
<p>The effect of this is when the sourcecode contains whitespace like this:</p>
<table>
  <tr>
    <td>a</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>b</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>c</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>d</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p>Then 'phantom tokens' will be automatically added wich will be used by the parser instead of trying to make whitespace significant in the grammer. So the above input will look to the parser like:</p>
<table>
  <tr>
    <td>a</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>BEGIN b</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>BEGIN c</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>END d</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>END</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
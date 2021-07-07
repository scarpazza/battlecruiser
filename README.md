# battlecruiser
Restoration and modern usage of vintage IBM M 122-key a.k.a. "battlecruiser" keyboards 

The goal of this project is to repurpose an old battlecruiser keyboard and reprogram it to serve the needs of developer running predominantly emacs on linux systems, exposed via Microsoft Remote Desktop.

Photos of the restoration are available at https://imgur.com/a/aTVRmuB



## Soarer's converter configuration

In file m122-emacs.sc, find my Soarer's configuration.

The goal of this configuration is for the keyboard to generate easily re-bindable emacs sequences that survive across Microsoft Remote Desktop and X-Windows servers.

I chose to generate sequences of two characters, where the first one is always Control-comma (^,), and the second is either a digit or a letter:

* I'm remapping the "extra function keys" (10 grey keys to the left of the alphanumeric area) to "^, <digit>" for with digit = {1, 2, 3, ..., 9, 0}.
  Note that the last key, EXTRA_F10, generates sequence "^, 0".
* I'm remapping function keys F13-F24 (i.e., the 12 keys above the traditional F1-F12 keys) to "^, <letter>" for letter = {A, B, ..., L}

## Layouts

[http://www.keyboard-layout-editor.com/##@_name=IBM%20InfoWindow%20II%20Model%20M%20122-key%20keyboard,%20P%2F%2FN%201395660%20-%20original%20layout&author=Daniele%20Paolo%20Scarpazza%3B&@_x:3.5&a:6%3B&=F13&=F14&=F15&=F16&=F17&=F18&=F19&=F20&=F21&=F22&=F23&_a:2%3B&=F24%0A%0A%0A%0A+Cr%3B&@_x:3.5&a:6%3B&=F1&=F2&=F3&=F4&=F5&=F6&=F7&=F8&=F9&=F10&=F11&=F12%3B&@_y:0.7999999999999998&a:4%3B&=SysRq%0AAttn&_a:3%3B&=%0A%0A%0A%0AClear&_x:0.5&a:4%3B&=~%0A%60&=%7C%0A1&=%2F@%0A2&=%23%0A3&=$%0A4&=%25%0A5&=%C2%AC%0A6&=%2F&%0A7&=*%0A8&=(%0A9&=)%0A0&=%2F_%0A-&=+%0A%2F=&_a:6&f:5&w:2%3B&=%E2%86%90&_x:0.25&a:7%3B&=%E2%87%A4&_f:3%3B&=Dup&_a:3%3B&=%0A%0A%0A%0AJump&_x:0.25&a:7%3B&=&=&=&=%3B&@_a:6%3B&=Insert&_a:4%3B&=ErInp&_x:0.5&a:6&f:6&w:1.5%3B&=%E2%87%A5&_a:4&f:3%3B&=Q&=W&=E&=R&=T&=Y&=U&=I&=O&=P&=!%0A%C2%A2&=%C2%A6%0A%5C&_x:0.25&w:1.25&h:2&w2:1.5&h2:1&x2:-0.25%3B&=Field%0A%0A%0A%0A%0A%0AExit&_x:0.25&a:7&f:5%3B&=%E2%86%B5&_f:3%3B&=Insert&=Delete&_x:0.25&a:4%3B&=7&=8&=9&=Field%0A%0A%0A%0A%0A%0A-%3B&@_a:6%3B&=Print&_a:2%3B&=Help%0A%0A%0A%0AHex&_x:0.5&a:6&w:1.25&w2:1.75&l:true%3B&=%E2%87%AA&_x:0.5&a:4%3B&=A&=S&=D&=F&=G&=H&=J&=K&=L&=%2F:%0A%2F%3B&=%22%0A'&=%7D%0A%7B&_x:2.5%3B&=Roll%E2%86%91%0A%E2%86%91&_x:1.25%3B&=4&=5&=6&_a:7%3B&=%3B&@=&_a:2%3B&=Play%0A%0A%0A%0ATest&_x:0.5&a:6&w:1.25%3B&=%E2%87%A7&_a:4%3B&=%3E%0A%3C&=Z&=X&=C&=V&=B&=N&=M&=,%0A,&=.%0A.&=%3F%0A%2F%2F&_a:6&w:2.75%3B&=%E2%87%A7%20Shift&_x:0.25&a:7%3B&=%E2%86%90&_a:3%3B&=Rule%0A%0A%0A%0AHome&_a:7%3B&=%E2%86%92&_x:0.25&a:4%3B&=1&=2&=3&_h:2%3B&=Field%0A%0A%0A%0A%0A%0A+%3B&@_a:6%3B&=Setup&_a:2%3B&=Record%0A%0A%0A%0APause&_x:0.5&w:1.5%3B&=Reset%0A%0A%0A%0AQuit&_x:1&a:6&w:1.5%3B&=Alt&_a:7&w:6.75%3B&=&_a:6&w:1.5%3B&=Alt&_x:1.25&w:1.5%3B&=Enter&_x:1.25&a:4%3B&=Roll%E2%86%93%0A%E2%86%93&_x:1.25&w:2%3B&=0%0AIns&=.%0ADel](Original M122 layout)
  
[http://www.keyboard-layout-editor.com/##@@_x:3.5&c=%23ffcccc&t=%23ff0000&a:7%3B&=%5E,%20A&=%5E,%20B&=%5E,%20C&=%5E,%20D&=%5E,%20E&=%5E,%20F&=%5E,%20G&=%5E,%20H&=%5E,%20I&=%5E,%20J&=%5E,%20K&=%5E,%20L%3B&@_x:3.5&c=%23cccccc&t=%23000000&a:6%3B&=F1&=F2&=F3&=F4&=F5&=F6&=F7&=F8&=F9&=F10&=F11&=F12%3B&@_y:0.7999999999999998&c=%23ffcccc&a:7%3B&=Esc&=%5E,%201&_x:0.5&c=%23cccccc&a:4%3B&=~%0A%60&=%7C%0A1&=%2F@%0A2&=%23%0A3&=$%0A4&=%25%0A5&_c=%23ccffcc&t=%23ff0000%3B&=%5E%0A6&_c=%23cccccc&t=%23000000%3B&=%2F&%0A7&=*%0A8&=(%0A9&=)%0A0&=%2F_%0A-&=+%0A%2F=&_a:6&f:5&w:2%3B&=%E2%86%90&_x:0.25&c=%23ccffcc&f:3%3B&=Insert&_a:7%3B&=Home&=PgUp&_x:0.25&c=%23ffcccc%3B&=&=&_c=%23cccccc%3B&=&=%3B&@_c=%23ffcccc%3B&=%5E,%202&=%5E,%203&_x:0.5&c=%23cccccc&a:6&f:6&w:1.5%3B&=%E2%87%A5&_a:4&f:3%3B&=Q&=W&=E&=R&=T&=Y&=U&=I&=O&=P&_c=%23ccffcc%3B&=%7B%0A%5B&=%7D%0A%5D&_x:0.25&t=%23ff0000&a:6&w:1.25&h:2&w2:1.5&h2:1&x2:-0.25%3B&=Enter&_x:0.25&t=%23000000%3B&=Delete&_a:7%3B&=End&=PgDn&_x:0.25&c=%23cccccc&a:4%3B&=7&=8&=9&=Field%0A%0A%0A%0A%0A%0A-%3B&@_c=%23ffcccc&a:7%3B&=%5E,%204&=%5E,%205&_x:0.5&c=%23cccccc&a:6&w:1.25&w2:1.75&l:true%3B&=%E2%87%AA&_x:0.5&a:4%3B&=A&=S&=D&=F&=G&=H&=J&=K&=L&=%2F:%0A%2F%3B&=%22%0A'&_c=%23ffcccc%3B&=%C2%A6%0A%5C&_x:2.5&c=%23cccccc&a:6%3B&=%E2%86%91&_x:1.25&a:4%3B&=4&=5&=6&_a:7%3B&=%3B&@_c=%23ffcccc%3B&=%5E,%206&=%5E,%207&_x:0.5&c=%23cccccc&a:6&w:1.25%3B&=%E2%87%A7&_c=%23FFcccc&a:4%3B&=%5E%2F_%0Aemacs%20undo&_c=%23cccccc%3B&=Z&=X&=C&=V&=B&=N&=M&_c=%23ccffcc%3B&=%3C%0A,&=%3E%0A.&_c=%23cccccc%3B&=%3F%0A%2F%2F&_a:6&w:2.75%3B&=%E2%87%A7%20Shift&_x:0.25&a:7%3B&=%E2%86%90&_c=%23ffcccc%3B&=Alt-W&_c=%23cccccc%3B&=%E2%86%92&_x:0.25&a:4%3B&=1&=2&=3&_h:2%3B&=Enter%3B&@_c=%23ffcccc&a:7%3B&=%5E,%208&=%5E,%209&_x:0.5&c=%23ccffcc&a:6&w:1.5%3B&=Ctrl&_x:1&w:1.5%3B&=Alt&_c=%23cccccc&a:7&w:6.75%3B&=&_c=%23ccffcc&a:6&w:1.5%3B&=Alt&_x:1.25&w:1.5%3B&=Ctrl&_x:1.25&c=%23cccccc%3B&=%E2%86%93&_x:1.25&w:2%3B&=0&=.](Changes to the original layout)

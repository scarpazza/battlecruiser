# Daniele Paolo Scarpazza
# 2021-07-07
# Soarer's converter configuration file for IBM keyboard, Model M 122 Part Number 1395660
# Originally shipped with the IBM InfoWindow II Terminal.
#
# Goal of this configuration is to make the keyboard generate easily re-bindable emacs sequences, that survive across Microsoft Remote Desktop and X-Windows servers
#
# Choices:
# * remap the "extra function keys" (10 grey keys to the left of the alphanumeric area) 
#   to "Control-comma <digit>" sequences, for with digit = {1,2,3,...,9,0}
# * remap the F13-F24 function keys (the 12 keys above the traditional F1-F12 keys)
#   to "Control-comma <letter>" sequences, for letter = {A,B,...L}
#
# Macro blocks are split to avoid exceeding block size limits.

# Unfinished - TO DO: Esc NumLoc left in the keypad area


# Key on the inside of the L-shaped Enter key. I recapped it as a backslash.
remapblock
EUROPE_1 BACKSLASH
endblock

# Undo key - key on the immediate right of LShift, originally backslash
macroblock
  macro EUROPE_2
    PUSH_META CLEAR_META all
    SET_META LCTRL LSHIFT
    PRESS MINUS
    CLEAR_META LCTRL LSHIFT
    POP_ALL_META
  endmacro
endblock

#
# macro block:
# Remap Extra F1 F2...F10 to Ctrl-Comma,1 Ctrl-Comma,2 ... Ctrl-Comma,0
#
macroblock

  macro EXTRA_F1
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 1
    POP_ALL_META
  endmacro

  macro EXTRA_F2
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 2
    POP_ALL_META
  endmacro

  macro EXTRA_F3
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 3
    POP_ALL_META
  endmacro

  macro EXTRA_F4
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 4
    POP_ALL_META
  endmacro

  macro EXTRA_F5
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 5
    POP_ALL_META
  endmacro


  macro EXTRA_F6
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 6
    POP_ALL_META
  endmacro

  macro EXTRA_F7
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 7
    POP_ALL_META
  endmacro

  macro EXTRA_F8
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 8
    POP_ALL_META
  endmacro

  macro EXTRA_F9
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 9
    POP_ALL_META
  endmacro

  macro EXTRA_F10
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS 0
    POP_ALL_META
  endmacro
endblock

# Remap F13...F24 to Ctrl-Comma,A ...
# This also circumvents Microsoft Remote Desktop limitations
# (it no longer forwards F13...F24 keys to the remote system).
#
# Keep separate from first macro block b/c block size limits.
#
macroblock
  macro F13
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS A
    POP_ALL_META
  endmacro

  macro F14
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS B
    POP_ALL_META
  endmacro

  macro F15
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS C
    POP_ALL_META
  endmacro

  macro F16
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS D
    POP_ALL_META
  endmacro

  macro F17
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS E
    POP_ALL_META
  endmacro

  macro F18
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS F
    POP_ALL_META
  endmacro
endblock

macroblock
  macro F19
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS G
    POP_ALL_META
  endmacro

  macro F20
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS H
    POP_ALL_META
  endmacro

  macro F21
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS I
    POP_ALL_META
  endmacro

  macro F22
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS J
    POP_ALL_META
  endmacro

  macro F23
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS K
    POP_ALL_META
  endmacro

  macro F24
    PUSH_META CLEAR_META all
    SET_META LCTRL
    DELAY 5
    PRESS COMMA
    DELAY 5
    CLEAR_META LCTRL
    DELAY 5
    PRESS L
    POP_ALL_META
  endmacro
endblock



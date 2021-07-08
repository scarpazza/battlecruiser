# Daniele Paolo Scarpazza
# 2021-07-07
# Soarer's converter configuration file for IBM keyboard, Model M 122 Part Number 1395660
# Originally shipped with the IBM InfoWindow II Terminal.
#
# Remaps the keyboard for easily bindable emacs sequences that survive across Microsoft Remote Desktop and X-Windows sessions.
#
# To learn more on design decisions, see the README.md file

remapblock
ESC       EXTRA_F1
EXTRA_F1  ESC
EUROPE_1 BACKSLASH  # Key on the inside of the L-shaped Enter key 
NUM_LOCK SLASH
PAD_PLUS ENTER
endblock


macroblock
  # Undo:
  # key on the immediate right of LShift, originally backslash
  # remapping to emacs undo (^_)
  macro EUROPE_2
    PUSH_META CLEAR_META all
    SET_META LCTRL LSHIFT
    PRESS MINUS
    CLEAR_META LCTRL LSHIFT
    POP_ALL_META
  endmacro

  # Copy - "Rule" key, in the middle of arrow keys.
  # Remapping to Alt-W (emacs copy)
  macro LANG_4
    PUSH_META CLEAR_META all
    SET_META LALT
    DELAY 5
    PRESS W
    DELAY 5
    CLEAR_META LALT
    DELAY 5
    POP_ALL_META
  endmacro

  # Original Esc key (at the position traditionally used for NumLock)
  # Remap to "Control-Comma 0"
  macro EXTRA_F1
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


# Remap Extra F2 ... F10 to Ctrl-Comma,1 Ctrl-Comma,2 ... Ctrl-Comma,9
macroblock

  macro EXTRA_F2
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

  macro EXTRA_F3
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

  macro EXTRA_F4
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

  macro EXTRA_F5
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

  macro EXTRA_F6
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

  macro EXTRA_F7
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

  macro EXTRA_F8
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

  macro EXTRA_F9
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

  macro EXTRA_F10
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
endblock

# Remap F13...F24 to Ctrl-Comma,A ...
# This also circumvents Microsoft Remote Desktop limitations
# (it no longer forwards F13...F24 keys to the remote system).
#
# Keep separate from first macro block b/c block size limits.

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

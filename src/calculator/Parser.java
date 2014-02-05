
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 05 12:00:38 CET 2014
//----------------------------------------------------

package calculator;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

import soundAPI.Sequence;
import soundAPI.SoundFactory;
import soundAPI.Tone;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 05 12:00:38 CET 2014
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\004\000\002\003" +
    "\002\000\002\003\004\000\002\004\003\000\002\005\006" +
    "\000\002\006\003\000\002\006\005\000\002\007\004\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\012\004\001\002\000\006\002\uffff\005" +
    "\uffff\001\002\000\004\002\006\001\002\000\004\002\000" +
    "\001\002\000\006\002\001\005\011\001\002\000\006\002" +
    "\ufffd\005\ufffd\001\002\000\004\006\013\001\002\000\006" +
    "\002\ufffe\005\ufffe\001\002\000\046\014\027\015\015\016" +
    "\025\017\024\020\023\021\014\022\033\023\026\024\022" +
    "\025\032\026\017\027\031\030\037\031\030\032\035\033" +
    "\020\034\034\035\016\001\002\000\004\004\ufff3\001\002" +
    "\000\004\004\ufff7\001\002\000\004\004\uffe7\001\002\000" +
    "\004\004\uffee\001\002\000\004\004\uffe9\001\002\000\006" +
    "\007\ufffb\011\ufffb\001\002\000\004\004\ufff0\001\002\000" +
    "\004\004\ufff4\001\002\000\004\004\ufff5\001\002\000\004" +
    "\004\ufff6\001\002\000\004\004\ufff1\001\002\000\004\004" +
    "\ufff8\001\002\000\004\004\uffeb\001\002\000\004\004\uffed" +
    "\001\002\000\004\004\uffef\001\002\000\004\004\ufff2\001" +
    "\002\000\004\004\uffe8\001\002\000\004\004\uffea\001\002" +
    "\000\006\007\043\011\042\001\002\000\004\004\uffec\001" +
    "\002\000\004\004\041\001\002\000\006\007\ufff9\011\ufff9" +
    "\001\002\000\046\014\027\015\015\016\025\017\024\020" +
    "\023\021\014\022\033\023\026\024\022\025\032\026\017" +
    "\027\031\030\037\031\030\032\035\033\020\034\034\035" +
    "\016\001\002\000\006\002\ufffc\005\ufffc\001\002\000\006" +
    "\007\ufffa\011\ufffa\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\002\004\001\001\000\004\003\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\004\011" +
    "\005\007\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\006\035\007\020\010\037\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\007" +
    "\043\010\037\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append (info.toString());
        m.append(" : "+message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

	private Map<String, Integer> values = new TreeMap<String, Integer> ();

	public void setValue (String name, int value) {
		values.put(name, new Integer (value));
	}
	
	public int getValue (String name) {
		int value = 0;
		if (values.containsKey(name))
			value = values.get(name).intValue();
		return value;
	}



/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Hight ::= SILENCE 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SILENCE; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Hight ::= SI 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SI; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Hight ::= SIB 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SIB; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Hight ::= LAD 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.LAD; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Hight ::= LA 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.LA; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Hight ::= LAB 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.LAB; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Hight ::= SOLD 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SOLD; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Hight ::= SOL 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SOL; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Hight ::= SOLB 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.SOLB; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Hight ::= FAD 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.FAD; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Hight ::= FA 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.FA; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Hight ::= MI 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.MI; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Hight ::= MIB 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.MIB; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Hight ::= RED 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.RED; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Hight ::= RE 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.DO; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Hight ::= REB 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.REB; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Hight ::= DOD 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.DOD; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Hight ::= DO 
            {
              Object RESULT =null;
		 RESULT = SoundFactory.Tones.DO; 
              CUP_result = getSymbolFactory().newSymbol("Hight",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Note ::= Hight DURATION 
            {
              Object RESULT =null;
		Object h = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		Float d = (Float)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = SoundFactory.createTone(h,d); 
              CUP_result = getSymbolFactory().newSymbol("Note",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Notes ::= Notes COMMA Note 
            {
              Object RESULT =null;
		Object n = (Object)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = SoundFactory.getToneList().add((Tone) n); 
              CUP_result = getSymbolFactory().newSymbol("Notes",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Notes ::= Note 
            {
              Object RESULT =null;
		Object n = (Object)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 ArrayList<Tone> l = SoundFactory.createToneList();
											   l.add((Tone) n);
											   RESULT = l; 
              CUP_result = getSymbolFactory().newSymbol("Notes",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Sequence ::= BPM BEGIN Notes END 
            {
              Object RESULT =null;
		Integer bpm = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-3)).value;
		Object n = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = SoundFactory.createSequence(bpm, (ArrayList<Tone>) n); 
              CUP_result = getSymbolFactory().newSymbol("Sequence",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Playable ::= Sequence 
            {
              Object RESULT =null;
		Object s = (Object)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = SoundFactory.getSequence(); 
              CUP_result = getSymbolFactory().newSymbol("Playable",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Plays ::= Plays Playable 
            {
              Object RESULT =null;
		Object p = (Object)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 SoundFactory.getScore().add((Sequence) p); 
              CUP_result = getSymbolFactory().newSymbol("Plays",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Plays ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Plays",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Play EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Play ::= PLAY Plays 
            {
              Object RESULT =null;
		 SoundFactory.getScore().play(); 
              CUP_result = getSymbolFactory().newSymbol("Play",0, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}

package retim;


/**
 *	Generated from IDL interface "Calculator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class CalculatorHelper
{
	public static void insert (final org.omg.CORBA.Any any, final retim.Calculator s)
	{
			any.insert_Object(s);
	}
	public static retim.Calculator extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:retim/Calculator:1.0", "Calculator");
	}
	public static String id()
	{
		return "IDL:retim/Calculator:1.0";
	}
	public static Calculator read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final retim.Calculator s)
	{
		_out.write_Object(s);
	}
	public static retim.Calculator narrow(final java.lang.Object obj)
	{
		if (obj instanceof retim.Calculator)
		{
			return (retim.Calculator)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static retim.Calculator narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (retim.Calculator)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:retim/Calculator:1.0"))
			{
				retim._CalculatorStub stub;
				stub = new retim._CalculatorStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static retim.Calculator unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (retim.Calculator)obj;
		}
		catch (ClassCastException c)
		{
				retim._CalculatorStub stub;
				stub = new retim._CalculatorStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}

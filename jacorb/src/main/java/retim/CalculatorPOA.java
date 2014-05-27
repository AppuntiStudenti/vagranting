package retim;

/**
 *	Generated from IDL interface "Calculator"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CalculatorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, retim.CalculatorOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "sum", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:retim/Calculator:1.0"};
	public retim.Calculator _this()
	{
		return retim.CalculatorHelper.narrow(_this_object());
	}
	public retim.Calculator _this(org.omg.CORBA.ORB orb)
	{
		return retim.CalculatorHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // sum
			{
				int _arg0=_input.read_long();
				int _arg1=_input.read_long();
				_out = handler.createReply();
				_out.write_long(sum(_arg0,_arg1));
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}

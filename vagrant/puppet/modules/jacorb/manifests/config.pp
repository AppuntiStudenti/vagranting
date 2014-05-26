class jacorb::config
{
  augeas { 'orb.properties':
    lens => 'Properties.lns',
    incl => '/opt/jacorb/etc/orb.properties',
    changes => [
      'set ORBInitRef.NameService /opt/jacorb/NS_Ref',
      'set jacorb.naming.ior_filename /opt/jacorb/NS_Ref',
      'set jacorb.imr.ior_file /opt/jacorb/ImR_Ref',
    ],
  }
}

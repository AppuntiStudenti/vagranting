class jacorb::config
{
  $orbProperties = '/opt/jacorb/etc/orb.properties'

  augeas { 'orb.properties':
    lens => 'Properties.lns',
    incl => $orbProperties,
    changes => [
      'set ORBInitRef.NameService /opt/jacorb/NS_Ref',
      'set jacorb.naming.ior_filename /opt/jacorb/NS_Ref',
      'set jacorb.imr.ior_file /opt/jacorb/ImR_Ref',
    ],
  } ->
  file { '/usr/lib/jvm/java-7-openjdk-amd64/lib/orb.properties':
    ensure => present,
    source => $orbProperties,
  }

  $jacorbProperties = '/opt/jacorb/etc/jacorb.properties'

  file { $jacorbProperties:
    ensure => link,
    target => '/opt/jacorb/etc/jacorb-properties.template',
  } ->
  augeas { 'jacorb.properties': 
    lens => 'Properties.lns',
    incl => $jacorbProperties,
    changes => [
      'set ORBInitRef.NameService /opt/jacorb/NS_Ref',
    ],
  }
}
